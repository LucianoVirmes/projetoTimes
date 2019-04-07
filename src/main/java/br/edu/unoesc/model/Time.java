package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({ @NamedQuery(name = Time.listarTodos, query = "select t from Time t") })
public class Time {
	@Id
	@GeneratedValue
	private Long codigo;
	private String nome;
	public static final String listarTodos = "buscarTodos";
	
	public Time() {
		
	}
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Time(Long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
}
