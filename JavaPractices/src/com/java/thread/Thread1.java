package com.java.thread;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 5; i++){
			System.out.println("Thread 1 : "+i);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Thread 1 closing");
	}

}
