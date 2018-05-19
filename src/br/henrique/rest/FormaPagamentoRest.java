package br.henrique.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.henrique.bean.AbstractBean;
import br.henrique.bean.FormaPagamentoBean;
import br.henrique.model.FormaPagamento;

@RequestScoped
@Path("/formapagamento")
@Produces("application/json")
@Consumes("application/json")
public class FormaPagamentoRest extends AbstractRest<FormaPagamento>{
	
	@EJB
	private FormaPagamentoBean forma_pagamentobean;
	
	@Override
	public AbstractBean<FormaPagamento> getBean(){
		return forma_pagamentobean;
	}

}
