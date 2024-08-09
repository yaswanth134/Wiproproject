package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginm {
	

    WebDriver driver;
    
    //setuping details
    
    @FindBy(id = "email")
    WebElement emailAddress;

    @FindBy(id = "pass")
    WebElement password;

    @FindBy(id = "send2")
    WebElement loginButton;
    
    @FindBy(xpath = "/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
    WebElement signinbutton;
  
    //setup
    public loginm(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    //logging in 
    public void login(String email, String pwd) {
//    	signinbutton.click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        emailAddress.sendKeys(email);
        password.sendKeys(pwd);
        loginButton.click();
    }
}
