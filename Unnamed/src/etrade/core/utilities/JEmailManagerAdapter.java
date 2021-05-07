package etrade.core.utilities;

public class JEmailManagerAdapter implements EmailService {

	@Override
	public void sendToEmail(String email) {
		System.out.println("Mail " + email + " adresine başarılı bir şekilde gönderildi.");
		
	}

}
