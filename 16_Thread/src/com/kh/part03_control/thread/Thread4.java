package com.kh.part03_control.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		// while문과 sleep(), IsInterrupted를 사용해서 10초 카운트 만들기
		// 중간에 종료할 수 있도록 만들기 -> interrupte사용 쓰레드 종료 가능!
		int cnt = 0;
		
		// 현재 cnt가 10이하이거나 현재 스레드의 interrupted가 false인 경우 반복문 진행
		while(cnt < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println(++cnt + "초");
			} catch (InterruptedException e) {
				// 스레드가 sleep() 작업을 처리하는 중  interrupt()를 호출하게 되면
				// 해당 스레드의 interrupted 값이 바뀌는 것이 아니라
				// InterruptedException이 발생하게 됨
				// Exception 발생 시 catch해서 현재 스레드를 다시 interrupt() 호출
				Thread.currentThread().interrupt();
				//e.printStackTrace();
			}
		}
		
	}

}
