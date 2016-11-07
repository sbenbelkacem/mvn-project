package com.sm.metier;

import java.util.Collection;

import com.sm.entities.Client;

public interface ClientMetier {
	
	public void createClient(Client c);
	public void updateClient(Client c);
	public void deleteclient(Client c);
	public Client getClientById(Long id);
	public Collection<Client> getClients();
	public boolean authentifiateClient(Long id, String password);

}
