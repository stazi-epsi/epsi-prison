package fr.stazi.epsi.spring.boot.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.stazi.epsi.spring.boot.entity.DangerLevel;
import fr.stazi.epsi.spring.boot.entity.Prisoner;

public class PrisonerRepositoryImpl implements PrisonerRepository {
	@PersistenceContext
	private EntityManager em;
	
	public List<Prisoner> searchPrisoners(DangerLevel dangerLevel, String firstName, String lastName) {
		return null;
	}
	
}
