package com.sel;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	WebDriver driver = null;
	String url = "https://www.gmail.com/";
	
	@Before
	public void gsd() {
		lan("chrome");
	}
	
	public void lan(String browser) {

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
	
	@Test
	public void loginToGmail() {
		driver.findElement(By.id("identifierId")).sendKeys("bharath.selenium26");
		driver.findElement(By.xpath("//span[text()='Next']")).click();

		driver.findElement(By.name("password")).sendKeys("dfsfdsfds");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	
}
