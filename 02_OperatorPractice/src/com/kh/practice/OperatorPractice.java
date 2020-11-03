package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
		
		public void practice1() {
			Scanner p1 = new Scanner(System.in);
			System.out.print("����: ");
			int num = p1.nextInt();
			String result = (num > 0) ? "����̴�" : "����� �ƴϴ�";
			System.out.println(result);
		}
		
		public void practice2() {
			Scanner p2 = new Scanner(System.in);
			System.out.print("����: ");
			int num = p2.nextInt();
			String result = (num > 0) ? "����̴�" : ((num == 0) ? "0�̴�" : "������");
			System.out.println(result);
		}
		
		public void practice3() {
			Scanner p3 = new Scanner(System.in);
			System.out.print("����: ");
			int num = p3.nextInt();
			String result = (num % 2 == 0) ? "¦����" : "Ȧ����";
			System.out.println(result);
		}
		
		public void practice4() {
			Scanner p4 = new Scanner(System.in);
			System.out.print("�ο� ��: ");
			int person = p4.nextInt();
			System.out.print("���� ����: ");
			int candy = p4.nextInt();
			int giveCandy = candy / person;
			int remainCandy = candy % person;
			System.out.println("1�δ� ���� ����: " + giveCandy);
			System.out.println("���� ���� ����: " + remainCandy);
		}
		
		public void practice5() {
			Scanner p5 = new Scanner(System.in);
			System.out.print("�̸�: ");
			String schoolName = p5.nextLine();
			System.out.print("�г�(���ڸ�): ");
			int schoolYear = p5.nextInt();
			System.out.print("��(���ڸ�): ");
			int schoolClass = p5.nextInt();
			System.out.print("��ȣ(���ڸ�): ");
			int schoolNumber = p5.nextInt();
			p5.nextLine();
			System.out.print("����(M/F): ");
			char schoolGender = p5.nextLine().charAt(0);
			char gender = (schoolGender == 'M') ? '��' : '��';
			System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����): ");
			double schoolGrade = p5.nextDouble();
			System.out.println(schoolYear + "�г� " + schoolClass + "�� "+
					schoolNumber + "�� " + schoolName +" "+ gender+ "�л��� " +
					"������ " + schoolGrade + "�̴�.");		
		}
		public void practice6() {
			Scanner p6 = new Scanner(System.in);
			System.out.print("����: ");
			int age = p6.nextInt();
			String ageGrade = (age <= 13) ? "���" :( age>19 ? "����" : "û�ҳ�");
			System.out.println(ageGrade);	
		}
		
		public void practice7() {
			Scanner p7 = new Scanner(System.in);
			System.out.print("���� : ");
			int korean = p7.nextInt();
			System.out.print("���� : ");
			int math = p7.nextInt();
			System.out.print("���� : ");
			int english = p7.nextInt();
			
			int sum = korean + math + english;
			System.out.println("�հ� : " +sum);
			double avg = sum / 3.0;
			System.out.println("��� : " +avg);
			
			boolean pass = (korean >= 40) && (math >= 40) && (english >= 40) && (avg >= 60);
			String passOrfail = (pass == true) ? "�հ�" : "���հ�";
			System.out.println(passOrfail);
		}
		
		public void practice8() {
			Scanner p8 = new Scanner(System.in);
			System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
			String socialSecurityNumber =  p8.nextLine();
			char gender = socialSecurityNumber.charAt(7);
			String genderDistinguish = (gender % 2 == 0) ? "����" : "����";
			System.out.println(genderDistinguish);
		}
		
		public void practice9() {
			Scanner p9 = new Scanner(System.in);
			System.out.print("����1 : ");
			int num1 = p9.nextInt();
			
			System.out.print("����2 : ");
			int num2 = p9.nextInt();
			
			System.out.print("�Է� : ");
			int input =  p9.nextInt();
			
			boolean condition = (num1 <= input) || ( num2 > input ) && (num1 < num2);
			System.out.println(condition); 
		}
		
		public void practice10() {
			Scanner p10 = new Scanner(System.in);
			System.out.print("�Է�1 : ");
			int input1 = p10.nextInt();
			
			System.out.print("�Է�2 : ");
			int input2 = p10.nextInt();
			
			System.out.print("�Է�3 : ");
			int input3 = p10.nextInt();
			
			boolean result = (input1 == input2)  && (input2 == input3);
			System.out.println(result);
		}

}
