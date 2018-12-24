package com.examples.parallel;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Par1 {

	WebDriver driver = null;
	String url = "https://www.amazon.in/";
	@Test
	public void test1() {
		System.out.println("Par 1 - test1 started at - " + System.currentTimeMillis());
		String browser = "firefox";
		/*if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
			driver = new ChromeDriver();
		}*/
		String remoteUrl = "http://192.168.56.1:4444/wd/hub";
		URL ur=null;
		try {
			ur = new URL(remoteUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver(ur,options);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Par 1 - ended started at - " + System.currentTimeMillis());
	}
	
	@Test
	public void test2() {
		System.out.println("Par 1 - test1 started at - " + System.currentTimeMillis());
		String remoteUrl = "http://192.168.56.1:4444/wd/hub";
		URL ur=null;
		try {
			ur = new URL(remoteUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		FirefoxOptions options =new FirefoxOptions();
		driver = new RemoteWebDriver(ur,options);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Par 1 - ended started at - " + System.currentTimeMillis());
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("Par 1 - ended started at - " + System.currentTimeMillis());
	}
	
	
	
}
