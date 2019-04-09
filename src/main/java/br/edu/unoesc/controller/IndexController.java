package br.edu.unoesc.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.dao.TimeJDBC;
import br.edu.unoesc.model.Time;

@Controller
public class IndexController {
	@Inject
	Result result;
	@Inject
	TimeJDBC jdbc;
	
	@Get("/")
	public void index() {
		result.include("times", jdbc.listar(Time.listarTodos, Time.class));
	}
}
