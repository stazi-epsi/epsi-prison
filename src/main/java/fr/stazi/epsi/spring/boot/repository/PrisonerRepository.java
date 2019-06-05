package fr.stazi.epsi.spring.boot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.stazi.epsi.spring.boot.entity.Prisoner;

public class PrisonerRepository {
	@PersistenceContext
	private EntityManager em;
	
	public List<Prisoner> getPrisoners() {
		return em.createQuery("from Prisoner", Prisoner.class).getResultList();
	}
	
}
