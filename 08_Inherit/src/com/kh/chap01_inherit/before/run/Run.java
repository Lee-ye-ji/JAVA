package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

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
		
		// �� ������ Ŭ�������� �������� �ʵ�� �޼ҵ尡 ������
		// �̷��� �ߺ��� �θ� Ŭ������ �����Ͽ� �ߺ��ڵ���� ������ �� �ְ�
		// ������ ���� ���������� �� ���� ���� ������ �ʿ� ���� �θ� Ŭ������ �����ϸ� ��ü������ �ݿ��� ��
		
		// �귣��, ��ǰ�ڵ�, ��ǰ��, ���� --> Product
		
		
		
		
		
		
		
		
		

	}

}
