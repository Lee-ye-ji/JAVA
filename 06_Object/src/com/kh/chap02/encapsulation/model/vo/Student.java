package com.kh.chap02.encapsulation.model.vo;

public class Student {
	/* 1. 필드
	 * 
	 * 접근제한자 [예약어] 자료형 변수명;
	 * 
	 */
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	/* 2. 생성자 : 객체를 생성하기 위한 일종의 메소드
	 * 접근제한자 클래스명([매개변수]) {
	 * }
	 */
	public Student() { }
		
		/* 3. 메소드 : 기능을 구현하는 부분
		 * 접근제한자 반환형 메소드명([매개변수]){
		 * 
		 * }
		 */
		
		// 3_1. setter
		// 데이터(필드)들을 기록 및 수정하는 기능을 하는 메소드
		// 이 때 메소드는 외부 접근 가능하도록 해야하기 때문에 public 접근 제한자 사용
		// 반환형 없음 -> void
		// 메소드 명은 카멜 표기법을 이용하며 setXXX로 통상 지어줌
		// 매개변수명은 자유롭게 지정할 수도 있지만 관례상 필드명과 동일하게 사용함
		
		// 반환형이 없으므로 -> void
		public void setName(String name) {  // 이름을 변경해주는 메소드
			// name = name;
			// 매개변수의 name = 매개변수의 name;
			// {} 구역에서는 해당 지역에서 만들어진 변수가 우선순위가 높기 때문
			
			// 우리가 원하는 코드는
			// 필드의 name = 매개변수의 name;
			this.name = name;
			// this에는 해당 객체의 주소값이 담겨있음
		}
		
		public void setKor(int kor) { // 국어 점수를 변경해주는 메소드
			this.kor = kor;
		}
		
		public void setMath(int math) { // 수학 점수를 변경해주는 메소드
			this.math = math;
		}
		
		public void setEng(int eng) { // 영어 점수를 변경해주는 메소드
			this.eng = eng;
		}
		
	
		// 3_2. getter
		// 값을 반환해주는 기능을 하는 메소드
		// getter 메소드 명은 카멜 표기법을 이용하여 getXXX로 통상 지어줌
		// 접근제한자는 외부에서 접근 할 수 있어야 하므로 public
		// 필드 값을 반환해줘야 하므로 반환하고자하는 자료형을 반환형에 기재
		// getter메소드는 단지 해당 필드 값을 반환해주는 메소드로 해당 메소드로 전달되는 값이 없으므로
		// 매개변수는 작성할 필요가 없음
		
		public String getName() { // 반환형을 기재했을 경우 반드시 return 구문이 필요함
									// 종료해주는 기능 뿐만 아니라 값을 반환해 주는 기능을 가지고 있음
			return name;  // getter메소드 안에는 지역변수 name이 없으므로 this를 붙이지 않아도 필드 name을 인식함
		}
		
		public int getKor() {
			return kor;
		}
		
		public int getMath() {
			return math;
		}
		
		public int getEng() {
			return eng;
		}
		
		// 모든 필드 값을 다 합친 문자열을 반환하는 메소드
		public String information() {
			return "이름 : " + name + ", 국어 점수 : " + kor + ", 수학 점수 : " + math + ", 영어 점수 : " + eng;
		}

}
