package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_DateTest {
	// 1. Date(java.util)
	public void method1() {
		// �⺻ ������ -> Date Ŭ������ ���� ��¥ ����
		Date today = new Date(); // JVM�� �����ϴ� ���� ��¥�� ���� ����
		System.out.println("�⺻ ������(���� ��¥) : " + today);
		
		// �Ű����� ������(Long�� ����) -> 
		Date when = new Date(1234567890L);
		// -> 1970�� 1�� 1�� 0�� 0�� 0�ʺ��� ����� ��¥�� �ð��� ������ ��ü�� ����(�и����� ����)
		System.out.println("�Ű����� ������(Long��) " + when);
		System.out.println();
		
		// �Ű����� ������ -> 2020�� 10�� 26�� ��¥ ����
		System.out.println("===== 2020�� 10�� 26�� =====");
		Date date = new Date(2020-1900, 10-1, 26);
		// -1900��, ���� 0���� ����
		System.out.println("year, month, date ������ :" + date);
		// �ð��� ���Ű������� �������� ������ 0�� 0�� 0�ʷ� ��
		
		// �⺻ �����ڷ� ���� �� set�޼ҵ带 ���� �� �ʱ�ȭ
		Date date2 = new Date();
		date2.setYear(2020 - 1900);
		date2.setMonth(10 - 1);
		date2.setDate(26);
		
		System.out.println("set~() �̿��� �ʱ�ȭ : " + date2);
		
		// get~()���
		System.out.println(date2.getYear() + 1900 + "��");
		System.out.println(date2.getMonth() + 1 + "��");
		System.out.println(date2.getDate() + "��");
		System.out.println(date2.getHours() + "��");
		System.out.println(date2.getMinutes() + "��");
		System.out.println(date2.getSeconds() + "��");
		
		// deprecated -> ���� �� ������ ���� ������ ������� ���� ���� �ǰ�
		// Date Ŭ���������� �⺻ ������, �Ű����� ������ (long��) ���
		
		// Ư�� ���·� ��¥�� ����ϰ� ���� �� SimpleDateFormat Ŭ���� ���
		// �Ű������� ���� ����
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� hh�� mm�� ss��");
		String formatDate = sdf.format(date2); //�Ű������� Date Ÿ���� ��ü ����
		System.out.println(formatDate);
		
		
	}

}
