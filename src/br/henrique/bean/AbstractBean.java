package br.henrique.bean;

import java.util.List;

import br.henrique.model.AbstractEntity;

public interface AbstractBean <T extends AbstractEntity> {

	public T salvar(T obj) throws Exception;
	
	public T inserir(T obj) throws Exception;
	
	public T update(T obj) throws Exception;
	
	public Boolean remover(Long id) throws Exception;
	
	public List<T> buscarTodos() throws Exception;
	
	public T buscarPorCodigo(Long id) throws Exception;
	
}
