package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	/* 캡슐화
	 * 
	 *  정의 : 추상화를 통해 정의 된 속성들과 기능을 하나로 묶여 관리하는 기법으로
	 *  	클래스의 가장 중요한 목적인 데이터 접근 제한을 원칙으로 하여 외부에서 데이터 직접 접근을 막고
	 *  	대신에 데이터를 처리하는 메소드들을 클래스 내부에 작성하여 데이터에 간접적으로 접근하는 방식을 말함
	 *  
	 *  1) 정보 은닉(private)
	 *  	추상화를 통해 선정 된 속성들(멤버 변수)에 외부로부터의 직접 접근을 막기 위해 private 접근 제한자 사용
	 *  	
	 *  2) setter/getter 메소드
	 *  	간접적으로 속성에 접근하여 값을 기록하고 조회해오는 메소드
	 *  
	 * */

	public static void main(String[] args) {
		Student st = new Student();
		/*st.name = "우별림";
		st.kor = 100;
		st.math = 90;
		st.eng = 80; */
		// -> private 접근 제한자를 통해 속성을 은닉하여 외부에서 직접 접근할 수 없음
		// -> 직접 접근을 막았다면 간접적으로 접근할 수 있게 class 내부에 기능을 정의해야 함 (settle/ getter 메소드)
		
		// 객체의 값 설정 -> setter
		st.setName("우별림");
		st.setKor(100);
		st.setMath(90);
		st.setEng(80);
		
		// 객체의 값 알아오기 -> getter
		System.out.println("이름 : " + st.getName());
		System.out.println("국어 점수 : " + st.getKor());
		System.out.println("수학 점수 : " + st.getMath());
		System.out.println("영어 점수 : " + st.getEng());
		
		// 한번에 모든 필드의 정보를 출력하는 information 메소드 호출
		System.out.println(st.information());
	}

}
