package com.kh.part01_thread.run;

import com.kh.part01_thread.thread.Thread1;
import com.kh.part01_thread.thread.Thread2;

public class ThreadRun {

	public static void main(String[] args) {
		// 1. Thread�� ��� ���� Ŭ������ ��ü�� ���� �� ����
		Thread1 th1 = new Thread1();
		th1.start();
		// ��� ������� �������� �۾��� �����ϱ� ���� �ڽŸ��� ȣ�� stack�� �ʿ�� ��
		// ���ο� �����带 �����ϰ� ���� ��ų �� ���� ���ο� ȣ�� ������ �����ǰ�
		// �����尡 ����Ǹ� �۾��� ����� ȣ�� ������ �Ҹ�
		// -> start()�� ���ο� �����尡 �۾��� �����ϴµ� �ʿ��� ȣ�� ������ ������ ��
		// run()�� ȣ���ؼ� ������ ȣ�� ���ÿ� run()�� ù��°�� �ö󰡰� ��

		
		// 2. Runnable�� ������ Ŭ������ ��ü ���� �� ����
		/*Thread2 th2 = new Thread2();
		Thread th = new Thread(th2); */
		// Thread ��ü�� ������ �� �������� �Ķ���ͷ� Runnable ���� Ŭ���� ����
		
		Thread th2 = new Thread(new Thread2());
		th2.start();
		
		// 3. ������ ��ȣ��
		// th1.start();
		// �ѹ� ���� �� ������� �ٽ� ȣ�� �Ұ���
		
	}
	
	/* Runnable �������̽��� Thread Ŭ������ ������
	 * - Runnable �������̽��� ������ȭ �� �� �ִ� �޼ҵ带 �����ϴ� run() �޼ҵ带 ������ ����
	 * - Thread Ŭ������ Runnable �������̽��� ����ϰ� ������ �����带 Ȱ��ȭ�ϴ� start() �޼ҵ带 ������ ����
	 * - Thread Ŭ������ Thread�� ���¸� ������ �� �ִ� �޼ҵ带 ������ ����
	 * */
	
	// �ΰ��� ����� ���� ���� ������ Thread�� �����ؼ� �ؾ���

}
