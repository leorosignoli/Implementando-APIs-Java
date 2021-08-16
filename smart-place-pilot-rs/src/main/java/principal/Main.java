package principal;

import jakarta.persistence.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class Main {
	
	public static void main(String[] args) {
		
		User leo = new User();
		leo.setId(123);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(leo);
        entityManager.getTransaction().commit();
        entityManager.close();
        entityManagerFactory.close();
		
	}
}
