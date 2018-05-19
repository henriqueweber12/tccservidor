package br.henrique.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class RestApplication extends Application {

//	@Override
//	public Set<Class<?>> getClasses() {
//		Set<Class<?>> resources = new HashSet<>();
//		addRestResourceClasses(resources);
//		return resources;
//	}
//	
//	private void addRestResourceClasses(Set<Class<?>> resources) { 
//		resources.add(br.henrique.rest.UsuarioRest.class);
//		resources.add(br.henrique.rest.CrossOriginResourceFilter.class);
//	}
}
