package br.henrique.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.henrique.bean.AbstractBean;
import br.henrique.bean.VeiculoAdicionaisBean;
import br.henrique.model.VeiculoAdicionais;

@RequestScoped
@Path("/veiculoadicionais")
@Produces("application/json")
@Consumes("application/json")
public class VeiculoAdicionaisRest {
	
	@EJB
	private VeiculoAdicionaisBean veiculo_adicionaisbean;
	
	public AbstractBean<VeiculoAdicionais> getBean(){
		return veiculo_adicionaisbean;
	}

}
