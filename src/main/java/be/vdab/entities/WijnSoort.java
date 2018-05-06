package be.vdab.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="soorten")
public class WijnSoort implements Serializable {
	private final static long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private long id;

	private String naam;
	
	@ManyToOne(fetch=FetchType.LAZY, optional = false) 
	@JoinColumn(name = "landid")	
	private Land land;
	
	@Version
	int versie;

	public WijnSoort() {
	}

	public String getNaam() {
		return naam;
	}

	public Land getLand() {
		return land;
	}


}
