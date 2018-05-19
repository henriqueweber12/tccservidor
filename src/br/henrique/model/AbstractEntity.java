package br.henrique.model;

import java.io.Serializable;

public interface AbstractEntity extends Serializable {

	public Long getCodigo();
	
	public void setCodigo(Long codigo);
	
}
