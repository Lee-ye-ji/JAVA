package com.kh.chap01.Abstraction.run;

import com.kh.chap01.Abstraction.model.vo.Student;

public class Run {
	/* 1. 현실에서의 객체 : 사전적 의미로 독립적으로 존재하는 어떤 것들(무형, 유형, 사물, 개념 ...)
	 * 2. 자바에서의 객체 : new 연산자를 통해 메모리 영역에 생성 된 것
	 * 3. 객체 지향 프로그램(OOP - Object Oriented Programming)
	 * 		: 현실 세계의 어떠한 객체들간의 상호 작용 -> 프로그래밍을 통해 코드로 구현
	 * 4. 객체를 만들기 위해서는? 추상화, 캡슐화 과정을 통해 클래스를 만들어야함
	 * 		클래스란? 객체의 특성(속성, 기능)에 대해 정의 한 것으로 마치 제품의 설계도나 틀
	 * 5. 추상화 과정
	 *  1) 구현하고자 하는 프로그램에서 필요한 객체들을 생각
	 *  2) 그 객체들이 가지는 공통적인 속성, 기능들을 모두 추출
	 *  3) 프로그램의 목적에 맞춰 불필요한 속성, 기능 제거
	 */

	public static void main(String[] args) {
		/// 학생 관리 프로그램 ///
		// 변수(하나의 자료형, 하나의 값)만을 가지고 프로그램밍 한다면?
		String name1 = "우별림";
		int kor1 = 100;
		int math1 = 99;
		int eng1 = 98;
		// 수 백명의 학생이 있다면 변수의 개수가 너무 늘어나 관리하기 어려운
		
		// 배열(하나의 자료형, 여러 개의 값)을 가지고 프로그래밍 한다면?
		String[] name = {"우별리", "김영희"};
		int[] kor = {100, 70};
		int[] math = {99, 80};
		int[] eng = {98, 90};
		// 변수만을 사용했을 떄보다는 효율적이지만 한 명이 전학을 가게 된다면?
		// 해당 학생의 정보를 지울 떄 일일히 해당 학생의 인덱스를 찾아 모든 배열에서 삭제
		// 혹시라도 실수가 있을 경우 데이터 불일치 
		
		// 따라서클래스(틀)을 만들어 객체들을 찍어내자
		// 클래스(틀)을 만들고 자바에서의 객체 형태로 만들기 위해서 new 연산자를 통해 heap영역에 객체를 생성함
		Student lim = new Student();  // lim은 레퍼런스 변수
		lim.name = "우별림";
		lim.kor = 100;
		lim.math = 99;
		lim.eng = 98;
		// 객체에 직접 접근하여 값 초기화 함.
		
		System.out.println(lim.name + "님의 국어점수는 " + lim.kor + "이고, 수학점수는"
				+ lim.math + "이며, 영어점수는 " + lim.eng + "입니다.");
		// 객체에 직접 접근하여 값 가져오기
		
		Student dong = new Student();
		dong.name = "홍길동";
		dong.kor = 30;
		dong.math = 40;
		dong.eng = 50;
		
		System.out.println(dong.name + "님의 국어점수는 " + dong.kor + "이고, 수학점수는"
				+ dong.math + "이며, 영어점수는 " + dong.eng + "입니다.");
		
		
		//  *** 여기서 발생할 수 있는 문제 ***
		// 이런식으로 "직접 접근" 해서 작업하게 되면 클래스 외부에서도 직접 접근을 통해 값 변경 가능
		// 즉, public으로 작업을 하게 되면 외부에서 직접 접근해서 값을 변질 시킬 수 있음
		// -> 캡슐화 작업이 필요함
		
	}

}
