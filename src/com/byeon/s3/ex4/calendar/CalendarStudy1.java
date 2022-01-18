

package com.byeon.s3.ex4.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarStudy1 {

	public static void main(String[] args) {
		
		//Calendar는 추상 클래스
		//GregorianCalender가 Calendar 클래스 상속
		//Calendar의 메서드는 GregorianCalender에 있다
		
		//현재 날짜와 시간정보를 가지는 객체를 생성
		GregorianCalendar gc = new GregorianCalendar();
		
		Calendar calendar = new GregorianCalendar();
		
		Calendar ca = Calendar.getInstance();//실제로는 GregorianCalendar
		

		int y = ca.get(Calendar.YEAR);
		
		System.out.println("Y : " + y);
		
		int m = ca.get(Calendar.MONTH)+1;
		
		System.out.println("M : " + m);
		
		int d = ca.get(Calendar.DATE);
		
		System.out.println("D : " + d);
		
		int h = ca.get(Calendar.HOUR);
		int hh = ca.get(Calendar.HOUR_OF_DAY);
		
		System.out.println("H : " + h);
		System.out.println("HH : " + hh);
		
		int min = ca.get(Calendar.MINUTE);
		System.out.println("Min : " + min);
		
		int sec = ca.get(Calendar.SECOND);
		System.out.println("SEC : " + sec);
		
		int ms = ca.get(Calendar.MILLISECOND);
		//천분의 1초
		//1000 == 1초
		System.out.println("MS : " + ms);
		
		long millis = ca.getTimeInMillis();
		System.out.println("Millis : " + millis);
		
		Date date = ca.getTime();
		System.out.println(date);
		
	}

}






