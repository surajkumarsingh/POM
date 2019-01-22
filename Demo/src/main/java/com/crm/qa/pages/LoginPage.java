package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Page Factory:- OR
	@FindBy(xpath="//input[@id='mobileNo' and @type='tel']")
	WebElement userid;
	
	@FindBy(xpath="//input[@name='password' and @placeholder='Enter password']")
	WebElement password;
	
	@FindBy(xpath="//button[@onclick='return validLogin();']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[@class='logo']")
	WebElement logo;
	
   @FindBy(xpath="//div[@class='w2-fp']//a[@href='forgot-password']")
   WebElement forgot;

	//initialize page objects
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions:
	public void userId(String userID) {
		userid.sendKeys(userID);
	}
	public void Password(String passWord) {
		password.sendKeys(passWord);
	}
	public void loginBtn() {
		loginbtn.clear();
	}
	
public boolean logo() {
	return logo.isDisplayed();
}
	
}
