package br.henrique.rest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.henrique.bean.AbstractBean;
import br.henrique.bean.VeiculoBean;
import br.henrique.model.Usuario;
import br.henrique.model.Veiculo;

@RequestScoped
@Path("/veiculos")
@Produces("application/json")
@Consumes("application/json")
public class VeiculoRest extends AbstractRest<Veiculo>{

	@EJB // Faz com que o sistema inicialize a classe
	private VeiculoBean veiculoBean;
	
	@Override
	public AbstractBean<Veiculo> getBean() {
		// TODO Auto-generated method stub
		return veiculoBean;
	}
	
	@POST
	@Path("listaveiculo")
	public Response listaVeiculo(Veiculo veiculo) {
		try { 
			return Response.ok(toJson(veiculoBean.listaVeiculo(veiculo))).build();
		} catch(Exception e) {
			return Response.status(500).entity(e).build();
		}
	}

}

