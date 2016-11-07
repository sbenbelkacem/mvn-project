package com.sm.metier;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sm.dao.ClientRepository;
import com.sm.entities.Client;

@Service
public class ClientMetierImpl implements ClientMetier {

	@Autowired
	ClientRepository clientrepository;
	@Override
	public void createClient(Client c) {
		clientrepository.save(c);
	}

	@Override
	public void updateClient(Client c) {
		clientrepository.save(c);
		
	}

	@Override
	public void deleteclient(Client c) {
		clientrepository.delete(c);
		
	}

	@Override
	public Client getClientById(Long id) {
		
		return clientrepository.getOne(id);
	}

	@Override
	public Collection<Client> getClients() {
		
		return clientrepository.findAll();
	}

	@Override
	public boolean authentifiateClient(Long id, String password) {
		
		PasswordEncoder encoder = new Md5PasswordEncoder();
	    String hashedPass = encoder.encodePassword(password, null);
	    List<Client> clients = clientrepository.findAll();
	    for (Client client:clients)
	    {	
	    	  if (client.getIdentifiant().equals(id) && client.getPassword().equals(hashedPass))
	    		  return true;
	    }
		return false;
	}

}
