package com.kh.practice.run;

import com.kh.practice.thread.Decrement;
import com.kh.practice.thread.Increment;

public class TestThread {
	/* ����� Ŭ���� : com.kh.pratice.run.TestThread
	 * Thread Ŭ���� : com.kh.practice.thread.Increment
	 * 				com.kh.practice.thread.Decrement
	 * 
	 * <���� ����>
	 * 1. �� Ŭ���� ��� Runnable �������̽� ��� ����
	 * 2. Increment Ŭ������ ������, ������ �ϳ� �ʱⰪ(50)���� ���� ����
	 * 		>> 1���� 50�� ������ ������ 2�� ������Ű�� ���� �ݺ���
	 * 		>> ���� �ϳ� ��� �� 0.05�� �����ְ� ��
	 * 3. Decrement Ŭ���� ���� ��, ������ �� ���� �ʱⰪ(12,45)���� ���޹���
	 * 		>> 45���� 12�� ������ 1�� ���ҽ�Ű�� ���� �ݺ���
	 * 		>> ���� �ϳ� ��� �� 0.1�� �����ְ� ��
	 * 4. ����� Ŭ�������� �� Ŭ������ ��Ƽ������ ��*/

	public static void main(String[] args) {
		Thread t1 = new Thread(new Increment(50));
		Thread t2 = new Thread(new Decrement(12, 45));
		
		t1.start();
		t2.start();

	}

}
