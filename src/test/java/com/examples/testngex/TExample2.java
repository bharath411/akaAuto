package com.examples.testngex;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TExample2 {

	@Test
	public void login() {
		System.out.println("I am login");
	}
	
	@Test
	public void logout() {
		System.out.println("I am logout");
	}
	
	@BeforeClass
	public void sam() {
		System.out.println("I am first to be execute");
	}
	
	@Test
	public void updateProfile() {
		System.out.println("Update profile");
	}
}
