package com.hariz.sample;

import java.util.*;

public class UtilCheck {

	public static void main(String[] args) {
		
		/* ** non-generic **
		List list =new ArrayList();
		
		list.add("Hello");
		
		String s =  (String) list.get(0);
		
		*/
		
		/* **Generic** */
		
		List<String> list =new <String> ArrayList(); //array list
		
		list.add("Hello");
		list.add("I");
		list.add("am");
		list.add("Java");
		list.add("ArrayList");
		
		//String s = list.get(0);
		
		/*for (String s : list) { //for-each
			System.out.print(s + " ");
		}*/
		
		/*
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");			
		}*/
		
		for (Iterator<?> it = list.iterator(); it.hasNext();) { //iterator
		
			String s = (String) it.next();
			if (s.equals("Java")) {
				System.out.println("I got: " + s);
			}
		}
		
	}

}
