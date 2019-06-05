package fr.stazi.epsi.spring.boot.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cell {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String code;
	
	private short maxPrisoners;
	
	@OneToMany(mappedBy = "cell")
	private List<Prisoner> prisoners;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public short getMaxPrisoners() {
		return maxPrisoners;
	}

	public void setMaxPrisoners(short maxPrisoners) {
		this.maxPrisoners = maxPrisoners;
	}

	public List<Prisoner> getPrisoners() {
		return prisoners;
	}

	public void setPrisoners(List<Prisoner> prisoners) {
		this.prisoners = prisoners;
	}

	@Override
	public String toString() {
		return "Cell [id=" + id + ", code=" + code + ", maxPrisoners=" + maxPrisoners + ", prisoners=" + prisoners
				+ "]";
	}

}
