package com.kh.hw1.controller;

import com.kh.hw1.model.vo.Circle;
import com.kh.hw1.model.vo.Rectangle;
import com.kh.hw1.model.vo.Shape;
import com.kh.hw1.model.vo.Triangle;
import com.kh.hw1.model.vo.IShape;

public class ShapeManager {
	
	public void calcShaple() {
		// 다형성을 사용하여 Shape 객체 배열에 가로 34.5, 세로 42.7의 사각형 객체와
		// 반지름이 15.5인 원 객체를 하나씩 생성하고 반복문을 이용하여 각각의 면적과 둘레 출력
		Shape[] s = new Shape[2];
		s[0] = new Rectangle(34.5, 42.7);
		s[1] = new Circle(15.5);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("면적 :" + s[i].area());
			System.out.println("둘레 :" + s[i].perimeter());
		}
		
		System.out.println("----- <interface> -----");
		
		// 실습문제 2
		IShape[] is = new IShape[2];
		is[0] = new Rectangle(34.5, 42.7);
		is[1] = new Circle(15.5);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println("면적 :" + s[i].area());
			System.out.println("둘레 :" + s[i].perimeter());
		}
		System.out.println();
	}
	
	// 추가 된 메소드
	public void calcShapeArray() {
		
		IShape[] iarr = new IShape[5];
		
		// 다형성을 사용하여 위의 IShape 객체 배열에 Circle, Rectangle, Triangle 클래스를
		// 무작위의 데이터를 넣어서 5개 생성함
		iarr[0] = new Circle(26.5);
		iarr[1] = new Rectangle(45.3, 24.5);
		iarr[2] = new Triangle(20.0, 40.0);
		iarr[3] = new Circle(45.5);
		iarr[4] = new Triangle(24.2, 48.9);
		
		// for문으로 각 객체의 면적과 둘레를 출력 처리함
		// 단, Triangle 객체의 경우 빗변 길이도 출력 처리함
		for(IShape si : iarr) {
			
			if(si instanceof Circle){
				System.out.println("Circle - 면적 : " + si.area() +", 둘레 :" + si.perimeter());
			}else if(si instanceof Rectangle) {
				System.out.println("Rectangle - 면적 :" + si.area() + ", 둘레 :" + si.perimeter());
			}else if(si instanceof Triangle){
				System.out.println("Triangle - 면적 : " + si.area() + ", 둘레 :" + si.perimeter() + ", 빗변 :"+ ((Triangle) si).hypotenuse());
			}
		}
	}

}
