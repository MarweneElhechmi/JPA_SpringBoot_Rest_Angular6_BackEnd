package org.catsid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Produit implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long reference;
	private String designation;
	private Double prix;
	private Date date;
	@ManyToOne
	private Pays pay;
	
	public Produit() {
		super();
	}

	public Produit(Long reference, String designation, Double prix, Date date) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
		this.date=date;
	}

	public Long getReference() {
		return reference;
	}

	public void setReference(Long reference) {
		this.reference = reference;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Pays getPays() {
		return pay;
	}

	public void setPays(Pays pays) {
		this.pay = pays;
	}
	
}
