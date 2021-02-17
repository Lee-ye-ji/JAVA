package com.kh.hw3.run;

import com.kh.hw3.controller.SetDate;

public class Run {

	public static void main(String[] args) {
		// SetDate 객체를 이용하여
		// todayPrint(), setDay() 실행
		SetDate sd = new SetDate();
		System.out.println(sd.todayPrint());
		System.out.println(sd.setDay());

	}

}
