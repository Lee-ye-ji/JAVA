package com.kh.part02_scheduling.model.vo;

public class Plane implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(i + "Plane flight...");
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	}
}
