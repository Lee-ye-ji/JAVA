package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SetDate {
	
	public SetDate() {}
	
	public String todayPrint() {
		//오늘의 년, 월, 일, 시, 분, 초를 각
		//변수에 담은 후 오늘을 String으로
		//리턴

		Calendar cToday = new GregorianCalendar();;
		
		// 년, 월, 일, 시, 분, 초 정보를 필드(멤버 변수)를 이용하여 각각 다룰 수 있음
		int year = cToday.get(Calendar.YEAR);
		int month = cToday.get(Calendar.MONTH);
		int date = cToday.get(Calendar.DATE);
		int hour = cToday.get(Calendar.HOUR);
		int min = cToday.get(Calendar.MINUTE);
		int sec = cToday.get(Calendar.SECOND);
		
		
		return year + "년 "  + month + "월 " + date + "일 "  + hour + "시 " + min + "분 " + sec + "초 ";
		
	}
	
	public String setDay() {
		//“2011년 3월 21일 월요일”에 해당하는 날짜를 
		//Calendar 클래스로 세팅하고 
		//SimpleDateFormat 클래스를 사용하여 리턴
		Calendar cToday = new GregorianCalendar(2011, 3-1, 21);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 d일 E요일");
		
		String formatDate = sdf.format(cToday.getTime());
		return formatDate;
	}

}
