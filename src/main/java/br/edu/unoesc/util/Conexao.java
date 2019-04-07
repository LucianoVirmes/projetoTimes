package br.edu.unoesc.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Conexao {
	protected EntityManagerFactory emf = Persistence.createEntityManagerFactory("MinhaPersistencia");
	protected EntityManager em = emf.createEntityManager();
	protected EntityTransaction et = em.getTransaction();
	
	public void conectar() {
		et.begin();
	}
	public void desconectar() {
		em.close();
	}
}
