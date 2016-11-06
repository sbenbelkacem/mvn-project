package com.sm.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("V")
public class Versement extends Operation {

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versement(Long numeroOperation, Date dateOperation, Double montant, Compte compteOperation) {
		super(numeroOperation, dateOperation, montant, compteOperation);
		// TODO Auto-generated constructor stub
	}

}
