package com.kh.chap01_inherit.after.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;
import com.kh.chap01_inherit.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// Desktop ��ü ����
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 2000000, true);

		// SmartPhone ��ü ����
		SmartPhone s = new SmartPhone("���", "s-01", "���̻�", 1500000, "KT");

		// Tv ��ü ����
		Tv t = new Tv("LG", "t-01", "�̳� ���� Ƽ��", 3500000, 46);

		// ���
		System.out.println(d.information());
		System.out.println(s.information());
		System.out.println(t.information());
		
		// �θ� ���� �ʵ忡 ����(�θ��� �޼ҵ带 ���ؼ�)
		System.out.println(d.getBrand());
		System.out.println(s.getpCode());
		System.out.println(t.getPrice());
		
		d.print();
		s.print();
		t.print();
		
		
	}
	
	/* * ����� Ư¡
	 * - Ŭ������ ��� ���� ���� ���� ��Ӹ� ����(�θ�� �ϳ�)
	 * - ��õǾ����� ������ ��� Ŭ������ Object Ŭ������ �ļ�
	 * --> ��, Object Ŭ������ �����ϴ� �޼ҵ���� ��� ��ü�� ����� �� ������
	 *     �������̵� �Ͽ� �޼ҵ� ���ۼ� ����
	 * - �θ� Ŭ������ ������, �ʱ�ȭ ����� ����� �� ��
	 * --> �ڽ� Ŭ���� �ȿ��� �θ� Ŭ������ ������ ȣ�� super() 
	 *  (�ڽ� ��ü ���� �� �θ� Ŭ���� �����ڰ� ���� ����)
	 * - �θ��� private ���(�ʵ�, �޼ҵ�)�� ����� ������ ���� ���� �Ұ� 
	 * (��, protected�� ���� �����ڸ� �ۼ��ϸ� �ļ� ��ü�� ���� ���� ����)
	 * --> setter/getter�� �̿��ؼ� ���������� �����ؾ���
	 */
	

}














