package etrade.core.utilities;

public class HostingMailService implements EmailService{

	@Override
	public void sendToEmail(String email) {
		System.out.println("Mail Hosting kullanarak başarılı bir şekilde gönderilmiştir. Mail adresiniz: " + email);
		
	}

}
