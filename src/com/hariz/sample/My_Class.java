package com.hariz.sample;

public class My_Class {
	
	public void displayMessage (Message m) {
		System.out.println(m.greet());
	}
	
	/*public abstract class My_class {
		public abstract void myMethod();
	}*/

	public static void main(String[] args) {
		//Instantiating the outer class
		Outer_Class outer = new Outer_Class();
		//Accessing the display_Inner() method
		outer.display_Inner();
		
		outer.myMethod();
		
		Outer_Class.Inner_Class2 inner = outer.new Inner_Class2();
		inner.print();
		
		//Pass anonymous inner class as a parameter
		//My_class obj = new My_class;
		
	
	}

}
