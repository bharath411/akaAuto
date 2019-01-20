package com.slokam.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Marketing {

	WebDriver driver;
	public Marketing(WebDriver driver){
		this.driver = driver;
	}
	
	public void markt(){
		
		driver.findElement(By.xpath("//*[@id='menu']/li[7]/a")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Mail')]")).click();
		
		
	WebElement element = driver.findElement(By.xpath("//*[@id='input-to']"));
	Select select = new Select(element);
	select.selectByVisibleText("Products");
	
driver.findElement(By.xpath("//*[@id='input-subject']")).sendKeys("hi");

driver.findElement(By.xpath("//*[@id='button-send']/i")).click();
	}
}
