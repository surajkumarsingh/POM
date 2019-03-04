package com.goibibo.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.goibibo.qa.base.TestBase;

public class MyntraHomePage extends TestBase{

	@FindBy(xpath="//span[@class='desktop-userTitle' and @data-reactid='741']")
	WebElement profile;
	
	@FindBy(linkText="LOG IN")
	WebElement login;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@name='captcha']")
	WebElement captcha;
	
	@FindBy(xpath="//button[@class='login-login-button']")
	WebElement loginBtn;
	
	public MyntraHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void profile() {
		profile.click();
		//action.moveToElement(profile).build().perform();
	}

	public void loginIn() {
		login.click();
	}
public void login() throws InterruptedException {
	email.sendKeys("suraj9391@gmail.com");
	pwd.sendKeys("myntra@12");
   // captcha.sendKeys();
	Thread.sleep(5000);
    loginBtn.click();
    
}
	
	
}
