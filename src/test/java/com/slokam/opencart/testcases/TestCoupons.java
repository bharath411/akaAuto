package com.slokam.opencart.testcases;

import org.testng.annotations.Test;

import com.slokam.opencart.pages.AdminLoginPage;
import com.slokam.opencart.pages.CouponsPage;
import com.slokam.opencart.pages.DashboardPage;

public class TestCoupons extends BaseTestCase{

	@Test
	public void testAddCoupon() {
		
		AdminLoginPage alogin = new AdminLoginPage(driver);
		alogin.login("demo", "demo");
		
		DashboardPage dpage = new DashboardPage(driver);
		dpage.clickOnCoupons();
		
		CouponsPage cpage = new CouponsPage(driver);
		cpage.createCoupon();
		
		
	}
}
