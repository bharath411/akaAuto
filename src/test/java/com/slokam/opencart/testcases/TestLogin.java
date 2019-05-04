package com.slokam.opencart.testcases;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.slokam.opencart.pages.AdminLoginPage;

import io.appium.java_client.remote.MobileCapabilityType;

public class TestLogin {

	String url = "http://192.168.0.112/opencart/admin/";
	WebDriver driver = null;

	@Before
	public void launchBrowser() {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		URL url1 = null;
		try {
			url1 = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new RemoteWebDriver(url1, capabilities);

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testValidLogin() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("user", "user123");
		String text = driver.findElement(By.xpath("//h1")).getText();
		String expected = "Dashboard";
	}

	@Test
	public void testInValidLogin() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("user", "user123");
		String text = driver.findElement(By.xpath("//h1")).getText();
		String expected = "Dashboard";
	}

	

}
