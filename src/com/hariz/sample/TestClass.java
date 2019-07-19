package com.hariz.sample;

public class TestClass implements Inf2 {

	@Override
	public String whoAmI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testIt() {
		// TODO Auto-generated method stub
		System.out.println("Test it");
	}
	
	public static void main(String [] args){
		System.out.println("Inside TestClass main");
		System.out.println(name);
		//name = "New Name";
		TestClass test = new TestClass();
		test.testIt();
		System.out.println(Inf2.name);
		
		Inf2 obj = new TestClass();
		
		System.out.println(obj.whoAmI());
		obj.testIt();
	}

}
