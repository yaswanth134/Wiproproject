package com.qa.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.pages.DashboardPage;
import com.qa.pages.LoginPage;
import com.qa.pages.addcartPage;

import GenericUtility.BaseClass;
import org.openqa.selenium.WebDriver;


public class addtocart extends BaseClass{
	
	//WebDriver driver;
	
//	@Test
//	public void login() throws InterruptedException {
//		LoginPage log =new LoginPage(driver);
//		log.loginaction("saifullah.pce@gmail.com", "S@ifullah786");
//		log.clicksign();
//		
//	}
	
	//getting product display
	@Test
	public void addtocardaction() throws InterruptedException {
		LoginPage log =new LoginPage(driver);
		log.clicksign();
		log.loginaction("saifullah.pce@gmail.com", "S@ifullah786");
		//logged in and entering into dash board
		DashboardPage dash =new DashboardPage(driver);
		dash.clickwomen(driver);	//women category on click
		dash.clicktop(driver);	// tops sub category on click
		dash.clickjeans(driver); // clicking on jeans
		Thread.sleep(2000);
		dash.getLightjacket();	
	
	}
	
	//adding product to cart
	@Test
	public void addtocardaction1() throws InterruptedException, EncryptedDocumentException, IOException {
		
		String email = fUtils.fetchStringDataFromExcelFile("login", 1, 0);
		String password = fUtils.fetchStringDataFromExcelFile("login", 1, 1);
	
		LoginPage log =new LoginPage(driver);
		log.clicksign();
		log.loginaction(email, password);// logged in 
		DashboardPage dash =new DashboardPage(driver);
		dash.clickwomen(driver);	//click on woman category
		dash.clicktop(driver);		//click on top
		dash.clickjeans(driver);	//click on jeans
		Thread.sleep(2000);
		dash.lightjacket(driver);	//click on preview
		dash.clickaddtocart();		//click on filing details
	  addcartPage add=new addcartPage(driver);
	  add.clickadd(); // click on cart
	  add.checktotalnoofproduct();	//displaying products number on cart
	}
	
	//adding multiple items to cart
	@Test
	public void addtocardaction2() throws InterruptedException {
	//adding product to cart #1
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
	  
	  //adding next product
	dash.clickjackettext();
	dash.clicknavejacket();
	dash.clickaddtocart();
	  add.clickadd();
	  add.checktotalnoofproduct();
	  
	  //adding product #3
	dash.clickjackettext();
	dash.clicknadiasheel();
	dash.clickaddtocart();
	 add.clickadd();
	  add.checktotalnoofproduct();
	
	}
	
	//remove the product from cart
	@Test
	public void addtocardaction4() throws InterruptedException {
		
		//adding a product to cart
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
		  
		  //adding a another product to cart
		dash.clickjackettext();
		dash.clicknavejacket();
		dash.clickaddtocart();
		
		  add.clickadd();
		  add.checktotalnoofproduct();
		  
		  //adding third item to cart
		dash.clickjackettext();
		dash.clicknadiasheel();
		dash.clickaddtocart();
		 add.clickadd();
		  add.checktotalnoofproduct();
		
		//deleting the product #1
		dash.clickdeletebutton();
		Thread.sleep(50);
		//deleting the product #2
		dash.clickdeletebutton();
		Thread.sleep(50);
		//deleting the product #3
		dash.clickdeletebutton();
		Thread.sleep(50);
		add.checktotalnoofproduct();
		

	}
}
