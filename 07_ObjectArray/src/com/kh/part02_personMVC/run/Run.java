package com.kh.part02_personMVC.run;

import com.kh.part02_personMVC.view.PersonMenu;

// ȸ���� �����ϴ� ���α׷��� MVC ������ �̿���
// ȸ�� �߰�, ��ü ��ȸ, �̸� �˻�, ��� ��� ��ȸ ����� ����

// MVC �����̶�?
// ������ ���� �� �ϳ��� MVC�� Model, View, Controller�� ����

// Model : data, ������ ������ å������ ��Ʈ
// vo -> value object (���� ���� ��ü)

// View : ����� �������̽�, ������ ����� ��Ʈ

// Controller : �����Ϳ� ����� �������̽��� �մ� �ٸ� ����
// ������� ������ Ŭ��, ���� ���� �̺�Ʈ ó��

// �̷��� MVC ������ ������ ����Ͽ� �뵵�� ���� ������ �θ�
// ����������, Ȯ�强, ������ ����

public class Run {

	public static void main(String[] args) { // 1. ������
		// 2. ����ڰ� �� view ȭ������ �̵�
		new PersonMenu().mainMenu();
		
		

	}

}
