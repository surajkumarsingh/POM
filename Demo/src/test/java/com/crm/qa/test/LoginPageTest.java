package com.crm.qa.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	public LoginPageTest() {
		super();
	}
	
@BeforeMethod
public void setup() {
	initialization();
	loginpage = new LoginPage();
}
@Test
public void Login() {
loginpage.userId("8252772882");
loginpage.Password("way2sms");
loginpage.loginBtn();
}

@Test(priority=0)
public void logoTest() {
boolean flag =	loginpage.logo();	
Assert.assertTrue(flag);;
}

@AfterMethod
public void close() {
	driver.quit();
}
}
