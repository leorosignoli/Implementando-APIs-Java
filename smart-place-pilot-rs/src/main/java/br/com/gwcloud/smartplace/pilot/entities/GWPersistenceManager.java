package br.com.gwcloud.smartplace.pilot.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GWPersistenceManager {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("smart-place-pilot");
		EntityManager em=emf.createEntityManager();
		
		User user = new User();
		user.setId("566juykiljdanjisdnsaj");
		user.setUsername("brunohenrique");
		user.setEmail("brunohenrique@hotmail.com");
		em.persist(user);
	}

}
