package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] stu = new Student[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("=== �л� ���� ���α׷� ====");
			
			for(int i = 0; i < stu.length; i++) {
				
				System.out.print("�г�  :");
				int grade = sc.nextInt();
				
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				
				System.out.print("�������� : ");
				int kor = sc.nextInt();
				
				System.out.print("�������� : ");
				int eng = sc.nextInt();
				
				System.out.print("�������� : ");
				int math = sc.nextInt();
				
				if(count < stu.length) {
					stu[count++] = new Student(grade, classroom, name, kor, eng, math);
				}
				
				System.out.print("�л��� ������ �� �Է��Ͻðڽ��ϱ�?(y/n) : ");
				String input = sc.next();
				
				if(input.equalsIgnoreCase("y")) {
					break;
				}else if(input.equalsIgnoreCase("n")) {
					System.out.println("���α׷��� �����մϴ�.");
					return;
				}else {
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
					break;
			}
			
			}
			
			for(int i = 0; i < count; i++) {
				int sum = stu[i].getKor() + stu[i].getEng() + stu[i].getMath();
				int avg = sum/count;
				
				System.out.println(stu[i].information());
				
				if(count == 0) {
					System.out.println("�հ� : " + sum);
				}else {
					System.out.println("��� : " + avg);
				}
			}
			
		}

	}

}
