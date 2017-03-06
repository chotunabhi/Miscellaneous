package com.java.thread;

public class EvenThread implements Runnable{
	private PrintNumbers pn;
	private int n;
	
	public EvenThread() {
		pn = new PrintNumbers();
		
	}
	public EvenThread(PrintNumbers pn,int n) {
		this.pn = pn;
		this.n = n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 2;i<n ;i++)
			if(i%2 == 0)
				pn.printEven(i);
	}

}
