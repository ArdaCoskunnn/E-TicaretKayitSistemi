package etrade.dataAccess.abstracts;

import java.util.List;

import etrade.entities.concretes.User;

public interface UserDao {
	void add(User user);
	User get(int id);
	List<User> getAll();
}
