package etrade.dataAccess.concretes;

import java.util.List;

import etrade.dataAccess.abstracts.UserDao;
import etrade.entities.concretes.User;

public class InMemoryUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanıcı başarılı bir şekilde eklendi:)");		
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
