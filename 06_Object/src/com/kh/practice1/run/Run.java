package com.kh.practice1.run;

import com.kh.practice1.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p = new Product();
		
		p.setpName("½ãÄ¨");
		p.setPrice(1300);
		p.setBrand("¿À¸®¿Â");
		
		System.out.println(p.information());

	}

}
