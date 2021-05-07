package etrade.business.abstracts;

import etrade.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(String password, String email);
}
