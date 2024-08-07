package checkout;

import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import Pomrepository.DashboardPage;
import Pomrepository.addcartPage;

public class addtocartmultipleItemTest extends BaseClass{
	@Test
	public void addtocardaction() throws InterruptedException {
	
	DashboardPage dash =new DashboardPage(driver);
	dash.clickwomen(driver);	
	dash.clicktop(driver);
	dash.clickjeans(driver);
	Thread.sleep(2000);
	dash.lightjacket(driver);
	dash.clickaddtocart();
	 addcartPage add=new addcartPage(driver);
	  add.clickadd();
	  add.checktotalnoofproduct();
	  
	dash.clickjackettext();
	dash.clicknavejacket();
	dash.clickaddtocart();
	
	  add.clickadd();
	  add.checktotalnoofproduct();
	dash.clickjackettext();
	dash.clicknadiasheel();
	dash.clickaddtocart();
	 add.clickadd();
	  add.checktotalnoofproduct();
	
	}
}
