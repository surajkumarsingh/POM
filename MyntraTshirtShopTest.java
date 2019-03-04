package com.goibibo.qa.smokeTesting;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.goibibo.qa.base.TestBase;
import com.goibibo.qa.pages.MyntraHomePage;

public class MyntraTshirtShopTest extends TestBase {

	MyntraHomePage myntrashop;
    static Scanner sc;
	public MyntraTshirtShopTest() {
		super();
	}

	@BeforeMethod

	public void setup() {
		//DesiredCapabilities capabilities = new DesiredCapabilities();
		
		initialization();
		myntrashop = new MyntraHomePage();
		
	}
	
@Test
public void tshirtShop() throws InterruptedException {
	
	myntrashop.profile();
	myntrashop.loginIn();
	myntrashop.login( );
	
}


	
}
