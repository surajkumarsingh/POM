package com.flipkart.PagesObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.flipkart.base.TestBase;

public class FlipkartLogin extends TestBase {


	//Pagefactory :- OR
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	WebElement userid;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv']")
	WebElement password;
	
	@FindBy(xpath="//button//span[contains(text(),'Login')]")
	WebElement loginBtn;
	
	public FlipkartLogin() {
		PageFactory.initElements(driver, this);
	}
	public void send_id(String id) {
		userid.sendKeys(id);
	}
	public void send_pwd(String pwd) {
		password.sendKeys(pwd);
	}
	public void login_btn() {
		loginBtn.click();
	}
}
