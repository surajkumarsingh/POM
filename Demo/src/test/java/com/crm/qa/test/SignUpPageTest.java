package com.crm.qa.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.SignUpPage;

public class SignUpPageTest extends TestBase {
	SignUpPage singnUp;
	String error;
	public SignUpPageTest() {
		super();
	}
@BeforeMethod
public void setup() {
	initialization();
	singnUp = new SignUpPage();
			}

@Test
public void register() throws InterruptedException {
	singnUp.registration("suraj","9123456789","suraj@gmail.com","10/03/1995",9);
}

@Test
public void verifyErrorName() throws InterruptedException {
	singnUp.registration("","9123456789","suraj@gmail.com","10/03/1995",7);
 error =	driver.findElement(By.xpath("//div[@id='error_name']//b")).getText();
Assert.assertEquals("Please enter your name.", error, "Error does not showed or matched");
	
}
@Test
public void verifyErrorMobile() throws InterruptedException {
	singnUp.registration("suraj","","suraj@gmail.com","10/03/1995",3);
 error =	driver.findElement(By.xpath("//div[@id='error_mobile']//b")).getText();
Assert.assertEquals("Please enter mobile number.", error, "Error does not showed or matched");
}
@Test
public void verifyErrorEmail() throws InterruptedException {
	singnUp.registration("suraj","9123456789","","10/03/1995",6);
 error =	driver.findElement(By.xpath("//div[@id='error_email']//b")).getText();
Assert.assertEquals("Please enter email address.", error, "Error does not showed or matched");
}
@Test
public void verifyErrorGender() throws InterruptedException {
	singnUp.radiobtn("suraj","9123456789","suraj@gmail.com","10/03/1995","Hyderabad");
	 error =	driver.findElement(By.xpath("//div[@id='error_gender']//b")).getText();
Assert.assertEquals("Please select gnder.", error, "Error does not showed or matched");
}
@Test
public void verifyErrorDOB() throws InterruptedException {
	singnUp.registration("suraj","9123456789","suraj@gmail.com","",7);
	 error = driver.findElement(By.xpath("//div//b[@class='error']")).getText();
	Assert.assertEquals(error, "Please enter valid date.", "Error does not showed or matched");
}
@Test
public void verifyErrorCity() throws Exception {
	singnUp.registration("suraj","9123456789","suraj@gmail.com","10/03/1995",0);
	error = driver.findElement(By.xpath("//div[@id='error_city']//b")).getText();
	Assert.assertEquals(error, "Please select city.","Error does not showed or matched");
}
@Test
public void verifyErrorCaptcha() throws InterruptedException {
	singnUp.registration("suraj","9123456789","suraj@gmail.com","10/03/1995",9);
error = driver.findElement(By.xpath("//div[@id='error_captcha']//b")).getText();
Assert.assertEquals(error,"Please Enter Captcha.","Error does not showed or matched");
}
@Test
public void verifyErrorTerms() throws InterruptedException {
	singnUp.regChk();
	singnUp.name("suraj");
	singnUp.mobileno("9123456789");
	singnUp.email("suraj@gmail.com");
	singnUp.gender();
	singnUp.dOb("10/03/995");
	singnUp.city(8);
	Thread.sleep(15000);
	singnUp.regbtn();
	error = driver.findElement(By.xpath("//div[@id='error_terms']//b")).getText();
	Assert.assertEquals(error,"Please select the privacy policy and terms & condition.","Error does not showed or matched");
}
@AfterMethod
public void close() {
	driver.quit();
}
}
