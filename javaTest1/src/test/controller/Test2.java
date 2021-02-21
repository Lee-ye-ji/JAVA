package test.controller;

public class Test2 {

	public static void main(String[] args) {
		// ¹®Á¦ 2
		for(int i = 3; i < 6; i++) {
			for(int j = 1; j < 10; j++) {
				if( (i*j) % 2 == 1 ) {
					System.out.println(i + " * " + j + " = " + i*j);	
				}
			}
		}
	}

}
