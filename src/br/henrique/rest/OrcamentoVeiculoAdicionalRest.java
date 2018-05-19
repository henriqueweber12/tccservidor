package br.henrique.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import br.henrique.bean.AbstractBean;
import br.henrique.bean.OrcamentoVeiculoAdicionalBean;
import br.henrique.model.OrcamentoVeiculoAdicional;


@RequestScoped
@Path("/orcamentoveiculoadicional")
@Produces("application/json")
@Consumes("application/json")
public class OrcamentoVeiculoAdicionalRest extends AbstractRest<OrcamentoVeiculoAdicional> {

	@EJB
	private OrcamentoVeiculoAdicionalBean orcamento_veiculo_adicionalbean;
	
	@Override
	public AbstractBean<OrcamentoVeiculoAdicional> getBean(){
		return orcamento_veiculo_adicionalbean;
	}
}
