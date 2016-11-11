package com.sm.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CC")
public class CompteCourant extends Compte {
	
	private Double decouvert;

	public Double getDecouvert() {
		return decouvert;
	}

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CompteCourant(String codeCompte, Date dateCreation, Double solde, Client client,
			Collection<Operation> operations, Double decouvert) {
		super(codeCompte, dateCreation, solde, client, operations);
		this.decouvert = decouvert;
	}

	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}

}
