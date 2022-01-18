

package com.byeon.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy4 {

	public static void main(String[] args) {
		
		//1초 = 1000millis
		//1분 = 60초
		//1시간 = 60분
		//하루 = 24시간
		//1년 = 365일
		
		//현재 시간
		Calendar ca = Calendar.getInstance();
		System.out.println(ca.getTime());
		
		//태어난 날 //2000 1 14
		Calendar ca2 = Calendar.getInstance();
		ca2.set(1993, 1, 23);
		System.out.println(ca2.getTime());
		
		//태어나서 지금까지 며칠이 지났는가
		//365*20살
		long l1 = ca2.getTimeInMillis();
		long l2 = ca.getTimeInMillis();
		long result = l2 - l1;
		System.out.println(result/(1000*60*60*24));
		
		//나이
		System.out.println(result/(1000*60*60*24*365.2425));
		
		
	}

}


