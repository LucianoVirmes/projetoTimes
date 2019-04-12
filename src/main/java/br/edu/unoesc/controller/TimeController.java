package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.TimeJDBC;
import br.edu.unoesc.model.Campeonato;
import br.edu.unoesc.model.CampeonatoTime;
import br.edu.unoesc.model.Time;

@Controller
@Path("/time")
public class TimeController {
	private Result result;
	private TimeJDBC jdbc;

	public TimeController() {

	}

	@Inject
	public TimeController(Result result, TimeJDBC jdbc) {
		this.result = result;
		this.jdbc = jdbc;
	}

	@Get("/cadastro")
	public void novo() {
	}
	@Get("/excluir/{time.codigo}")
	public void excluir(Time time) {
		System.out.println(time.getCodigo());
		jdbc.remover(Time.class, time.getCodigo());
		result.redirectTo(IndexController.class).index();
	}
	@Post("/cadastro")
	public void salvar(Time time) {
		CampeonatoTime ct = new CampeonatoTime();
		ct.setTime(time);
		Campeonato campeonato = new Campeonato();
		campeonato.setCodigo(1l);
		ct.setCampeonato(campeonato);
		time.getCampeonatoTime().add(ct);
		jdbc.inserir(time);
		result.redirectTo(IndexController.class).index();
	}
}
