package br.henrique.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.henrique.model.Orcamentos;

@LocalBean
@Stateless
public class OrcamentosBean extends AbstractBeanImpl<Orcamentos> {

	@Override
	public Class getClasse() {
		return Orcamentos.class;
	}
}
