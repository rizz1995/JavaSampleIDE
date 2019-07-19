package com.hariz.sample;

public class SampleA {
	
	String myName = "";
	
	public SampleA(String myName) {
		this.myName = myName;
	}
	@Override
	public String toString() {
		return "SampleA";
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		boolean isEqual = false;
		
		if (obj instanceof SampleA) {
			
			String objName = ((SampleA) obj).toString();
			
			if (objName.equals(this.myName)) {
		
				isEqual = true;
			}	
		}
		return isEqual;
	}
	
}
