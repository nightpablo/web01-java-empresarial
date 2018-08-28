package utn.frsf.ofa.cursojava.rrhh.web.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import utn.frsf.ofa.cursojava.rrhh.web.modelo.Cliente;

@Stateless
public class ClienteService {
	
	@PersistenceContext(unitName = "RRHH_WEB_PU")
	private EntityManager em;
	
    public ClienteService() {
    }

    public Cliente guardar(Cliente c){
    	if(c.getId()==0) em.persist(c);
    	else c = em.merge(c);
    	em.flush();
    	em.refresh(c);
    	return c;
    }

	 public List<Cliente> todos(){
		 return this.em.createQuery("SELECT c FROM Cliente c").getResultList();
	 }
}