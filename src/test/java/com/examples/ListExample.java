package com.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.testng.annotations.Test;

public class ListExample {

	@Test
	public void test1() {
		
		ArrayList list  = new ArrayList();
		
		list.add("bharath");
		list.add("kumar");
		list.add("bharath");
		
		Object o = list.get(0);
		//Type casting
		for(int i =0;i< list.size(); i++) {
			Object obj = list.get(i);
			String st = (String) obj;
			System.out.println(st);
		}
		
		//add
		//get
		//size
			
		// Generic
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("ff");
		list2.add("sd");
		list2.add("aa");
		list2.add("33e");
		
		
		for(int i = 0;i<list2.size();i++) {
			String st = list2.get(i);
			System.out.println(st);
		}
		
		//for-each
		
		for ( String bb : list2  ) {
			System.out.println(bb);
		}
		
		//Wrapper classes
			//int -Integer
			//float - Float
		//char - Character
		
		
		List<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(19);
		ar2.add(339);
		ar2.add(33);
		ar2.add(56);
		
		for( Integer  ss : ar2) {
			System.out.println(ss);
		}
		
		// List --- added , get , size  -- > for , for each, generic , wrapper  , allows duplicates, index based.
		
		HashSet<Long> set = new HashSet<Long>();
		set.add(10111l);
		set.add(232l);
		
		for( Long ll : set) {
			System.out.println(ll);
		}
		System.out.println(set.size());
		
	}
}
