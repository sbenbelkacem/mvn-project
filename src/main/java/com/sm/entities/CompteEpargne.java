package com.sm.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("CE")
public class CompteEpargne extends Compte {
	private Double taux;

	

	public CompteEpargne(String codeCompte, Date dateCreation, Double solde, Double taux) {
		super(codeCompte, dateCreation, solde);
		this.taux = taux;
	}
	
	

	public CompteEpargne() {
		super();
	}



	public CompteEpargne(String codeCompte, Date dateCreation, Double solde) {
		super(codeCompte, dateCreation, solde);
	}



	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
}
