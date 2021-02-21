package com.kh.part02_scheduling.model.vo;

public class Car implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 150; i++) {
			System.out.println(i + " Car driving...");
		
			try {
				Thread.sleep(100);
				// 스레드를 지연시키는 메소드(0.01초)
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
