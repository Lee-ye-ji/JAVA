package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class B_CalendarTest {
	// 2. Calendar(java.util)
	// 	  GregorianCalendar(java.util) => Calendar의 후손 클래스
	public void method1() {
		// 1. Calendar로 오늘 날짜 생성하기
		Calendar cToday = Calendar.getInstance();
		// -> 생성자가 protected이므로 new 연산자를 통해 객체 생성 불가
		
		// 2. GregorianCalendar로 오늘 날짜 생성하기
		GregorianCalendar gToday = new GregorianCalendar();
		
		// 년, 월, 일, 시, 분, 초 정보를 필드(멤버 변수)를 이용하여 각각 다룰 수 있음
		int year = cToday.get(Calendar.YEAR);
		int month = cToday.get(Calendar.MONTH);
		int date = cToday.get(Calendar.DATE);
		int ampm = cToday.get(Calendar.AM_PM);
		int hour = cToday.get(Calendar.HOUR);
		int min = cToday.get(Calendar.MINUTE);
		int sec = cToday.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "오전" : "오후";
		
		System.out.printf("%d년 %02d월 %02d일 %s %02d시 %02d분 %02d초 \n",
				year, month, date, sAmPm, hour, min, sec);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// format()의 매개변수는 Date 타입으로 전달 되어야 함
		// Calendar -> Date
		String formatDate = sdf.format(cToday.getTime());
		System.out.println(formatDate);
		
		// 매개변수로 년, 월, 일, 시, 분, 초 전달하면서 객체 생성 or set~()로 세팅
		Calendar c = new GregorianCalendar(2020, 10, 26, 11, 9, 0);
		String formatDate2 = sdf.format(c.getTime());
		System.out.println(formatDate2);
		
		
		
	}

}
