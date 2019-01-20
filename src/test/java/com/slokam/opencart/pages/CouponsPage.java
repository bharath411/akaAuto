package com.slokam.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CouponsPage {

	WebDriver driver;
	public CouponsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void createCoupon() {
		
		driver.findElement(By.xpath("data-original-title='Add New'")).click();
		
		//Add all typing ...
		
	}
	
}
