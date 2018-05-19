package br.henrique.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.henrique.bean.AbstractBean;
import br.henrique.bean.OrcamentosBean;
import br.henrique.model.Orcamentos;

@RequestScoped
@Path("/orcamentos")
@Produces("application/json")
@Consumes("application/json")
public class OrcamentosRest extends AbstractRest<Orcamentos> {

	@EJB
	private OrcamentosBean orcamentosbean;
	
	@Override
	public AbstractBean<Orcamentos> getBean(){
		return orcamentosbean;
	}
}
