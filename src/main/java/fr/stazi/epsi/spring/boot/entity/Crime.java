package fr.stazi.epsi.spring.boot.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Crime {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String label;
	
	private long jailTimeDays;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public long getJailTimeDays() {
		return jailTimeDays;
	}

	public void setJailTimeDays(long jailTimeDays) {
		this.jailTimeDays = jailTimeDays;
	}

	@Override
	public String toString() {
		return "Crime [label=" + label + ", jailTimeDays=" + jailTimeDays + "]";
	}
}
