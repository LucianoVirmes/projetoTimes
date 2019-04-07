package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.TimeJDBC;
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
	@Post("/cadastro")
	public void salvar(Time time) {
		jdbc.inserir(time);
		result.redirectTo(IndexController.class).index();
	}
}
