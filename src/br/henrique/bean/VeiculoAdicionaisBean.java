package br.henrique.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.henrique.model.VeiculoAdicionais;

@LocalBean
@Stateless
public class VeiculoAdicionaisBean extends AbstractBeanImpl<VeiculoAdicionais> {

	@Override
	public Class getClasse() {
		return VeiculoAdicionais.class;
	}
}
