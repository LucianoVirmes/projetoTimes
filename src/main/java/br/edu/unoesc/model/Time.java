package br.edu.unoesc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


@Entity
@NamedQueries({ @NamedQuery(name = Time.listarTodos, query = "select t from Time t") })
public class Time {
	@Id
	@GeneratedValue
	private Long codigo;
	private String nome;
	@OneToMany(mappedBy="time", cascade=CascadeType.ALL)
	private Set<CampeonatoTime> campeonatoTime = new HashSet<>();
	public static final String listarTodos = "buscarTodos";
	
	private Integer pontuacao = 0;
	
	private Integer gol;
	
	public Time() {
		
	}
	public Integer getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Integer pontuacao) {
		this.pontuacao = pontuacao;
	}
	public Long getCodigo() {
		return codigo;
	}
	public Integer getGol() {
		return gol;
	}
	public void setGol(Integer gol) {
		this.gol = gol;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((campeonatoTime == null) ? 0 : campeonatoTime.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (campeonatoTime == null) {
			if (other.campeonatoTime != null)
				return false;
		} else if (!campeonatoTime.equals(other.campeonatoTime))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Time(Long codigo, String nome) {
		super();
		this.codigo = codigo;
		this.nome = nome;
	}
	public Set<CampeonatoTime> getCampeonatoTime() {
		return campeonatoTime;
	}
	public void setCampeonatoTime(Set<CampeonatoTime> campeonatoTime) {
		this.campeonatoTime = campeonatoTime;
	}
	
}
