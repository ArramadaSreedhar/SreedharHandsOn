package com.poc;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ldt=LocalDateTime.of(2016,11,28, 9,30,20);
		
		ZonedDateTime zdt= ldt.atZone(ZoneId.of("America/Los_Angeles"));
		System.out.println(zdt);
		
	}

}
