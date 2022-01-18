

package com.byeon.s3.ex4.calendar;

import java.util.Calendar;

public class CalendarStudy3 {

	public static void main(String[] args) {

		//1초 = 1000millis
		//1분 = 60초
		//1시간 = 60분
		//하루 = 24시간
		//1년 = 365일
		//System.out.println(1000*60*60*24*365);
		Calendar ca = Calendar.getInstance();
		Calendar ca2 = Calendar.getInstance();
		
		//현재 시간
		ca.getTime();
		
		//2시간 뒤
		ca2.set(Calendar.HOUR_OF_DAY, 17);
		ca2.getTime();
		
		//둘간의 시간차를 구하려함
		System.out.println(ca.getTime());
		System.out.println(ca2.getTime());
		
		long l1 = ca.getTimeInMillis();
		long l2 = ca2.getTimeInMillis();
		long result = l2 - l1;
		System.out.println(result);
		System.out.println(result/1000);//초단위
		System.out.println(result/(1000*60));//분단위
		System.out.println(result/(1000*60*60));//시단위
		System.out.println(result/(1000*60*60*24));//일단위
		System.out.println(result/(1000*60*60*24*365));//년단위
		
		
		
		
		
	}

}


