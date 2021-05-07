package etrade.business.concretes;

import etrade.business.abstracts.AuthService;
import etrade.business.abstracts.UserService;
import etrade.core.utilities.EmailService;
import etrade.core.utilities.Util;
import etrade.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserService userService;
	private EmailService emailService;
	
	public AuthManager(UserService userService, EmailService emailService) {
		this.userService=userService;
		this.emailService=emailService;
	}
	
	@Override
	public void register(User user) {
		userService.add(user);		
	}

	@Override
	public void login(String email, String password) {
		if(userService.login(email, password)) {
			emailService.sendToEmail(email);
		}
	}

}
