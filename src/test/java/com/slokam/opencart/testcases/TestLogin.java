package com.slokam.opencart.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.slokam.opencart.pages.AdminLoginPage;

public class TestLogin  extends BaseTestCase{

		
	@Test
	public void testValidLogin() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("user","user123");
		String text = driver.findElement(By.xpath("//h1")).getText();
		String expected = "Dashboard";
		Assert.assertEquals(text, expected);
	}
	
	@Test
	public void testInValidLogin() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login("user","user123");
		String text = driver.findElement(By.xpath("//h1")).getText();
		String expected = "Dashboard";
		Assert.assertEquals(text, expected);
	}
	
	@Test
	public void withDataProvider(String user,String pass) {
		
	}
	
	
}
