package com.slokam.opencart.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.slokam.opencart.pages.AdminLoginPage;
import com.slokam.opencart.pages.Marketing;

public class Testprofile3 extends BaseTestCase {
	
	
	@Test
	public void prof(){
		AdminLoginPage ap = new AdminLoginPage(driver);
		ap.login("user", "user123");
		
		Marketing fd = new Marketing(driver);
		fd.markt();
		
		
			
		
	}

}
