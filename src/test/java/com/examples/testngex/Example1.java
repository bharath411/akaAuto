package com.examples.testngex;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Example1 {

	@Test
	public void test1() {
		System.out.println("I am test1");
		System.out.println("Added method test1");
		System.out.println("One more example");
	}
	
	@Test
	@Parameters(value= {"user"})
	public void test2(String username) {
		System.out.println("I am test2 " + username);
	}
	
	@Test
	@Parameters(value= {"user","password"})
	public void test3(String username,String password) {
		System.out.println("I am test3 " + username + " : "  + password);
	}
	
	@Test
	@Parameters(value= {"browser"})
	public void test4(@Optional("firefox") String browser) {
		System.out.println("I am test2 " + browser);
	}
	
}
