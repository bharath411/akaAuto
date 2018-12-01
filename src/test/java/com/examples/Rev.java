package com.examples;

public class Rev {

	public String reverse(String name) {
		
		
		String reversed = "";
		
		for (int i = name.length()-1; i >=0 ; i--) {
			reversed = reversed + name.charAt(i) ;
		}
		return reversed;
	}
	
	public static void main(String[] args) {
		Rev r = new Rev();
		String rr = r.reverse("bharath kumar reddy kristipati");
		System.out.println(rr);
	}
}
