package com.kh.practice2.run;

import com.kh.practice2.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		c.incrementRadius(); // 반지름 1증가
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();

	}

}
