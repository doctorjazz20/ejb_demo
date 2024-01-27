package my.example.controller;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.naming.NamingException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.glassfish.jersey.process.internal.RequestScoped;

import my.example.service.MessageService;


@ManagedBean
@Path("/")
@RequestScoped
public class HelloController {
	
	@EJB
	private MessageService service;
	
	@GET
    public String getMsg(){
         return "Hello World !! - Jersey 2";
    }
	
	@GET
	@Path("/message")
    public String getMsgFromService() throws NamingException{
         
		return service.message();
		
    }

}
