package eu.programit.config;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import eu.programit.rest.services.PersonService;

@Component
@ApplicationPath("/rest")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig(){
		register(PersonService.class);
	
	}
	

}
