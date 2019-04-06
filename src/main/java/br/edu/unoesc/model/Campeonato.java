package br.edu.unoesc.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Campeonato {
	@Id
	@GeneratedValue
	private Long codigo;
	private String nome;
	private Set<Time> times;
	
	
	public Campeonato() {
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
	public Set<Time> getTimes() {
		return times;
	}
	public void setTimes(Set<Time> times) {
		this.times = times;
	}
	
	public Campeonato(Long codigo, String nome, Set<Time> times) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.times = times;
	}
	
	
	
}
