package com.kh.part01_thread.thread;

// 스레드 생성 방법 2. Runnable 인터페이스 구현 방법
public class Thread2 implements Runnable{
	
	@Override
	public void run() {
		// -> 작업하고자 하는 코드 작성
		for(int i = 0; i <= 10; i++) {
			// Thread 클래스를 상속 받은 것이 아니므로 바로 Thread의 getName()호출 불가
			// Thread 클래스의 static 메소드인 currentThread를 통해 현재 실행 중인 스레드 객체 반환
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
	}

}
