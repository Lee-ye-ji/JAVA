package com.kh.chap05_inltBlock.run;

import com.kh.chap05_inltBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.information());
		// �ʵ� �ʱ�ȭ ����
		// 1. JVM�� ���� �⺻ ������ ��ü ���� 
		// -> Product [pName=null,price=0 brand = null]
		// 2. ����� �ʱ�ȭ
		// -> Product [pName=���ϼ�,price=9000000 brand = ����]
		// 3. �ν��Ͻ� ��� / static ��
		// -> Product [pName=cyon,price = 200000 brand = ���]
		// static ���(���α׷� ���� �� �� �� ����) / �ν��Ͻ� ���(��ü ���� �ø��� ����)
		// -> Product [pName=cyon,price = 200000 brand = ����]
		// 4. �ν��Ͻ� ������ ��� - ������ �ʱ�ȭ
		


	}

}
