package br.henrique.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.henrique.model.OrcamentoVeiculoAdicional;


@LocalBean
@Stateless
public class OrcamentoVeiculoAdicionalBean 
extends AbstractBeanImpl<OrcamentoVeiculoAdicional> {

	@Override
	public Class getClasse() {
		return OrcamentoVeiculoAdicional.class;
	}
}
