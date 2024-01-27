package my.example.service;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

@Stateless(name = "messageService")
public class MessageServiceImpl implements MessageService{
	
	@Resource
    private SessionContext context;
	
	@Override
	public String message() {
		return "Ciao Mondo !!!";
	}

}
