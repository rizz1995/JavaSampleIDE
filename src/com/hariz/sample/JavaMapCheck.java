package com.hariz.sample;

import java.util.*;

public class JavaMapCheck {

	public static void main(String[] args) {

		HashMap <String, String> map = new HashMap<String, String>();
		
		int i = 1;
		for (String s: args) {
			
			
			map.put(Integer.toString(i), s);
			i++;
		}
		
		System.out.println(map);
		System.out.println("First element: " + map.get("1"));
		
	}

}
