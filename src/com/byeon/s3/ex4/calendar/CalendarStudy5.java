

package com.byeon.s3.ex4.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarStudy5 {

	public static void main(String[] args) {
		
		Calendar ca = Calendar.getInstance();
		
		//카카오택시
		//30분 소요 예정
		//도착 예정 시간은?
		//1000*60*30 - 30분에 관련된 밀리세컨즈
		System.out.println(ca.getTime());
		
		long time = ca.getTimeInMillis();
		time = time+(1000*60*30);
		ca.setTimeInMillis(time);// 30분뒤 미래시간의 밀리세컨즈로 지금 시간을 설정함
		
		System.out.println(ca.getTime());

		ca.roll(Calendar.MINUTE, 70);
		
		System.out.println(ca.getTime());
		
		ca.add(Calendar.MINUTE, 70);
		
		System.out.println(ca.getTime());
		//2022년 01월 14일 - 16:44:11
		
		String pattern = "yyyy년MM월dd일 - HH:mm:ss";
		
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String r =sd.format(ca.getTime()); // 현재 칼랜더를 데이트 타입으로 변환해서 하는것(gettime)
		System.out.println(r);
		
		pattern = "yyyy-MM-dd (E)";
		sd.applyPattern(pattern);
		
		System.out.println(sd.format(ca.getTime()));

		
	}

}


