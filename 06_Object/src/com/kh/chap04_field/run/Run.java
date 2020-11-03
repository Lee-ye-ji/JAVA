package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;
import com.kh.chap04_field.model.vo.FieldTest4;

public class Run {

	public static void main(String[] args) {
		 //1. FieldTest1
		FieldTest1 f1 = new FieldTest1();
		
		// public -> ��𼭱� ���� ����
		System.out.println(f1.pub);
		
		// protected -> ���� ��Ű�� �������� ���� ���� + ��� ������� �ٸ� ��Ű���� ����
		//System.out.println(f1.pro());		// �ٸ� ��Ű���鼭 ��� ������ �ƴϾ ���� �Ұ�
		System.out.println(f1.getPro());	// getter �޼ҵ带 ���� ���� �˾ƿ;� ��
		
		// default -> ���� ��Ű�� �������� ���� ����
		//System.out.println(f1.def);  		// �ٸ� ��Ű���̱� ������ ���� �Ұ�
		System.out.println(f1.getDef()); // getter �̿�
		
		// private -> ���� Ŭ���� �������� ���� ����
		//System.out.println(f1.pri);
		System.out.println(f1.getPri());
		
		// 2. FieldTest2
		FieldTest2 f2 = new FieldTest2();
		f2.test(20);
		
		// 3. FieldTest3
		FieldTest3 f3 = new FieldTest3();
		// -> static ������ �����ϱ� ���ؼ��� ��ü�� ������ �ʿ� ����
		
		// public static
		System.out.println(FieldTest3.pubSta);
		FieldTest3.pubSta = "changed public static";
		System.out.println(FieldTest3.pubSta);
		
		// private static
		System.out.println(FieldTest3.getPriSta());
		FieldTest3.setPriSta("changed private static");
		System.out.println(FieldTest3.getPriSta());
		
		
		// 4. FieldTest4
		System.out.println(FieldTest4.NUM);
		
		//System.out.println(Math.random());
		System.out.println(Math.PI);

	}

}
