package com.mukunth.service;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.mukunth.model.Person;

@Path("/person")
public class PersonService {
 
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getMsg() {
		Person person = new Person(1,"Mukunth","IT");
		return Response.status(200).entity(person).build();
	}
 
}