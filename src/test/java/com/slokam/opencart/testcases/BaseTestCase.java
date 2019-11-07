package com.slokam.opencart.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.slokam.opencart.commons.listeners.CustomListeners;

@Listeners(CustomListeners.class)
public class BaseTestCase {

	String url = "https://demo.opencart.com/admin/";
	static WebDriver driver = null;

	public static WebDriver getDriver() {
		return driver;
	}
	public void launchBrowser(String browser) {
 
		if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/gekodriver.exe");
			driver = new FirefoxDriver();
		}  else if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver = new ChromeDriver();
		}	else { System.out.println("browser path is not matched");
			
		}
		
		driver.get(url);
		driver.manage().window().maximize();
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
