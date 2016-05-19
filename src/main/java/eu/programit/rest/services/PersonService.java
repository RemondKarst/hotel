package eu.programit.rest.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import org.springframework.stereotype.Component;

import eu.programit.domain.Person;

@Component
@Path("/people")
public class PersonService {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response list(){
		List<Person> people =new ArrayList<>();
		Person remond = new Person();
		remond.setVoornaam("Remond");
		people.add(remond);
		Response response = Response.ok().entity(people).build();
		return response;
		
	}

}
