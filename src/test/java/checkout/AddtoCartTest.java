package checkout;

import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import Pomrepository.DashboardPage;
import Pomrepository.LoginPage;


public class AddtoCartTest extends BaseClass{
	@Test
	public void addtocardaction() throws InterruptedException {
		LoginPage log =new LoginPage(driver);
		log.clicksign();
		log.loginaction("saifullah.pce@gmail.com", "S@ifullah786");
		DashboardPage dash =new DashboardPage(driver);
		dash.clickwomen(driver);	
		dash.clicktop(driver);
		dash.clickjeans(driver);
		Thread.sleep(2000);
		dash.getLightjacket();
	
	}
	
	

}
