package com.java.thread;

public class ThreadManips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2000;
		PrintNumbers pn = new PrintNumbers();
		
		Thread et = new Thread(new EvenThread(pn,n));
		Thread ot = new Thread(new OddThread(pn,n));
		/*
		ot.start();
		et.start();*/
		String topic= "CIQDEV.PRICING.EOD.3232";
		String jmsTopic = "CIQDEV.PRICING.EOD.*";
		System.out.println(topic.matches(jmsTopic));
				
//				contains(jmsTopic.substring(0, jmsTopic.lastIndexOf('.'))));
		
	}

}
