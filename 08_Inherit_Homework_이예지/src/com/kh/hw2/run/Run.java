package com.kh.hw2.run;

import com.kh.hw2.model.vo.Circle;
import com.kh.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		// 크기가 2인 Circle, Rectangle 각각 객체 배열 할당
		Circle[] cir = { new Circle(2, 1, 3),
						 new Circle(3, 3, 4)};
		Rectangle[] rec = { new Rectangle(-1, -2, 5, 2),
							new Rectangle(-2, 5, 2, 8)};
		// 위의 사용 데이터를 참고하여 각각 초기화
		
		// 각 도형의 draw 메소드 실행 
		//--> 향상된 for문 이용해서

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
