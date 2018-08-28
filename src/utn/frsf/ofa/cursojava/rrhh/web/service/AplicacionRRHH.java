package utn.frsf.ofa.cursojava.rrhh.web.service;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import utn.frsf.ofa.cursojava.rrhh.web.resources.ClienteResource;

@ApplicationPath("/api")
public class AplicacionRRHH extends Application {
	@Override
	public Set<Class<?>> getClasses() {
		final Set<Class<?>> classes = new HashSet<>();
		classes.add(ClienteResource.class);
		return classes;
	}
}
