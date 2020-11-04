package com.kh.practice1.run;

import java.util.Scanner;

import com.kh.practice1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Student[] stu = new Student[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.println("=== 학생 정보 프로그램 ====");
			
			for(int i = 0; i < stu.length; i++) {
				
				System.out.print("학년  :");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				sc.nextLine();
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				
				if(count < stu.length) {
					stu[count++] = new Student(grade, classroom, name, kor, eng, math);
				}
				
				System.out.print("학생의 정보를 더 입력하시겠습니까?(y/n) : ");
				String input = sc.next();
				
				if(input.equalsIgnoreCase("y")) {
					break;
				}else if(input.equalsIgnoreCase("n")) {
					System.out.println("프로그램을 종료합니다.");
					return;
				}else {
					System.out.println("잘못 입력하셨습니다.");
					break;
			}
			
			}
			
			for(int i = 0; i < count; i++) {
				int sum = stu[i].getKor() + stu[i].getEng() + stu[i].getMath();
				int avg = sum/count;
				
				System.out.println(stu[i].information());
				
				if(count == 0) {
					System.out.println("합계 : " + sum);
				}else {
					System.out.println("평균 : " + avg);
				}
			}
			
		}

	}

}
