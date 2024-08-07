package com.qa.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenricUtility.BaseClass;
import org.openqa.selenium.WebDriver;

import Pomrepository.DashboardPage;
import Pomrepository.LoginPage;
import Pomrepository.addcartPage;
public class addtocart extends BaseClass{
	
	WebDriver driver;
	
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
	
	@Test
	public void addtocardaction1() throws InterruptedException, EncryptedDocumentException, IOException {
		
		String email = fUtils.fetchStringDataFromExcelFile("login", 1, 0);
		String password = fUtils.fetchStringDataFromExcelFile("login", 1, 1);
	
		LoginPage log =new LoginPage(driver);
		log.clicksign();
		log.loginaction(email, password);
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
	}
	
	@Test
	public void addtocardaction2() throws InterruptedException {
	
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
