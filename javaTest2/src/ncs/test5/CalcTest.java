package ncs.test5;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("����(1~9) 1: ");
			int a = sc.nextInt();
			sc.nextLine();
			
			System.out.print("����(1~9) 2: ");
			int b = sc.nextInt();
			sc.nextLine();
			
			if(1 <= a && a <= 9 && 1 <= b && b <= 9) {
				System.out.println("�� : " + calc.sum(a, b));
				System.out.println("�� : " + calc.subtract(a, b));
				System.out.println("�� : " + calc.multiply(a, b));
				System.out.println("������ : " + calc.divide(a, b));
				break;
			}else {
				System.out.println("1~9������ ���ڸ� �Է��ϼ���!");
			}
		}

	}

}
