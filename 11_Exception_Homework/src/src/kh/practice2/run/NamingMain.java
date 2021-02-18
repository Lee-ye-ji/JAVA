package src.kh.practice2.run;

import java.util.Scanner;

import src.kh.practice2.controller.NamingTest;
import src.kh.practice2.model.NamingException;

public class NamingMain {

	public static void main(String[] args) throws NamingException {
		NamingTest nt = new NamingTest();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� �� ���ڿ��� ���ÿ� : ");
		String str = sc.nextLine();
		
		try {
			if(nt.isReservedWord(str) == true && nt.isSpecialWord(str) == true && nt.isNumFirst(str) == true) {
				System.out.println(str + "��(��) ���������� ��� �����մϴ�.");
			}
		} catch (javax.naming.NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
