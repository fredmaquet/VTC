package fr.norsys.controller;

import com.sun.org.apache.regexp.internal.RE;
import fr.norsys.domain.Exploitant;
import fr.norsys.ws.WSConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    
	@Autowired
	public WSConnector service;

    @RequestMapping(value = "/exploitantVTC", method = RequestMethod.GET)
	public Exploitant getExploitant(){
		return service.getExploitant();
	}
}
