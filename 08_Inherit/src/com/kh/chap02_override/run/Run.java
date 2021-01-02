package com.kh.chap02_override.run;

import com.kh.chap02_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book bk1 = new Book("������ ����", "������", 100);
		Book bk2 = new Book("Ī���� ���� ���߰� �Ѵ�", "��", 300);
		
		// System.out.println(bk1.information());
		// System.out.println(bk2.information());
		
		// 1. toString()
		// �������̵� �� : Object Ŭ������ toString() ����
		// => Ǯ��Ű����+@+��ü�� �ؽ��ڵ��� 16������
		// �������̵� �� : Book Ŭ������ toString() ����
		// => ���ۼ� �� ������ �ش� ��ü�� ������ �ִ� ��� ���� ���� ����(information�� ��ü)
		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		
		System.out.println(bk1);
		System.out.println(bk2);
		// ��¹����� � ���۷����� ����ϰ��� �� �� JVM�� �ڵ����� �ش緹�۷���.toString() �޼ҵ带 ȣ��
		// ���� .toString() ������� �ʾƵ� �˾Ƽ� ȣ�� ��
		
		// 2. equals()
		Book bk3 = new Book("������ ����", "������", 100);	// bk1�� �ʵ� ���� ��� ������ bk3 ��ü ����
		
		System.out.println("bk1�� bk3�� ���� å�Դϱ� ? " + (bk1 == bk3));
		System.out.println("bk1�� bk3�� ���� å�Դϱ� ? " + (bk1.equals(bk3)));
		
		// �ƹ��� ��� ���� �ʵ� ���� ������ �־ Object Ŭ������ �ִ� equals �޼ҵ带 ����ϰ� �Ǹ�
		// �ּҰ� �񱳸� �ϹǷ� equals() ȣ�� �ÿ��� false��� ����� ����
		
		// ���߿� �÷����� ��� �� �� ��ü�� ���� �ʵ� ���� ���� ��� �ߺ��̶� �Ǵ��ϰ� �ߺ� ���Ÿ� �ϴ� ��� ��
		// �ʵ� �� �񱳰� �ʿ���
		// ���� equals �޼ҵ带 �������̵� �ؼ� ���� ���� ���� ��� true�� �����ϵ��� ���ۼ��ؾ���
		
		// �������̵� �� : Object Ŭ������ equals() �޼ҵ� ���� --> �� �ּҰ��� ��
		// �������̵� �� : �� ��ü�� �ּҰ� �񱳰� �ƴ϶� ���� ��� ���� ���� ��� true�� ��ȯ�ϵ���
		
		// 3. hashCode() 
		System.out.println("bk1�� �ؽ��ڵ� : " + bk1.hashCode());
		System.out.println("bk2�� �ؽ��ڵ� : " + bk2.hashCode());
		System.out.println("bk3�� �ؽ��ڵ� : " + bk3.hashCode());
		
		// �ʵ� ���� ���� ��� hashCode �޼ҵ��� ��� ���� ���ƾ� ���� ��ü�� �Ǵ��Ͽ� �ߺ� ���� ���� ����� �� �� ����
		// �������̵� �� : Object Ŭ������ hashCode() ���� -> �ش� ��ü�� ���� �ּҰ��� 10������ ����� ��� ��
		// �������̵� ��  : �� ��ü�� ���� �ּ� ���� ������ �۾��ϴ� ���� �ƴ϶� �� ��ü�� ��� ���� ���� ���
		//             ���� �ؽ��ڵ带 �����ϵ��� ������
		
		
		
		
		
		
		
		
	}

}





