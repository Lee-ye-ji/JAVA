package com.kh.part01_thread.thread;

// ������ ���� ��� 1. Thread Ŭ���� ��� �޴� ���
public class Thread1 extends Thread{
	// ��� ó�� �� run() �޼ҵ� �������̵�
	@Override
	public void run() {
		// -> �۾��ϰ��� �ϴ� �ڵ� �ۼ�
		for(int i =1; i <= 10; i++) {
			// getName(): �ش� �����尡 ���� �̸��� ������
			System.out.println(getName() + "[" + i + "]");
		}
	}

}
