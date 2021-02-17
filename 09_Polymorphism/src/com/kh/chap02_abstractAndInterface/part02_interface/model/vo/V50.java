package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class V50 extends SmartPhone{

	@Override
	public void charge() {
		System.out.println("고속 충전");
		
	}

	@Override
	public void makeaCall() {
		System.out.println("버튼을 누르고 통화 버튼을 누름");
	}

	@Override
	public void takeaCall() {
		System.out.println("수신 버튼을 누름");
	}

	@Override
	public void picture() {
		System.out.println("1200, 1600만 트리플 카메라");
	}

	@Override
	public void touch() {
		System.out.println("정전 식");
	}

	@Override
	public void printMaker() {
		System.out.println("V50,은 삼성꺼");
	}

	
}
