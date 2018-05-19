package br.henrique.bean;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.henrique.model.AbstractEntity;

public abstract class AbstractBeanImpl<T extends AbstractEntity> 
		implements AbstractBean<T>{

	@PersistenceContext(unitName="VendadeCarros")
	protected EntityManager entity;
	
	@Override
	public T salvar(T obj) throws Exception {
		if (obj.getCodigo() == null){
			return inserir(obj);
		}else {
			return update(obj); 
		}
	}
	
	@Override
	public T inserir(T obj) throws Exception {
		entity.persist(obj);
		entity.flush();
		return obj;
	}
	
	@Override
	public T update(T obj) throws Exception {
		T old = buscarPorCodigo(obj.getCodigo());
		entity.merge(obj);
		entity.flush();
		return obj;
	}
	
	@Override
	public Boolean remover(Long id) throws Exception {
		T obj = buscarPorCodigo(id);
		entity.remove(obj);
		entity.flush();
		return true;
	}
	
	public abstract Class getClasse();
	
	@Override
	public T buscarPorCodigo(Long id) throws Exception {
	 	return (T)entity.find(getClasse(), id);
	}
	
	@Override
	public List<T> buscarTodos() throws Exception {
		String sql = "Select c From " + getClasse().getSimpleName() + " c ";
		Query query = entity.createQuery(sql);
		return query.getResultList();
	}  
}
