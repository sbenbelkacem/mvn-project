package com.sm.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_COMPTE",discriminatorType=DiscriminatorType.STRING,length=2)
public class Compte implements Serializable{
	
	@Id
	private String codeCompte;
	private Date dateCreation;
	private Double solde;
	@ManyToOne
	@JoinColumn(name="CODE_CLI")
	private Client client;
	
	public Compte(String codeCompte, Date dateCreation, Double solde) {
		super();
		this.codeCompte = codeCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
	}
	
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getCodeCompte() {
		return codeCompte;
	}
	
	public void setCodeCompte(String codeCompte) {
		this.codeCompte = codeCompte;
	}
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Double getSolde() {
		return solde;
	}
	
	public void setSolde(Double solde) {
		this.solde = solde;
	}
}