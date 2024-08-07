package Pomrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	
	@FindBy(xpath="(//a[contains(text(), 'Sign In')])[1]")
	 private WebElement signinbutton;
	
	@FindBy(id="email")
	 private WebElement email_textfield;
	
	@FindBy(id="pass")
	 private WebElement Password_textfield;
	
	@FindBy(xpath="//span[text()='Sign In']")
	private WebElement sign_button;

	public WebElement getSigninbutton() {
		return signinbutton;
	}

	public WebElement getEmail_textfield() {
		return email_textfield;
	}

	public WebElement getPassword_textfield() {
		return Password_textfield;
	}

	public WebElement getSign_button() {
		return sign_button;
	}
    public void clicksign() throws InterruptedException {
    	Thread.sleep(2000);
    	signinbutton.click();
    }
    public void loginaction(String email,String password) {
    	email_textfield.sendKeys(email);
    	Password_textfield.sendKeys(password);
    	sign_button.click();
    }
    
}
