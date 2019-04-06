package br.edu.unoesc.dao;

public interface CrudDao<T> {

	void inserir(T dado);
	void alterar(T dado);
	void remover(T dado);
}
