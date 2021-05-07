package etrade.core.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import etrade.entities.concretes.User;

public class Util {
	/*public static boolean emailValidate(String email) {
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		 
		Pattern pattern = Pattern.compile(regex);
		
		
	    Matcher matcher = pattern.matcher(email);
	    //System.out.println(user.getEmail() +" : "+ matcher.matches());
	    if(matcher.matches()==true) {
	    	return true;
	    }else {
	    	return false;
	    }
		
	    
	}*/
	
	public static boolean emailValidate(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
 }
}
