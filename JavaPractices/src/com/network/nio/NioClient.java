package com.network.nio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class NioClient {
	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		Date stdDate = sdf.parse("01-01-0001");
		Date givenDate = sdf.parse("10-05-1988");
		
		Calendar calStd =  Calendar.getInstance();
		calStd.setTime(stdDate);
		
		Calendar calGiven = Calendar.getInstance();
		calGiven.setTime(givenDate);
		
		
		System.out.println(calGiven.get(Calendar.YEAR));
		System.out.println(stdDate+" "+givenDate);
		/*try {
			AsynchronousSocketChannel channel = AsynchronousSocketChannel.open();
			SocketAddress serverAddress = new InetSocketAddress("CIQNB458.CIQHYD.COM", 4001);
			Future<Void> result = channel.connect(serverAddress);
			result.get();
			System.out.println("Connected");

			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
}
