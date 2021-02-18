package src.kh.practice2.run;

import java.util.Scanner;

import src.kh.practice2.controller.NamingTest;
import src.kh.practice2.model.NamingException;

public class NamingMain {

	public static void main(String[] args) throws NamingException {
		NamingTest nt = new NamingTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("변수명으로 쓸 문자열을 쓰시오 : ");
		String str = sc.nextLine();
		
		try {
			if(nt.isReservedWord(str) == true && nt.isSpecialWord(str) == true && nt.isNumFirst(str) == true) {
				System.out.println(str + "는(은) 변수명으로 사용 가능합니다.");
			}
		} catch (javax.naming.NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
