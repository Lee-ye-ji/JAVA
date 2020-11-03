package com.kh.hw2.view;

import java.util.Scanner;

import com.kh.hw2.model.vo.Employee;

public class EmpMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {}
	
	public void mainMenu() {
		
		Employee emp = null;
		
		// 메뉴 화면 출력 --> 반복 실행 처리
		while(true) {
			System.out.println("===== 사원 정보 관리 프로그램 =====");
			
			
			System.out.println("1.새 사원 정보 입력 ");
			System.out.println("2. 사원 정보 수정");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			
			switch(menu) {
			case 1:
				// inputEmployee() 실행 -> 반환 값으로 emp 초기화
				emp = inputEmployee();
				break;
			case 2: 
				// modifyEmployee() 실행
				modifyEmployee(emp);
				continue;
			case 3: 
				// 가비지 컬렉터가 지워주게끔
				emp = null;
				System.out.println("모든 정보가 삭제되었습니다.");
				continue;
			case 4:
				// Employee의 information() 사용
				System.out.println(emp.information());
				continue;
			case 9:
				// return 처리
				System.out.println("프로그램이 종료되었습니다.");
				return;
			}	
		}
		
	}
	
	public Employee inputEmployee() {
		// 키보드를 통해 사원 정보를 입력받게끔 구현
		// 매개변수 생성자를 이용하여 입력 받은 값으로 객체 생성
		// 생성된 객체의 주소 값 반환
		
		System.out.print("1. 사원명 : ");
		String empName = sc.nextLine();
		
		
		System.out.print("2. 부서명 : ");
		String dept = sc.nextLine();

		System.out.print("3. 직급 : ");
		String job = sc.nextLine();
		
		System.out.print("4. 나이 : ");
		int age = sc.nextInt();
		
		System.out.print("5. 성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("6. 급여 : ");
		int salary = sc.nextInt();
		
		System.out.print("7. 보너스 포인트 : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("8. 전화번호 : ");
		String phone = sc.nextLine();
		
		System.out.print("9. 주소 : ");
		String address = sc.nextLine();
		
		Employee emp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		
		return emp;
		
	}
	
	public void modifyEmployee(Employee emp) {
		
		// 서브 메뉴 화면 출력 --> 반복 실행 처리
		while(true) {
			System.out.println("==== 사원 정보 수정 메뉴 ====");
			System.out.println("1. 이름 변경");
			System.out.println("2. 급여 변경");
			System.out.println("3. 부서 변경");
			System.out.println("4. 직급 변경");
			System.out.println("9. 이전 메뉴로");
			System.out.print("수정 메뉴 선택 : ");
			int modifyMenu = sc.nextInt();
			sc.nextLine();
			
			switch(modifyMenu) {
			case 1:
				System.out.print("1. 이름 변경 : ");
				String cagName = sc.nextLine();
				emp.setEmpName(cagName);
				break;
			case 2:
				System.out.print("2. 급여 변경 : ");
				int cagSalary = sc.nextInt();
				emp.setSalary(cagSalary);
				break;
			case 3:
				System.out.print("3. 부서 변경 : ");
				String cagDept = sc.nextLine();
				emp.setDept(cagDept);
				break;
			case 4:
				System.out.print("4. 직급 변경 : ");
				String cagJob = sc.nextLine();
				emp.setJob(cagJob);
				break;
			case 9:
				mainMenu();
				return;
			default:
				System.out.println("없는 메뉴 입니다. 다시 골라주세요.");
				continue;
				// 각 번호에 맞춰 변경할 값을 입력 받고 setter 메소드를 이용하여 수정
			}break;
		}
	}
	

}
