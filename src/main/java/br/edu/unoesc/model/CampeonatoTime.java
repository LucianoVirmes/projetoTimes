package br.edu.unoesc.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ForeignKey;

@Entity
public class CampeonatoTime {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	@ManyToOne(targetEntity = Campeonato.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "codcampeonato")
	private Campeonato campeonato;
	
	@ManyToOne(targetEntity = Time.class, fetch = FetchType.LAZY)
	@JoinColumn(name = "codtime")
	private Time time;
}
