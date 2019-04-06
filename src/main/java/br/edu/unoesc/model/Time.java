package br.edu.unoesc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Time {
	@Id
	@GeneratedValue
	private Long codigo;
	private String nome;
	
	
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
