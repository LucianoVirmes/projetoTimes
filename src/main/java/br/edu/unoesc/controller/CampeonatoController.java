package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.TimeJDBC;
import br.edu.unoesc.model.Time;

@Controller
@Path("/campeonato")
public class CampeonatoController {
	@Inject
	private Result result;
	@Inject
	private TimeJDBC jdbc;

	public CampeonatoController() {
		
	}
	@Get("/jogar")
	public void jogar() {
		result.include("times", jdbc.listar(Time.listarTodos, Time.class));
	}
}
