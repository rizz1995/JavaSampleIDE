package com.hariz.sample;

public class TernaryOperator {
	public static void main(String [] args){
		String strInput = "";
		try{
		
		strInput = args[0];
		
		//System.out.println(strInput instanceof Integer);
		
		int input = Integer.parseInt(strInput);
		
		int target = 0;

		/*if (input > 10) {
			target = 10;
		}
		else {
			target = input;
		}*/
		target = (input > 10) ? 10 : input;

		outer: for (int i=0; i<target ;i++) {
			for (int j=0; j<target; j++) {
				if (j > i) {
					System.out.println("L");
					continue outer;
				}
				System.out.println(" " + (i * j));
			}
			//System.out.println(" " + (i * j));
		}
		System.out.println();
		
		//Arithmetic
		
		int num = 10;
		int result = num/input;
		System.out.println("Result: " + result);
		
	} catch (NumberFormatException ex) {
		System.out.println("Error. Please give a number!!! : " + strInput);
		System.out.println();
		//ex.printStackTrace();
	 } catch (Exception ex) {
			System.out.println("Something is wrong ");
			System.out.println();
			ex.printStackTrace();
		 } finally {
		 System.out.println("Done");
	   }
	 }
	}