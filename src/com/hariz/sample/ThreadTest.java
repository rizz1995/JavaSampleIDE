package com.hariz.sample;

public class ThreadTest extends Thread{
//public class ThreadTest{

	@Override
	public void run() {
	//public void start() {
		try {
			long l = (long) (Math.random() * 100);
			
			System.out.println("I am a new thread running : " + this.getName() + " " + this.getPriority() + " running: " + l);
			Thread.sleep(2000);
			System.out.println(this.getName() + " just go up : " + l);
		
		} catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		t1.setPriority(MIN_PRIORITY);
		ThreadTest t2 = new ThreadTest();
		t2.setPriority(NORM_PRIORITY);
		ThreadTest t3 = new ThreadTest();
		t3.setPriority(MAX_PRIORITY);
		ThreadTest t4 = new ThreadTest();
		ThreadTest t5 = new ThreadTest();
		
		t1.start(); //make the state runnable
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
