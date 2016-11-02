package fr.norsys.ws;

import fr.norsys.domain.Exploitant;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("http://localhost:9000")
public interface WSConnector {

	@RequestMapping(method = RequestMethod.GET, value = "/exploitantVTC")
	Exploitant getExploitant();

	/*
	@RequestMapping(method = RequestMethod.GET, value = "/exploitantVTC")
	TODO : pour mocker : utiliser methode par defaut Exploitant getExploitant(){ return ... };
	 */
}
