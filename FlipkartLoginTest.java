package com.flipkart.smokeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flipkart.base.TestBase;
import com.flipkart.PagesObjects.*;

public class FlipkartLoginTest extends TestBase {
FlipkartLogin fLogin;
	public FlipkartLoginTest() {
		super();
	}
	/**
	 * Launch The Url 
	 */
	
	@BeforeClass
	public void launch() {
		initialization();
		fLogin = new FlipkartLogin();
		driver.get("https://www.flipkart.com");
	}
	
	@Test
	public void login() throws Exception {
		System.out.println(driver.getTitle());
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='Km0IJL col col-3-5']//*"));
		if (elements.size() == 22) {
			fLogin.send_id("suraj9391@gmail.com");
			fLogin.send_pwd("flipkart");
			fLogin.login_btn();
			
			//driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("suraj9391@gmail.com");
			// System.out.println(elements.get(i).getTagName());
			//System.out.println(elements.get(22).getText());
			//elements.get(22).click();

		}

		else if ((elements.size() != 22)) {
			driver.quit();
			new FlipkartLoginTest().login();
		
		}
	}

}
