package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	// ���� ����: �迭�� �ּҸ��� ����
	// ���� ����: ������ ���ο� �迭�� �ϳ� �����ؼ� ���� ���� ������ ����
	
	public void method1() {
		
		System.out.println("------ method 1 ------");
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = origin;
		
		// ���� ���
		System.out.println("���� ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// ���� �� copy �迭�� �̿��ؼ� 2�� �ε����� ���� 99�� ����
		copy[2] = 99;
		
		System.out.println("===== ���� �� �迭 �� ���� �� ======");
		
		// ���� ���
		System.out.println("���� ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// ���� copy �迭�� 2�� �ε��� ���� �������� ���ε�
		// �������� ���� ����Ǿ� �ִ� ���� Ȯ���� �� ����
		
		// �� ������ ���� ���� �����ϰ� �ֱ� ����(��, ���� �ּҰ��� ����)
		System.out.println("origin�� �ּҰ�: " + origin.hashCode());
		System.out.println("copy�� �ּ� ��:" + copy.hashCode());
	}
	
	// ���� �� ���ο� �迭�� ����� ���ؼ��� ���� ���簡 �ʿ���
	public void method2() {
		
		System.out.println("------ method 2 ------");
		
		// 1. for��
		//		���ο� �迭�� �����ϸ� �ݺ����� ���� ���� ���� ���� �ִ� ���
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[5]; //5 ũ���� �� �迭 �����, ����� 0���� �� �ʱ�ȭ �Ǿ� ����.
		
		for(int i = 0; i < origin.length; i++) { // �ݺ����� ���� origin�� �ִ� ������ copy�� ����
			copy[i] = origin[i];
		}

		// ���� ���
		System.out.println("���� ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		// ���� �� copy �迭�� �̿��ؼ� 2�� �ε����� ���� 99�� ����
		copy[2] = 99;
		
		System.out.println("===== ���� �� �迭 �� ���� �� ======");
		
		// ���� ���
		System.out.println("���� ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		// ���� copy �迭�� 2�� �ε��� ���� �������� ���ε�
		// �������� ���� ����Ǿ� �ִ� ���� Ȯ���� �� ����
		
		// �� ������ ���� ���� �����ϰ� �ֱ� ����(��, ���� �ּҰ��� ����)
		System.out.println("origin�� �ּҰ�: " + origin.hashCode());
		System.out.println("copy�� �ּ� ��:" + copy.hashCode());
		
	}
	
	public void method3() {
		
		System.out.println("------ method 3 ------");
		
		// 2. System Ŭ�������� arraycopy() �޼ҵ带 �̿��� ����
		
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; //�˳��ϰ� ũ�� ����
		
		// (�����迭��, ���� ������ �ε���, ���纻�迭��, ���纻�迭�� ���� ���۵� ��ġ, ���� ����)
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		// origin �迭�� copy �迭�� �����ϴ� �� �� ��
		// origin �迭�� 0�� �ε������� �������� ���� ���̸�ŭ��
		// copy �迭�� 2�� �ε������� ä��ڴٴ� �ǹ�
		
		// ���� ���
		System.out.println("���� ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
	}
	
	public void method4() {
		
		System.out.println("------ method 4 ------");
		
		// 3. Arrays Ŭ�������� �����ϴ� copyOf �޼ҵ� ���
		// Arrays Ŭ������ �迭�� �̿��� �� ������ �޼ҵ带 ��Ƴ��� Ŭ����
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = Array.copyOf(���� �迭, ������ ����);
		int[] copy = Arrays.copyOf(origin, 10);
		
		// Arrays.copyOf() -> ���� ������ ���̸�ŭ ������ ũ�� �Ҵ�
		// ������ ���̰� ���� �迭���� �� ��� ���� �迭�� �ִ� ���� ��� ����(���� �ε����� 0)
		// ������ ���̰� ���� �迭���� ª�� ��� ���� �迭���� ������ ���̸�ŭ ����
		// �տ������� ��µ� ��ġ �ٲ� �� ����
	
		// ���� ���
		System.out.println("���� ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();	
	}
	
	
	public void method5() {
		
		System.out.println("------ method 5 ------");
		
		// 4. clone() �޼ҵ� �̿��� ����
		// ���� �ε��� ������ �� ������ ���� �迭 ��°�� ������ ���ο� �迭 �Ҵ�
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		// ���� ���
		System.out.println("���� ���");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();	
		
	}
}
