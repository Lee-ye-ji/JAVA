package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class B_CalendarTest {
	// 2. Calendar(java.util)
	// 	  GregorianCalendar(java.util) => Calendar�� �ļ� Ŭ����
	public void method1() {
		// 1. Calendar�� ���� ��¥ �����ϱ�
		Calendar cToday = Calendar.getInstance();
		// -> �����ڰ� protected�̹Ƿ� new �����ڸ� ���� ��ü ���� �Ұ�
		
		// 2. GregorianCalendar�� ���� ��¥ �����ϱ�
		GregorianCalendar gToday = new GregorianCalendar();
		
		// ��, ��, ��, ��, ��, �� ������ �ʵ�(��� ����)�� �̿��Ͽ� ���� �ٷ� �� ����
		int year = cToday.get(Calendar.YEAR);
		int month = cToday.get(Calendar.MONTH);
		int date = cToday.get(Calendar.DATE);
		int ampm = cToday.get(Calendar.AM_PM);
		int hour = cToday.get(Calendar.HOUR);
		int min = cToday.get(Calendar.MINUTE);
		int sec = cToday.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "����" : "����";
		
		System.out.printf("%d�� %02d�� %02d�� %s %02d�� %02d�� %02d�� \n",
				year, month, date, sAmPm, hour, min, sec);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// format()�� �Ű������� Date Ÿ������ ���� �Ǿ�� ��
		// Calendar -> Date
		String formatDate = sdf.format(cToday.getTime());
		System.out.println(formatDate);
		
		// �Ű������� ��, ��, ��, ��, ��, �� �����ϸ鼭 ��ü ���� or set~()�� ����
		Calendar c = new GregorianCalendar(2020, 10, 26, 11, 9, 0);
		String formatDate2 = sdf.format(c.getTime());
		System.out.println(formatDate2);
		
		
		
	}

}
