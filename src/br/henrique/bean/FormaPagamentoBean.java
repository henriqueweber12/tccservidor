package br.henrique.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.henrique.model.FormaPagamento;

@LocalBean
@Stateless
public class FormaPagamentoBean extends AbstractBeanImpl<FormaPagamento> {

	@Override
	public Class getClasse() {
		return FormaPagamento.class;
	}
}
