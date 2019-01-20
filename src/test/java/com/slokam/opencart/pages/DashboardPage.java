package com.slokam.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickOnDemoDropdown() {
		driver.findElement(By.xpath("//a[@class='dropdown-toggle']")).click();
	}
	public void clickOnYourProfile() {
		driver.findElement(By.xpath("//a[contains(text(),'Your Profile')]")).click();
	}
	
	public void clickOnStatistics() {
		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Statistics')]")).click();
	}
	
	public void clickOnCoupons() {
		driver.findElement(By.xpath("//a[contains(text(),'Marketing')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).click();
	}
}
