package br.henrique.rest;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.henrique.bean.AbstractBean;
import br.henrique.model.AbstractEntity;

public abstract class AbstractRest <T extends AbstractEntity>{
	
   public abstract AbstractBean<T> getBean();
   
   private Gson gson;
   
   @Path("salvar")
   @POST
   public Response salvar(T obj) {
	   try {
		   obj = getBean().salvar(obj);
		   return Response.ok(obj).build();
	   }
	   catch (Exception e) {
		   return Response.serverError().entity(e.getMessage()).build();
	   }
   }

   @Path("{codigo}")
   @DELETE
   public Response remover(@PathParam("codigo")Long codigo) {
	   try {
		   getBean().remover(codigo);
		   return Response.ok().build();
	   }
	   catch(Exception e){
		   return Response.serverError().entity(e.getMessage()).build();
	   }
   }
   
   @Path("{codigo}")
   @GET
   public Response buscarCodigo(@PathParam("codigo")Long codigo) {
	   try {
		   T obj = getBean().buscarPorCodigo(codigo);
		   return Response.ok( toJson(obj) ).build();
	   }
	   catch(Exception e){
		   return Response.serverError().entity(e.getMessage()).build();
	   }
   }
   
   @GET
   public Response buscarTodos() {
	   try {
		   List<T> lista = getBean().buscarTodos();
		   return Response.ok( toJson(lista) ).build();
	   }
	   catch(Exception e){
		   return Response.serverError().entity(e.getMessage()).build();
	   }
   }
   
   public String toJson(Object obj) {
	   if (gson == null) {
		   gson = new Gson();
	   }
	   return gson.toJson(obj);
   }
}
