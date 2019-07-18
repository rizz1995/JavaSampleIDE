package com.hariz.sample;

public class TestRunner {
	
	public static void main(String [] args){
		System.out.println("Inside TestClass main");
		System.out.println(name);
		//name = "New Name";
		TestRunner test = new TestRunner();
		test.testIt();
		System.out.println(Inf2.name);
		
		Inf2 obj = new TestRunner();
		
		System.out.println(obj.whoAmI());
		obj.testIt();
	}

}
