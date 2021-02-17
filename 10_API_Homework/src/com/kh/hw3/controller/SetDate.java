package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SetDate {
	
	public SetDate() {}
	
	public String todayPrint() {
		//������ ��, ��, ��, ��, ��, �ʸ� ��
		//������ ���� �� ������ String����
		//����

		Calendar cToday = new GregorianCalendar();;
		
		// ��, ��, ��, ��, ��, �� ������ �ʵ�(��� ����)�� �̿��Ͽ� ���� �ٷ� �� ����
		int year = cToday.get(Calendar.YEAR);
		int month = cToday.get(Calendar.MONTH);
		int date = cToday.get(Calendar.DATE);
		int hour = cToday.get(Calendar.HOUR);
		int min = cToday.get(Calendar.MINUTE);
		int sec = cToday.get(Calendar.SECOND);
		
		
		return year + "�� "  + month + "�� " + date + "�� "  + hour + "�� " + min + "�� " + sec + "�� ";
		
	}
	
	public String setDay() {
		//��2011�� 3�� 21�� �����ϡ��� �ش��ϴ� ��¥�� 
		//Calendar Ŭ������ �����ϰ� 
		//SimpleDateFormat Ŭ������ ����Ͽ� ����
		Calendar cToday = new GregorianCalendar(2011, 3-1, 21);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� d�� E����");
		
		String formatDate = sdf.format(cToday.getTime());
		return formatDate;
	}

}
