package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addcartPage {
	
	WebDriver driver;
	
	// add to cart set up
	public addcartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//cart button 
	@FindBy(xpath="//a[@data-bind=\"scope: 'minicart_content'\"]")
	 private WebElement  aadcard_button;
	
	//product count 
	@FindBy(xpath="//span[@data-bind=\"text: getCartParam('summary_count')\"]")
	 private WebElement  totalnoofproduct;
	
	//returning the cart button WebElement
	public WebElement getAadcard_button() {
		return aadcard_button;
	}
	
	//clicking add to cart
	public void clickadd() {
		aadcard_button.click();
	}

	//getting total no of products
	public WebElement getTotalnoofproduct() {
		return totalnoofproduct;
	}
	
	//checking total no of products
	public void checktotalnoofproduct() {
		System.out.println("totalno of product is  "   +totalnoofproduct.getText());
	}

}
