package ncs.test1;

import java.util.Scanner;

public class CharTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		String input = sc.nextLine();
		//input = input.toUpperCase();
		
		char[] inputArr = new char[input.length()];
		
		// ���ڿ� �� ���ھ� ���
		for(int i = 0; i < inputArr.length; i++) {
			if('a'<= input.charAt(i) && input.charAt(i)<='z') {
				inputArr[i] = (char)(input.charAt(i)-32);
			}else {
				inputArr[i] = input.charAt(i);
			}
		}
		
		// �Ųٷ� ���
		for(int j = inputArr.length-1; j >= 0; j--) {
			System.out.print(inputArr[j]);
		}

		
	}

}
