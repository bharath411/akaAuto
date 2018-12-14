package com.examples.testngex;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TExample {

	public static Logger log = LogManager.getLogger(TExample.class);

	@Test
	public void test2() {
		System.out.println("I am test2");
		log.trace("I am trace message");
		log.debug("I am debug message");
		log.info("I am info message");
		log.warn("I am warn message");
		log.error("I am error message");
		log.fatal("I am fatal message");

	}

	@Test
	public void test3() {
		System.out.println("I am test3");
	}

	@Test
	public void test1() {
		System.out.println("I am test1");
	}

	@Test
	public void test4() {
		System.out.println("I am test4");
	}

	@BeforeMethod
	public void bf() {
		System.out.println("I am before meth");
	}

	@AfterMethod
	public void af() {
		System.out.println("I am after meth");
	}

	@BeforeClass
	public void bc() {
		System.out.println("I have to run only once , before any testcase");
	}

	@AfterClass
	public void ac() {
		System.out.println("After running all test cases , I have to run only that time");
	}

}
