package com.java.thread;

public class OddThread implements Runnable{
	private PrintNumbers pn;
	private int n;
	
	public OddThread() {
		pn = new PrintNumbers();
		
	}
	public OddThread(PrintNumbers pn,int n) {
		this.pn = pn;
		this.n = n;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i = 1;i<n ;i++)
			if(i%2 != 0)
				pn.printOdd(i);
	}

}
