package br.com.gwcloud.smartplace.pilot.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.gwcloud.smartplace.pilot.entities.User;

@Component
public class UserService {
	

//	private User user;
	
	private EntityManagerFactory emf=Persistence.createEntityManagerFactory("smart-place-pilot");
	private EntityManager em=emf.createEntityManager();
	
	public void save(User user) {
		em.persist(user);
	}
}
