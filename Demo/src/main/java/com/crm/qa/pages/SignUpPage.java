package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class SignUpPage extends TestBase {

	@FindBy(xpath="//a//button[@class='btn-theme-sm btn-ls text-uppercase']")
	WebElement btn;

	@FindBy(xpath="//input[@id='name']")
	WebElement name;
	
	@FindBy(xpath="//input[@inputmode='number' and @name='mobileNo']")
	WebElement mobileno;
	
	@FindBy(xpath="//input[@id='emailId' and @name='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='genderM' and @name='gender']")
	WebElement male;
	
	@FindBy(xpath="//input[@id='genderF' and @name='gender']")
	WebElement female;
	
	@FindBy(xpath="//input[@id='dob' and @name='dob']")
	WebElement dob;
	
	@FindBy(xpath="//select[@id='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='terms']")
	WebElement chekbox;
	
	@FindBy(xpath="//button[@id='sendButton']")
	WebElement RegBtn;
	
	public SignUpPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public void registration(String nam, String mb, String mail, String doB, int cities) throws InterruptedException {
		btn.click();
		name.sendKeys(nam);
		mobileno.sendKeys(mb);
		email.sendKeys(mail);
		male.click();
		dob.sendKeys(doB);
		dropdown = new Select(city);
		dropdown.selectByIndex(cities);
		Thread.sleep(10000);
		chekbox.click();
		RegBtn.click();	
	}
	
	public void radiobtn(String nam, String mb, String mail, String doB, String cities) throws InterruptedException {
		btn.click();
		name.sendKeys(nam);
		mobileno.sendKeys(mb);
		email.sendKeys(mail);
		dob.sendKeys(doB);
		dropdown = new Select(city);
		dropdown.selectByVisibleText(cities);
		Thread.sleep(10000);
		chekbox.click();
		RegBtn.click();	
	}
	public void termschk(String nam, String mb, String mail, String doB, String cities) throws InterruptedException {
		btn.click();
		name.sendKeys(nam);
		mobileno.sendKeys(mb);
		email.sendKeys(mail);
		male.click();
		dob.sendKeys(doB);
		dropdown = new Select(city);
		dropdown.selectByVisibleText(cities);
		Thread.sleep(15000);
		RegBtn.click();	
	}
	public void regChk() {
		btn.click();
	}
	public void name(String nam) {
		name.sendKeys(nam);
	}
	public void mobileno(String mb) {
		mobileno.sendKeys(mb);
	}
	public void email(String mail) {
		email.sendKeys(mail);
	}
	public void gender() {
		male.click();
	}
	public void dOb(String doB) {
		dob.sendKeys(doB);
	}
	public void city(int cities) {
		dropdown = new Select(city);
		dropdown.selectByIndex(cities);
	}
	public void terms() {
		chekbox.click();
	}
	public void regbtn() {
		RegBtn.click(); 
	}
}
