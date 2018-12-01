package com.sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample {

	ChromeDriver driver = null;
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.carwale.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	public void clickOnFindNewCars() {
		WebElement ele = driver.findElementByXPath("//li[@class='navbar-primary-link']//span[text()='New Cars']");
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		By by1 = By.xpath("//ul[@class='nested-panel-list']//a[text()='Find New Cars']");
		WebElement el =  driver.findElement(by1);
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(el)).click();;
	}
	
	public static void main(String[] args) {
		Sample sample = new Sample();
		sample.launchBrowser();
		sample.clickOnFindNewCars();
	}

}
