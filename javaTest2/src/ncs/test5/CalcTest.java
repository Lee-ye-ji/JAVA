package ncs.test5;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수(1~9) 1: ");
			int a = sc.nextInt();
			sc.nextLine();
			
			System.out.print("정수(1~9) 2: ");
			int b = sc.nextInt();
			sc.nextLine();
			
			if(1 <= a && a <= 9 && 1 <= b && b <= 9) {
				System.out.println("합 : " + calc.sum(a, b));
				System.out.println("차 : " + calc.subtract(a, b));
				System.out.println("곱 : " + calc.multiply(a, b));
				System.out.println("나누기 : " + calc.divide(a, b));
				break;
			}else {
				System.out.println("1~9사이의 숫자를 입력하세요!");
			}
		}

	}

}
