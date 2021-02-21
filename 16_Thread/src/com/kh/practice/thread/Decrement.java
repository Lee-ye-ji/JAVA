package com.kh.practice.thread;

public class Decrement implements Runnable{
	private int num1;
	private int num2;
	
	public Decrement(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	public void run() {
		for(int i = num2; i >= num1; i--) {
			System.out.println("°¨¼Ò : " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
