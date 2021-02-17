package com.kh.hw1.controller;

import com.kh.hw1.model.vo.Circle;
import com.kh.hw1.model.vo.Rectangle;
import com.kh.hw1.model.vo.Shape;
import com.kh.hw1.model.vo.Triangle;
import com.kh.hw1.model.vo.IShape;

public class ShapeManager {
	
	public void calcShaple() {
		// �������� ����Ͽ� Shape ��ü �迭�� ���� 34.5, ���� 42.7�� �簢�� ��ü��
		// �������� 15.5�� �� ��ü�� �ϳ��� �����ϰ� �ݺ����� �̿��Ͽ� ������ ������ �ѷ� ���
		Shape[] s = new Shape[2];
		s[0] = new Rectangle(34.5, 42.7);
		s[1] = new Circle(15.5);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("���� :" + s[i].area());
			System.out.println("�ѷ� :" + s[i].perimeter());
		}
		
		System.out.println("----- <interface> -----");
		
		// �ǽ����� 2
		IShape[] is = new IShape[2];
		is[0] = new Rectangle(34.5, 42.7);
		is[1] = new Circle(15.5);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("���� :" + s[i].area());
			System.out.println("�ѷ� :" + s[i].perimeter());
		}
		System.out.println();
	}
	
	// �߰� �� �޼ҵ�
	public void calcShapeArray() {
		
		IShape[] iarr = new IShape[5];
		
		// �������� ����Ͽ� ���� IShape ��ü �迭�� Circle, Rectangle, Triangle Ŭ������
		// �������� �����͸� �־ 5�� ������
		iarr[0] = new Circle(26.5);
		iarr[1] = new Rectangle(45.3, 24.5);
		iarr[2] = new Triangle(20.0, 40.0);
		iarr[3] = new Circle(45.5);
		iarr[4] = new Triangle(24.2, 48.9);
		
		// for������ �� ��ü�� ������ �ѷ��� ��� ó����
		// ��, Triangle ��ü�� ��� ���� ���̵� ��� ó����
		for(IShape si : iarr) {
			
			if(si instanceof Circle){
				System.out.println("Circle - ���� : " + si.area() +", �ѷ� :" + si.perimeter());
			}else if(si instanceof Rectangle) {
				System.out.println("Rectangle - ���� :" + si.area() + ", �ѷ� :" + si.perimeter());
			}else if(si instanceof Triangle){
				System.out.println("Triangle - ���� : " + si.area() + ", �ѷ� :" + si.perimeter() + ", ���� :"+ ((Triangle) si).hypotenuse());
			}
		}
	}

}
