package br.edu.unoesc.dao;

import java.util.List;

import br.edu.unoesc.util.Conexao;

public abstract class GenericDao<T> extends Conexao implements CrudDao<T> {

	@Override
	public void inserir(T dado) {
		conectar();
		try {
			em.persist(dado);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		} finally {
			desconectar();
		}

	}

	@Override
	public List<T> listar(String query, Class<T> classe) {
		conectar();
		try {
			return em.createNamedQuery(query, classe).getResultList();
		} finally {
			desconectar();
		}
	}

	@Override
	public void alterar(T dado) {
		conectar();
		try {
			em.merge(dado);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		} finally {
			desconectar();
		}
	}

	@Override
	public void remover(T dado) {
		conectar();
		try {
			em.remove(dado);
			et.commit();
		} catch (Exception e) {
			et.rollback();
			e.printStackTrace();
		} finally {
			desconectar();
		}
	}

}
