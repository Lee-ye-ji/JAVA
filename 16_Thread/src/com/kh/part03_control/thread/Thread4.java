package com.kh.part03_control.thread;

public class Thread4 implements Runnable{

	@Override
	public void run() {
		// while���� sleep(), IsInterrupted�� ����ؼ� 10�� ī��Ʈ �����
		// �߰��� ������ �� �ֵ��� ����� -> interrupte��� ������ ���� ����!
		int cnt = 0;
		
		// ���� cnt�� 10�����̰ų� ���� �������� interrupted�� false�� ��� �ݺ��� ����
		while(cnt < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println(++cnt + "��");
			} catch (InterruptedException e) {
				// �����尡 sleep() �۾��� ó���ϴ� ��  interrupt()�� ȣ���ϰ� �Ǹ�
				// �ش� �������� interrupted ���� �ٲ�� ���� �ƴ϶�
				// InterruptedException�� �߻��ϰ� ��
				// Exception �߻� �� catch�ؼ� ���� �����带 �ٽ� interrupt() ȣ��
				Thread.currentThread().interrupt();
				//e.printStackTrace();
			}
		}
		
	}

}
