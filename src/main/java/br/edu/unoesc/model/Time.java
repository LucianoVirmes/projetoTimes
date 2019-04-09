package br.edu.unoesc.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@NamedQueries({ @NamedQuery(name = Time.listarTodos, query = "select t from Time t") })
public class Time {
	@Id
	@GeneratedValue
	private Long codigo;
	private String nome;
	@OneToMany(mappedBy="time")
	private Set<CampeonatoTime> campeonatoTime;
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
//	public Campeonato getCampeonato() {
//		return campeonato;
//	}
//	public void setCampeonato(Campeonato campeonato) {
//		this.campeonato = campeonato;
//	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Time(Long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	
}
