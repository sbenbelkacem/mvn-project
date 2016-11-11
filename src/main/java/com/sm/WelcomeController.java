package com.sm;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sm.dao.ClientRepository;
import com.sm.entities.Client;
import com.sm.entities.Compte;
import com.sm.metier.ClientMetier;

@Controller
public class WelcomeController {
	
	@Autowired
	private ClientMetier clientMetier;
	
	@RequestMapping(value="/authentifiate",method=RequestMethod.POST)

	public String VerifieIdentite(@RequestParam("identifiant") Long id, @RequestParam("password") String password,Map<String, Object> model) {
	if (clientMetier.authentifiateClient(id, password) > 0) {
		
	    Long codeClient = clientMetier.authentifiateClient(id, password);
	    System.out.println(codeClient);
		model.put("client", clientMetier.getClientById(codeClient));
		
//		List<Compte> liste = (List<Compte>) clientMetier.getClientById(codeClient).getComptes();
//		
//		for (int i=0;i<liste.get(0).get)
		
		
		return "espacemembre";
	}
	else 
		{
		model.put("error", "identifiant ou mot de passe incorrect");
		return "index";
		}
	}
	
	@RequestMapping(value="/signup",method=RequestMethod.POST)

	public String Enregistrer(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom, @RequestParam("email") String email, @RequestParam("password") String password, Map<String, Object> model) {
		Client client = new Client();
		client.setNomClient(nom);
		client.setPrenomClient(prenom);
		client.setEmailClient(email);
		PasswordEncoder encoder = new Md5PasswordEncoder();
	    String hashedPass = encoder.encodePassword(password, null);
		client.setPassword(hashedPass);
		client.setCodeClient(Long.valueOf(clientMetier.getClients().size()+1));
		clientMetier.createClient(client);
		
		
		return "index";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String welcome(Map<String, Object> model) {
		return "index";
	}

}
