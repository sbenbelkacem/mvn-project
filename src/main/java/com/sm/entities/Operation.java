package com.sm.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_OPERATION",discriminatorType=DiscriminatorType.STRING,length=1)
public class Operation implements Serializable {
	
	@Id
	private Long numeroOperation;
	private Date dateOperation;
	private Double montant;
	private Compte compteOperation;
	
	public Operation(Long numeroOperation, Date dateOperation, Double montant, Compte compteOperation) {
		super();
		this.numeroOperation = numeroOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compteOperation = compteOperation;
	}
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getNumeroOperation() {
		return numeroOperation;
	}
	public void setNumeroOperation(Long numeroOperation) {
		this.numeroOperation = numeroOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Compte getCompteOperation() {
		return compteOperation;
	}
	public void setCompteOperation(Compte compteOperation) {
		this.compteOperation = compteOperation;
	}

}
