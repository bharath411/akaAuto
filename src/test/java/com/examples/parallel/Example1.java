package com.examples.parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example1 {

	@BeforeClass
	public void before() {
		System.out.println("Example 1 class started at - " + System.currentTimeMillis());
	}
		
	@AfterClass
	public void tearDown() {
		System.out.println("Example 1 ended at - " + System.currentTimeMillis());
	}
	@Test
	public void test1() {
		System.out.println("Example 1 - test1 started at - " + System.currentTimeMillis());
		sleep(2);
		System.out.println("Example 1 - test1 ended at - " + System.currentTimeMillis());
	}

	@Test
	public void test2() {
		System.out.println("Example 1 - test2 started at - " + System.currentTimeMillis());
		sleep(4);
		System.out.println("Example 1 - test2 ended at - " + System.currentTimeMillis());
	}
	
	@Test
	public void test3() {
		System.out.println("Example 1 - test3 started at - " + System.currentTimeMillis());
		sleep(1);
		System.out.println("Example 1 - test3 ended at - " + System.currentTimeMillis());
	}
	
	
	@Test
	public void test4() {
		System.out.println("Example 1 - test4 started at - " + System.currentTimeMillis());
		sleep(8);
		System.out.println("Example 1 - test4 ended at - " + System.currentTimeMillis());
	}
	
	@Test
	public void test5() {
		System.out.println("Example 1 - test5 started at - " + System.currentTimeMillis());
		sleep(6);
		System.out.println("Example 1 - test5 ended at - " + System.currentTimeMillis());
	}
	
	@Test
	public void test6() {
		System.out.println("Example 1 - test6 started at - " + System.currentTimeMillis());
		sleep(16);
		System.out.println("Example 1 - test6 ended at - " + System.currentTimeMillis());
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
