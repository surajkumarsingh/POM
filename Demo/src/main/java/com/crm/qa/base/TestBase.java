package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
public	static WebDriver driver;
public	static Properties prop;
public static  Select dropdown;

	public TestBase() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("D:\\Suraj_WorkSpace\\Demo\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
			
				prop.load(ip);}
			 catch (IOException e) { 
			 	// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public static void initialization() {
		String browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
driver = new ChromeDriver(); 			
		}else if(browser.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		}
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.get(prop.getProperty("url"));

	}
	
}
