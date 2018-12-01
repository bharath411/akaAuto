package com.examples;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Bharath {

	
	public void test1() {
		
		int i =10;
		int j =10;
		
		System.out.println(i == j);
		
		String st1 = new String("abcx");
		String st2 = new String("abcx");
		String st3 = st1;
		System.out.println(st1 == st2);
		System.out.println(st1==st3);
		
		A a1= new A();
		A a2 = new A();
		System.out.println(a1==a2);
		
		System.out.println(st1.equals(st2));
		
		String st4 = new String("sdf");
		System.out.println(st4.equals(st1));
		
		String st5 = "abcx";
		String st6 = "abcx";
		
		System.out.println(st5 == st1);
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		Bharath b = new Bharath();
		b.test1();
		
	}
}
