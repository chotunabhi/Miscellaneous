package com.java.miscellanoeus;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.joda.time.DateTime;

public class TimeForamat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-DD T HH:MM:SS.sss");
		
		System.out.println(new DateTime("2016-03-30T09:35:35").getMillis());
		System.out.println(new DateTime(new DateTime("2016-03-30T09:35:35.365").getMillis()));
		
	}

}
