package com.kh.chap01_inherit.run;

import com.kh.chap01_inherit.model.vo.Airplane;
import com.kh.chap01_inherit.model.vo.Car;
import com.kh.chap01_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		Airplane airplane = new Airplane("�����1", 0.021, "��Ʈ��", 16, 5);
		 
		Car car = new Car("BMW", 12.5, "����", 4);
		
		Ship ship = new Ship("���ù�", 3, "�", 1);
		
		// information �޼ҵ嵵 Overriding �Ǿ� �־��� ��
		// @Override��� �ۼ����� �ʾƵ� �������̵��� �ǳ���?
		// ==> YES
		// ������̼��� �ۼ����� �ʾ��� �� overriding�� ������ ������ ������ ��Ƴ� �� ����
		System.out.println(airplane.information());
		System.out.println(car.information());
		System.out.println(ship.information());
		
		airplane.howToMove();
		car.howToMove();
		ship.howToMove();
		
		// ----------------------------------------------------------------------
		// ��� �� for��, for each��
		
		// 1. �迭�� ���
		double[] arr = {0.1, 0.2, 0.3, 0.4, 0.5};
		
		// for������ ���
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// for-each�� : ó������ ������ ���������� �ݺ�
		for(double num : arr) {	// (Ÿ�� ������  : �ݺ������� �ݺ��ϰ��� �ϴ� ���)
			// 1��° �ݺ��� ���۽� arr[0]�� ���� -> num�̶�� ���������� ��Ī�ϰ���
			// 2��° �ݺ��� ���۽� arr[1]�� ���� -> num�̶�� ���������� ��Ī�ϰ���
			// ...
			System.out.println(num);
		}
		
		// 2. ��ü �迭�� ���
		Airplane[] list = {new Airplane("p-01", 0.03, "������", 16, 5),
							new Airplane("p-02", 0.03, "������", 16, 5),
							new Airplane("p-03", 0.03, "������", 16, 5)};
		
		// for�� ���
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i].information());
		}
		
		// for-each ���
		for(Airplane ap : list) {
			System.out.println(ap.information());
		}
	}

}









