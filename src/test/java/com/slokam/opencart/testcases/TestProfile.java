package com.slokam.opencart.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestProfile extends BaseTestCase{

	
	@Test
	public void testSupportFourm() {
		login("admin","admin");
		clickOnDemoDropdown();
		clickOnYourProfile();
		
		String email = driver.findElement(By.id("input-email")).getAttribute("value");
		System.out.println(email);
	}
	
	public void login(String user,String pass) {
		driver.findElement(By.id("input-username")).sendKeys(user);
		driver.findElement(By.id("input-password")).sendKeys(pass);
		driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
	}
	
	public void clickOnDemoDropdown() {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	}
	public void clickOnYourProfile() {
		driver.findElement(By.xpath("//a[contains(text(),'Your Profile')]")).click();
	}
	 
	public void clickOnSupportForum() {
		driver.findElement(By.xpath("//a[contains(text(),'Support Forum')]")).click();
	}
}
