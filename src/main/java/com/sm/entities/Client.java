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
	private Long identifiant;
	private String password;
	
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Client(Long codeClient, String nomClient, String prenomClient, Collection<Compte> comptes, Long identifiant,
			String password) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.comptes = comptes;
		this.identifiant = identifiant;
		this.password = password;
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
	
	
	public Long getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(Long identifiant) {
		this.identifiant = identifiant;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	@Override
	public String toString() {
		return "Client [codeClient=" + codeClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", identifiant=" + identifiant + ", password=" + password + "]";
	}
}
