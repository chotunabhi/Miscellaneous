package com.java.thread;

import java.util.Calendar;

public class ThreadManips {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int n = 2000;
		long startTime = Calendar.getInstance().getTimeInMillis();
		PrintNumbers pn = new PrintNumbers();
		
		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());
		
		t1.start();
		t2.start();
		t1.join();
//		t1.join();
//		t2.join();
		long endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("Time taken : "+ timeDiff(endTime - startTime));
		System.out.println("End of main");
		
		System.out.println("this".compareTo(null));
		
	}
	
	public static String timeDiff(long diff) {
		String timeDiff = "";

		long diffSeconds = diff / 1000 % 60;
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);

		timeDiff = diffDays + " days, " + (diffHours > 9 ? diffHours : "0" + diffHours) + ":"
				+ (diffMinutes > 9 ? diffMinutes : "0" + diffMinutes) + ":"
				+ (diffSeconds > 9 ? diffSeconds : "0" + diffSeconds);

		return timeDiff;
	}


}
