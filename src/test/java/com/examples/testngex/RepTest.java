package com.examples.testngex;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class RepTest {
	// Create extent reports
	ExtentReports report = null;
	@BeforeClass
	public void init() {
		report  = new ExtentReports();
		ExtentReporter reporter = new ExtentHtmlReporter("target/extent.html");
		report.attachReporter(reporter);
	}

	@Test
	public void testAdd() {
		ExtentTest test1 = report.createTest("testAdd");
		int a = 10;
		int b = 20;
		int c = a + b;
		test1.debug("a = " + a + " : b = " + b);
		test1.info("c = " + c);
		Assert.assertEquals(c, 30);
		test1.pass(" testAdd is pass");

	}
	
	

	@Test
	public void testSub() {
		ExtentTest test1 = report.createTest("testSub");
		int a = 10;
		int b = 20;
		int c = a - b;
		test1.debug("a = " + a + " : b = " + b);
		test1.info("c = " + c);
		if(c==10) {
			test1.pass(" testSub is pass");
		}else {
			test1.fail("test sub got failed");
			Assert.fail();
		}
		

	}
	
	@AfterClass
	public void tearDown() {
		report.flush();
	}
}
