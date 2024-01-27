package my.example.service;

import javax.ejb.Local;

@Local
public interface MessageService {
	
	String message();

}
