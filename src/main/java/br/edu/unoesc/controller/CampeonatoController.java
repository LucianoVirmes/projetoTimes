package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.CampeonatoTimeJDBC;
import br.edu.unoesc.dao.TimeJDBC;
import br.edu.unoesc.model.Time;

@Controller
@Path("/campeonato")
public class CampeonatoController {
	@Inject
	private Result result;
	@Inject
	private TimeJDBC timejdbc;
	@Inject
	private CampeonatoTimeJDBC ctjdbc;
	
	public CampeonatoController() {
		System.out.println("passou");
	}
	@Get("/jogar")
	public void jogar() {
	
		result.include("times", timejdbc.listar(Time.listarTodos, Time.class));
	}
	@Post("/jogar")
	public void jogar(Time time1, Time time2) {
		ctjdbc.getGanhador(time1, time2);
		result.redirectTo(IndexController.class).index();
	}
}
