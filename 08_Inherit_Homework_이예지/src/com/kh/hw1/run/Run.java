package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.vo.Employee;
import com.kh.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		Student student = new Student();
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		Student[] stu = { new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과"),
						  new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과"),
						  new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과")};
		// 위의 학생 정보 모두 출력
		// --> 향상된 for문 이용해서
		for(Student s : stu) {
			System.out.println(s.toString());
		}
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] employee = new Employee[10];
		int count = 0;
		
		// 사원들의 정보를 키보드로 계속 입력 받고 
		// --> while(true) 무한 반복문을 통해
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("------ 사원 정보를 입력하세요 -----");
			System.out.print("이름 :");
			String name = sc.nextLine();
			System.out.print("나이:");
			int age = sc.nextInt();
			System.out.print("신장:");
			double height = sc.nextDouble();
			System.out.print("몸무게:");
			double weight = sc.nextDouble();
			System.out.print("급여:");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("부서:");
			String dept = sc.nextLine();
			
			// 계속 추가할 것인지 물어보고, 대소문자 상관없이 ‘y’이면 계속 객체 추가
			System.out.print("계속 추가하실 겁니까?(y/n):");
			String c = sc.nextLine();
			
			if(c.equalsIgnoreCase("y")) {
				// 한 명씩 추가 될 때마다 카운트함
				// 2명 정도의 사원 정보를 입력 받아 객체 배열에 저장
				employee[count++]= new Employee(name, age, height, weight, salary, dept);
			}else {
				System.out.println("사원 정보를 종료합니다.");
				return;
			}
			// 현재 기록된 사원들의 정보를 모두 출력
			for(int i = 0; i < count; i++) {
				System.out.println(employee[i]);
			}

		}
		
	}

}
