package com.java.thread;

public class PrintNumbers {
	boolean isEven = false;
	public synchronized void printOdd(int n){
		if(isEven){
			
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(n);
			isEven = true;
			notify();
			
	}
	
	public synchronized void printEven(int n){
		if(!isEven){
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(n);
			isEven = false;
			notify();
			
	}
}
