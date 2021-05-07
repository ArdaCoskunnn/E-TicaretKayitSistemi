package etrade.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import etrade.business.abstracts.UserService;
import etrade.entities.concretes.User;
import etrade.core.utilities.Util;

public class UserManager implements UserService {

	
	@Override
	public void add(User user) {
		
		
		if(user.getEmail() == null || user.getPassword() == null || user.getFirstName() == null || user.getLastName() == null) {
			
			System.out.println("Kullanıcı bilgileri zorunludur!!! Lütfen tüm alanları eksiksiz doldurunuz!!!");
			return;
			
		}else if(user.getPassword().length() < 6) {
			
			System.out.println("Parola minimum 6 karakterden oluşmalıdır. Şu anki girdiğiniz  parola uzunluğu: " + user.getPassword().length());
			return;
			
		}else if(user.getFirstName().length() < 2 || user.getLastName().length()<=2) {
			
			System.out.println("Kullanıcı adı ve parola minimum 2 harften oluşmalıdır!!! Şu an girmiş olduğunuz isim: " + user.getFirstName() + " soyisim: " + user.getLastName());
			return;
			
		}else if(Util.emailValidate(user.getEmail())==false) {
			
			System.out.println("Lütfen geçerli bir email adresi giriniz!!! Şu anki girmiş olduğunuz mail adresi: " + user.getEmail());
			return;
			
		}
		
		//To-Do add database.
		
		System.out.println("Kullanıcı başarılı bir şekilde eklendi. Sisteme giriş bilgileriniz mail olarak gönderilecektir.");
		
	}

	@Override
	public List<User> getAll() {
		
		
		return null;
	}

	@Override
	public boolean login(String email, String password) {
		
		System.out.println("*******************************Giriş ekranı********************************");
		
		if(email=="ardavecoskun@gmail.com" && password=="1234567890") {
			
			System.out.println("Bilgileriniz doğru.");
			return true;
			
		}else {
			
			System.out.println("Giriş bilgileriniz hatalı!");
			return false;
		}
		
	}

}
