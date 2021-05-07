package etrade;

import etrade.business.abstracts.AuthService;
import etrade.business.concretes.AuthManager;
import etrade.business.concretes.UserManager;
import etrade.core.utilities.HostingMailService;
import etrade.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		AuthService authService=new AuthManager(new UserManager(), new HostingMailService());
		AuthService authService1=new AuthManager(new UserManager(), new HostingMailService());
		User user1 = new User(1, "Arda", "Coskun", "ardavecoskun@gmail.com", "1234567890");
		User user2 = new User(2, "Ertuğ", "Kaymak", "ertugkaymak@gmail.com", "12345");
		
		authService.register(user1);
		authService1.register(user2);
		
		authService.login(user1.getEmail(), user1.getPassword());
		authService1.login(user2.getEmail(), user2.getPassword());
		
	}

}
