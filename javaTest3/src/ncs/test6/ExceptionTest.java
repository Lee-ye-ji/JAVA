package ncs.test6;

import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է�(2~5) : ");
		int data = sc.nextInt();
		sc.nextLine();
		
		Calculator c = new Calculator();
		
		try {
			System.out.println("��� �� : " + c.getSum(data));
		}catch(InvalidException e){
			System.out.println(e.getMessage());
		}
		

	}

}
