package checkout;

import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import Pomrepository.LoginPage;

public class Loginaction extends BaseClass{
	
	@Test
	public void login() throws InterruptedException {
		LoginPage log =new LoginPage(driver);
		log.clicksign();
		log.loginaction("saifullah.pce@gmail.com", "S@ifullah786");
		
	}

}
