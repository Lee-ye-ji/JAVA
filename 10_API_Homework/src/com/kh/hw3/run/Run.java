package com.kh.hw3.run;

import com.kh.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {
		// SetDate ��ü�� �̿��Ͽ�
		// todayPrint(), setDay() ����
		SetDate sd = new SetDate();
		System.out.println(sd.todayPrint());
		System.out.println(sd.setDay());

	}

}
