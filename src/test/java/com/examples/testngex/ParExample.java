package com.examples.testngex;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ParExample {

	@BeforeClass
	public void before() {
		System.out.println("ParExample class started at - " + System.currentTimeMillis());
	}
		
	@AfterClass
	public void tearDown() {
		System.out.println("ParExample ended at - " + System.currentTimeMillis());
	}
	@Test
	public void test1() {
		System.out.println("ParExample - test1 started at - " + System.currentTimeMillis());
		sleep(2);
		System.out.println("ParExample - test1 ended at - " + System.currentTimeMillis());
	}

	@Test
	public void test2() {
		System.out.println("ParExample - test2 started at - " + System.currentTimeMillis());
		sleep(4);
		System.out.println("ParExample - test2 ended at - " + System.currentTimeMillis());
	}
	
	@Test
	public void test3() {
		System.out.println("ParExample - test3 started at - " + System.currentTimeMillis());
		sleep(1);
		System.out.println("ParExample - test3 ended at - " + System.currentTimeMillis());
	}
	
	
	@Test
	public void test4() {
		System.out.println("ParExample - test4 started at - " + System.currentTimeMillis());
		sleep(8);
		System.out.println("ParExample - test4 ended at - " + System.currentTimeMillis());
	}
	
	@Test
	public void test5() {
		System.out.println("ParExample - test5 started at - " + System.currentTimeMillis());
		sleep(6);
		System.out.println("ParExample - test5 ended at - " + System.currentTimeMillis());
	}
	
	@Test
	public void test6() {
		System.out.println("ParExample - test6 started at - " + System.currentTimeMillis());
		sleep(16);
		System.out.println("ParExample - test6 ended at - " + System.currentTimeMillis());
	}
	
	public void sleep(int sec) {

		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
