package com.slokam.opencart.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParExampleSel {


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

	public void launchBrowserGrid(String browser) {

		String gridUrl = "http://172.18.27.49:4444/wd/hub";
		URL url1=null;
		try {
			url1 = new URL(gridUrl);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (browser.equals("firefox")) {
			Capabilities cap = DesiredCapabilities.firefox();
			driver = new RemoteWebDriver(url1,cap);
		} else {
			Capabilities cap = DesiredCapabilities.chrome();
			driver = new RemoteWebDriver(url1,cap);
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	//@BeforeMethod
	public void init() {
		launchBrowser("chrome");
	}

	@AfterMethod
	public void tearDown() {
		// driver.close();
	}

	@Test
	public void testSupportFourm() {
		launchBrowserGrid("firefox");
		login("admin", "admin");
		clickOnDemoDropdown();
		clickOnSupportForum();

		String mainHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		String childHandle = "";
		for (String handle : handles) {
			if (!handle.equals(mainHandle)) {
				childHandle = handle;
			}
		}

		driver.switchTo().window(childHandle);
		String st = driver.findElement(By.xpath("//a[@data-navbar-reference='index']")).getText();
		System.out.println(st);
		driver.close();
	}

	@Test
	public void test2() {
		launchBrowserGrid("chrome");
		login("admin", "admin");
		clickOnDemoDropdown();
		clickOnSupportForum();

		
	}
	public void login(String user, String pass) {
		driver.findElement(By.id("input-username")).sendKeys(user);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	}

	public void clickOnDemoDropdown() {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	}

	public void clickOnSupportForum() {
		driver.findElement(By.xpath("//a[contains(text(),'Support Forum')]")).click();
	}

}
