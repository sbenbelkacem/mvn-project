package com.sm.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
	private Double taux;

	

	
	
	

	public CompteEpargne(String codeCompte, Date dateCreation, Double solde, Client client,
			Collection<Operation> operations, Double taux) {
		super(codeCompte, dateCreation, solde, client, operations);
		this.taux = taux;
	}



	public CompteEpargne() {
		super();
	}







	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
}
