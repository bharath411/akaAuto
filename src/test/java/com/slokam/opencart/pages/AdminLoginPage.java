package com.slokam.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {

	WebDriver driver;

	public AdminLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	WebElement userName;
	WebElement userPassword;
	WebElement buttonElement;
	public void login(String user, String pass) {
		userName = driver.findElement(By.id("input-username"));
		userPassword = driver.findElement(By.id("input-password"));	
		buttonElement= driver.findElement(By.cssSelector("button[class='btn btn-primary']"));	
		userName.sendKeys(user);
		userPassword.sendKeys(pass);
		buttonElement.click();
	}
}
