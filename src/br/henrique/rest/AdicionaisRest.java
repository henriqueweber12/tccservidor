package br.henrique.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.henrique.bean.AbstractBean;
import br.henrique.bean.AdicionaisBean;
import br.henrique.model.Adicionais;


@RequestScoped
@Path("/adicionais")
@Produces("application/json")
@Consumes("application/json")
public class AdicionaisRest extends AbstractRest<Adicionais>{
	
	@EJB
	private AdicionaisBean adicionaisbean;
	
	@Override
	public AbstractBean<Adicionais> getBean(){
		return adicionaisbean;
	}

}
