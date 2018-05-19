package br.henrique.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FormaPagamento extends AbstractEntityImpl{
	
	@Column (length = 50)
	private String tipo;
	@Column
	private Integer nroparcelas;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getNroparcelas() {
		return nroparcelas;
	}
	public void setNroparcelas(Integer nroparcelas) {
		this.nroparcelas = nroparcelas;
	}
	

}
