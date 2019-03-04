package com.goibibo.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	public static Select dropdown;
	public static JavascriptExecutor js;
	public static Actions action;

	public TestBase() {
		prop = new Properties();

		try {
			FileInputStream ip = new FileInputStream(
					"D:\\Suraj_WorkSpace\\Goibibo\\src\\main\\java\\com\\goibibo\\qa\\config\\config.properties");

			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			// Create object of HashMap Class
			Map<String, Object> prefs = new HashMap<String, Object>();

			// Set the notification setting it will override the default setting
			prefs.put("profile.default_content_setting_values.notifications", 2);

			// Create object of ChromeOption class
			ChromeOptions options = new ChromeOptions();

			// Set the experimental option
			options.setExperimentalOption("prefs", prefs);

			// pass the options object in Chrome driver

			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("ff")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
