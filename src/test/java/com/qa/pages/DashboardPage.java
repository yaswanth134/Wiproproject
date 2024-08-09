package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	//set up
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//woman drop button
	@FindBy(xpath="//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']")
	 private WebElement Women_dropdownbutton;
	
	// selecting category
	@FindBy(xpath="//span[text()='Tops']")
	 private WebElement Top_button;
	
	//selecting a sub category
	@FindBy(xpath="//span[text()='Jackets']")
	 private WebElement jacket_button;
	
	//selecting a product
	@FindBy(xpath="//a[contains(text(), 'Olivia 1/4 Zip Light Jacket ')]")
	 private WebElement lightjacket_button;
	
	//preview
	@FindBy(xpath="//li[@class='item product product-item']")
	 private WebElement product;
	
	//size of the product
	@FindBy(xpath="//div[text()='XS']")
	 private  WebElement size;
	
	//color of the product
	@FindBy(xpath="//div[@option-label='Black']")
	 private  WebElement colure;
	
	// adding to the cart
	@FindBy(xpath="//span[text()='Add to Cart']")
	 private  WebElement addtocart;
	
	//getting method for jacket
	public WebElement getLightjacket() {
		return lightjacket_button;
	}

	//getting method for jacket button preview
	public WebElement getJacket_button() {
		return jacket_button;
	}

	//getting method for sub category jacket
	public WebElement getTop_button() {
		return Top_button;
	}
	
	//dropdown 
	public WebElement getWomen_dropdownbutton() throws InterruptedException {
		Thread.sleep(2000);
		return Women_dropdownbutton;
	}
	
	//clicking to category women drop down
	public void clickwomen(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(Women_dropdownbutton).perform();
		//Women_dropdownbutton.click();
}
	public void clicktop(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(Top_button).perform();
		//Top_button.click();
	}
	public void clickjeans(WebDriver driver) {
		Actions action = new Actions(driver);
		action.moveToElement(jacket_button).perform();
		jacket_button.click();
		//jacket got click
	}
	//product to preview
	public void clickpro() {
		product.click();
	}
	public void lightjacket(WebDriver driver) throws InterruptedException {
		//Actions action = new Actions(driver);
		//action.moveToElement(lightjacket_button).perform();
		Thread.sleep(2000);
		lightjacket_button.click();
	}
	//size,color and adding to cart
	public void clickaddtocart() throws InterruptedException {
		size.click();
		Thread.sleep(2000);
		colure.click();
		Thread.sleep(2000);
		addtocart.click();
	}
	//getting web element for light jacket button
	public WebElement getLightjacket_button() {
		return lightjacket_button;
	}

	//getting web element for product
	public WebElement getProduct() {
		return product;
	}

	//getting web element for size
	public WebElement getSize() {
		return size;
	}

	//getting web element for color
	public WebElement getColure() {
		return colure;
	}

	//getting web element for add to cart
	public WebElement getAddtocart() {
		return addtocart;
	}
	
	
	//repating the same procedure to second product
		@FindBy(xpath="//a[text()='Jackets']")
		 private WebElement jacket;
		
		@FindBy(xpath="//a[contains(text(), 'Neve Studio Dance Jacket')]")
		 private WebElement nevejacket;
		
		@FindBy(xpath="//a[contains(text(), 'Nadia Elements Shell ')]")
		 private WebElement	nadiasheel;
		
		@FindBy(xpath="/html/body/div[4]/aside[2]/div[2]/footer/button[2]")
		 WebElement okbutton;

		public WebElement getJacket() {
			return jacket;
		}

		public WebElement getNevejacket() {
			return nevejacket;
		}

		public WebElement getNadiasheel() {
			return nadiasheel;
		}
		public void clickjackettext() {
			jacket.click();
		}
		public void clicknavejacket() {
			nevejacket.click();
		}
		public void clicknadiasheel() {
			nadiasheel.click();
		}
		//case3 
		@FindBy(xpath="//a[@title='Remove item']")
		private WebElement delete_button;

		public WebElement getDelete_button() {
			return delete_button;
		}

		public void clickdeletebutton() throws InterruptedException {
			delete_button.click();
			Thread.sleep(100);
			okbutton.click();
		}
}