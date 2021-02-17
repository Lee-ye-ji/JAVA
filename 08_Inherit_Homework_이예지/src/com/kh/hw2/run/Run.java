package com.kh.hw2.run;

import com.kh.hw2.model.vo.Circle;
import com.kh.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// ũ�Ⱑ 2�� Circle, Rectangle ���� ��ü �迭 �Ҵ�
		Circle[] cir = { new Circle(2, 1, 3),
						 new Circle(3, 3, 4)};
		Rectangle[] rec = { new Rectangle(-1, -2, 5, 2),
							new Rectangle(-2, 5, 2, 8)};
		// ���� ��� �����͸� �����Ͽ� ���� �ʱ�ȭ
		
		// �� ������ draw �޼ҵ� ���� 
		//--> ���� for�� �̿��ؼ�

		for(Circle c : cir) {
			System.out.println("===== circle =====");
			c.draw();
		}
		
		for(Rectangle r : rec) {
			System.out.println("\n===== rectangle =====");
			r.draw();
		}
		
		
		

	}

}
