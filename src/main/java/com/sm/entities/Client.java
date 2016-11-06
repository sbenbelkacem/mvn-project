package com.sm.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client implements Serializable {

	@Id
	private Long codeClient;
	private String nomClient;
	private String prenomClient;
	@OneToMany(mappedBy="client",fetch=FetchType.LAZY)
	private Collection<Compte> comptes;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(Long codeClient, String nomClient, String prenomClient, Collection<Compte> comptes) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.comptes = comptes;
	}
	
	public Long getCodeClient() {
		return codeClient;
	}
	
	public void setCodeClient(Long codeClient) {
		this.codeClient = codeClient;
	}
	
	public String getNomClient() {
		return nomClient;
	}
	
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	
	public String getPrenomClient() {
		return prenomClient;
	}
	
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	
	public Collection<Compte> getComptes() {
		return comptes;
	}
	
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
}
