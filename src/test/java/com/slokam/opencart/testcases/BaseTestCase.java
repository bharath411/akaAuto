package com.slokam.opencart.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTestCase {

	String url = "https://demo.opencart.com/admin/";
	WebDriver driver = null;

	public void launchBrowser(String browser) {

		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@BeforeMethod
	public void init() {
		launchBrowser("chrome");
	}

	@AfterMethod
	public void tearDown() {
		 driver.close();
	}

}
