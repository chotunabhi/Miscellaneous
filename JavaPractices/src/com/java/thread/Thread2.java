package com.java.thread;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread 2");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread 2 : "+1);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread 2 closing");
	}

}
