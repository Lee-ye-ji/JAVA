package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class GalaxyS10 extends SmartPhone{
	// 가져야 하는 기능들에 대해서 강제 오버라이딩
	
	@Override
	public void charge() {
		System.out.println("고속충전, 고속 무선 충전");
	}

	@Override
	public void makeaCall() {
		System.out.println("번호를 누르고 통화 버튼을 누름");
	}

	@Override
	public void takeaCall() {
		System.out.println("수신 버튼을 누름");
	}

	@Override
	public void picture() {
		System.out.println("1300만 듀얼 카메라");
	}

	@Override
	public void touch() {
		System.out.println("충전식, 와콜펜 지원");
	}

	@Override
	public void printMaker() {
		System.out.println("GalaxyS10은 삼성꺼~");
	}

}
