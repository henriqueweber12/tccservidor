package br.henrique.rest;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import br.henrique.bean.AbstractBean;
import br.henrique.bean.UsuarioBean;
import br.henrique.model.Usuario;

@Stateless
@Path("usuarios") 
public class UsuarioRest extends AbstractRest<Usuario>{

	@EJB // Faz com que o sistema inicialize a classe
	private UsuarioBean usuarioBean;
	
	@Override
	public AbstractBean<Usuario> getBean() {
		// TODO Auto-generated method stub
		return usuarioBean;
	}
	
	@POST
	@Path("logar")
	public Response logar(Usuario usuario) {
		try {
			usuario = usuarioBean.logar(usuario);
			return Response.ok(toJson(usuario)).build();
		} catch(Exception e) {
			return Response.status(500).entity(e).build();
		}
	}
	
	@GET
	@Path("teste")
	public String teste() {
		return "teste";
	}
}

