package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public class Basketball extends Sports{
	// Sports�� ��� �޴� ���� �θ� Ŭ������ �մ� �߻� �޼ҵ带 ���� �������̵� �ϰ� ��
	// �θ� Ŭ�������� rule()�̶�� �޼ҵ尡 �̿ϼ� �����̹Ƿ� �ڽ��� Basketball�� �������̵��Ͽ� �ϼ��϶�� �ǹ�
	
	@Override
	public void rule() {
		System.out.println("���� ���� ���� �־�� �Ѵ�.");
	}

}
