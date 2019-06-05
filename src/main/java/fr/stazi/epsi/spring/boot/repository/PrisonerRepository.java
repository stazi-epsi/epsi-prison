package fr.stazi.epsi.spring.boot.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PrisonerRepository {
	@PersistenceContext
	private EntityManager em;
	
		
	
}
