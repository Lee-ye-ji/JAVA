package com.kh.chap02_math.run;

public class Run {

	public static void main(String[] args) {
		//Math Ŭ������ ���� �ʵ�� ��� ��� �ʵ�, �޼ҵ�� ��� static
		
		//static --> ���α׷� ������ �� �� �� �� static ����(���� �޸� ����)�� �ø���
		// 			��ü �����ؼ� ����� �ʿ���� Math. ���� �����ؼ� ���
		
		// Math�� ������ �����ڵ� private -> ������ �ʿ� �����Ƿ� �������� ���ϵ���
		
		// ��� �ʵ�
		System.out.println("���� : "+ Math.PI);

		// ���밪 -> abs
		int num1 = -10;
		System.out.println("���밪 : " + Math.abs(num1));
		
		// �ø� -> ceil
		double num2 = 4.349;
		System.out.println("�ø� : " + Math.ceil(num2));
		
		// �ݿø� -> round
		System.out.println("�ݿø� : " + Math.round(num2));
		
		// ���� -> floor
		System.out.println("���� : " + Math.floor(num2));
		
		// ������(��Ʈ) -> sqrt
		System.out.println("4�� ������ : " + Math.sqrt(4));
		
		// ���� -> pow
		System.out.println("2�� 10���� : " + Math.pow(2, 10));
	}

}
