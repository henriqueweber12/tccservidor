package br.henrique.model;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractEntityImpl implements AbstractEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	public Long getCodigo() {
		return id;
	}

	public void setCodigo(Long id) {
		this.id = id;
	}
	
	
	
}
