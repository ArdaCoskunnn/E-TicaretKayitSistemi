package etrade.business.abstracts;

import java.util.List;

import etrade.entities.concretes.User;

public interface UserService {
	void add(User user);
	List<User> getAll();
	boolean login(String email, String password);
}
