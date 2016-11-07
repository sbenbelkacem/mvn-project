package com.sm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sm.entities.Client;
import com.sm.metier.ClientMetier;

@RestController
public class ClientRestService {
	
	@Autowired
	private ClientMetier clientMetier;
	
	@RequestMapping(value="/clients",method=RequestMethod.GET)

	public List<Client> listClient() {
		return (List<Client>) clientMetier.getClients();
	}

}
