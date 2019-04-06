package br.edu.unoesc.dao;

import java.util.List;

public interface CrudDao<T> {

	List<T> listar();
	void inserir(T dado);
	void alterar(T dado);
	void remover(T dado);
}
