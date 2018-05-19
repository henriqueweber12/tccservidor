package br.henrique.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.henrique.model.Adicionais;

@LocalBean
@Stateless
public class AdicionaisBean extends AbstractBeanImpl<Adicionais>{
	
	@Override
	public Class getClasse() {
		return Adicionais.class;
	}

}
