package com.kh.chap01.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ex\n"
				+ "1.�Է�\n"
				+ "2.����\n"
				+ "3.��ȸ\n"
				+ "4.����\n"
				+ "9.����\n"
				+ "�޴��� �Է��ϼ��� : ");
		int menuNum = sc.nextInt();
		
		String manual = ""; 
		switch(menuNum) {
		case 1:
			manual = "�Է�";
			break;
		case 2:
			manual = "����";
			break;
		case 3:
			manual = "��ȸ";
			break;
		case 4:
			manual = "����";
			break;
		case 9:
			System.out.println("���α׷��� ����˴ϴ�.");
			return;
		default:
			System.out.println("�߸��� ��ȣ �Է��Դϴ�.");
			return;
		}
		System.out.println( manual + " �޴��Դϴ�.");
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���: ");
		int integer = sc.nextInt();
		
		if(integer > 0) {
			if(integer % 2 == 0) {
				System.out.println("¦����");
			}else {
				System.out.println("Ȧ����");
			}
		}else {
			System.out.println("����� �Է����ּ���.");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������: ");
		int korean = sc.nextInt();
		
		System.out.println("��������: ");
		int math = sc.nextInt();
		
		System.out.println("��������: ");
		int english = sc.nextInt();
		
		int sum = korean + math + english;
		double avg = sum / 3;
		
		if(korean >= 40 && math >=40 && english >= 40) {
			if(avg >= 60) {
				System.out.println(
						"����: " + korean + "\n"+
						"����: " + math + "\n"+
						"����: " + english + "\n"+
						"�հ�: " + sum + "\n"+
						"���: " + avg 
						);
				System.out.println("�����մϴ�, �հ��Դϴ�!");
			}
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է�:");
		int month = sc.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println( month +"���� �ܿ� �Դϴ�.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println( month +"���� �� �Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println( month +"���� ���� �Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println( month +"���� ���� �Դϴ�.");
			break;
		default:
			System.out.println( month +"���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String idConfirm = "yejilee";
		String pwConfirm = "yeji123";
		
		System.out.println("���̵� : ");
		String id = sc.nextLine();
		
		System.out.println("��й�ȣ: ");
		String pw = sc.nextLine();
		
		if(!id.equals(idConfirm)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(!pw.equals(pwConfirm)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("�α��� ����");
		}
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ���:");
		String grade = sc.nextLine();
		
		switch(grade) {
		case "������":
			System.out.println(grade + "�� ȸ������, �Խñ� ����, �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ�� �����մϴ�.");
			break;
		case "ȸ��":
			System.out.println(grade + "��  �Խñ� �ۼ�, ��� �ۼ�, �Խñ� ��ȸ�� �����մϴ�.");
			break;
		case "��ȸ��":
			System.out.println(grade + "�� �Խñ� ��ȸ�� �����մϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��߽��ϴ�.");
			return;
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Ű(m)�� �Է����ּ��� :");
		double length = sc.nextDouble();
		
		System.out.println("������(kg)�� �Է����ּ��� :");
		double weight = sc.nextDouble();
		
		double bmi = weight / (length * length);
		
		if(bmi < 18.5) {
			System.out.println("BMI ���� :" + bmi);
			System.out.println("��ü��");
		}else if(bmi < 23) {
			System.out.println("BMI ���� :" + bmi);
			System.out.println("����ü��");
		}else if(bmi < 25) {
			System.out.println("BMI ���� :" + bmi);
			System.out.println("��ü��");
		}else if(bmi < 30) {
			System.out.println("BMI ���� :" + bmi);
			System.out.println("��");
		}else{
			System.out.println("BMI ���� :" + bmi);
			System.out.println("�� ��");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ǿ�����1 �Է�:");
		int num1 = sc.nextInt();
		
		System.out.println("�ǿ�����2 �Է�:");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		int result = 0;
		
		System.out.println("�����ڸ� �Է�(+,-,*,/,%):");
		char computation = sc.next().charAt(0);
//		sc.nextLine();
		
		if(num1 > 0  && num2 > 0) {
			switch(computation) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;	
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
				return;
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			return;
		}
		System.out.println(num1 + "" + computation + "" + num2 + '=' + result);
//		System.out.println((int)num1 + (char)computation + (int)num2 + '=' + result);
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�߰� ��� ����:");
		int mid = sc.nextInt();
		
		System.out.println("�⸻ ��� ����:");
		int fin = sc.nextInt();
		
		System.out.println("���� ����:");
		int ass = sc.nextInt();
		
		System.out.println("�⼮ ȸ��:");
		int att = sc.nextInt();
		
		//��� 
		
		//�߰� ��� 
		double midRes = mid * 0.2;
		
		//�⸻���
		double finRes = fin * 0.3;
		
		//����
		double assRes = ass * 0.3;
		
		double result = midRes + finRes + assRes + (double)att;
		
		//�⼮��
		double attRate = 20 * 0.7;
		
		if(result >= 70) {
			if( att >= attRate) {
				System.out.println("==========���========");
				System.out.println("�߰� ��� ����(20) :" + midRes);
				System.out.println("�⸻ ��� ����(30) :" + finRes);
				System.out.println("���� ����      (30) :" + assRes);
				System.out.println("�⼮ ����      (20) :" + (double)att);
				System.out.println("���� :" + result);
				System.out.println("PASS");
			}else {
				System.out.println("==========���========");
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + att + "/20)");
			}
		}else {
			if(att >= attRate) {
				System.out.println("==========���========");
				System.out.println("FAIL [���� �̴�] (����" + result + ")");
			}else {
				System.out.println("==========���========");
				System.out.println("FAIL [�⼮ Ƚ�� ����] (" + (double)att + "/20)");
				System.out.println("FAIL [���� �̴�] (����" + result + ")");
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.\n" +
				"1. �޴� ���\n"+ 
				"2. ¦��/Ȧ��\n"+ 
				"3. �հ�/���հ�\n"+ 
				"4. ����\n"+ 
				"5. �α���\n"+ 
				"6. ���� Ȯ��\n"+ 
				"7. BMI\n"+ 
				"8. ����\n" + 
				"9. Pass/Fail");
		System.out.print("����:");
		int menuNum = sc.nextInt();
		
		switch(menuNum) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		default:
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}

}
