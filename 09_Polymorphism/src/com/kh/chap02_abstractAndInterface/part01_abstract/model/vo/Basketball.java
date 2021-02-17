package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class Basketball extends Sports{
	// Sports를 상속 받는 순간 부모 클래스에 잇는 추상 메소드를 강제 오버라이딩 하게 함
	// 부모 클래스에서 rule()이라는 메소드가 미완성 상태이므로 자식인 Basketball이 오버라이딩하여 완성하라는 의미
	
	@Override
	public void rule() {
		System.out.println("공을 던져 링에 넣어야 한다.");
	}

}
