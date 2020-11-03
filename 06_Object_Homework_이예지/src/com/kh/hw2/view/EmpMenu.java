package com.kh.hw2.view;

import java.util.Scanner;

import com.kh.hw2.model.vo.Employee;

public class EmpMenu {
	
	Scanner sc = new Scanner(System.in);
	
	public EmpMenu() {}
	
	public void mainMenu() {
		
		Employee emp = null;
		
		// �޴� ȭ�� ��� --> �ݺ� ���� ó��
		while(true) {
			System.out.println("===== ��� ���� ���� ���α׷� =====");
			
			
			System.out.println("1.�� ��� ���� �Է� ");
			System.out.println("2. ��� ���� ����");
			System.out.println("3. ��� ���� ����");
			System.out.println("4. ��� ���� ���");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴� ��ȣ ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			
			switch(menu) {
			case 1:
				// inputEmployee() ���� -> ��ȯ ������ emp �ʱ�ȭ
				emp = inputEmployee();
				break;
			case 2: 
				// modifyEmployee() ����
				modifyEmployee(emp);
				continue;
			case 3: 
				// ������ �÷��Ͱ� �����ְԲ�
				emp = null;
				System.out.println("��� ������ �����Ǿ����ϴ�.");
				continue;
			case 4:
				// Employee�� information() ���
				System.out.println(emp.information());
				continue;
			case 9:
				// return ó��
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				return;
			}	
		}
		
	}
	
	public Employee inputEmployee() {
		// Ű���带 ���� ��� ������ �Է¹ްԲ� ����
		// �Ű����� �����ڸ� �̿��Ͽ� �Է� ���� ������ ��ü ����
		// ������ ��ü�� �ּ� �� ��ȯ
		
		System.out.print("1. ����� : ");
		String empName = sc.nextLine();
		
		
		System.out.print("2. �μ��� : ");
		String dept = sc.nextLine();

		System.out.print("3. ���� : ");
		String job = sc.nextLine();
		
		System.out.print("4. ���� : ");
		int age = sc.nextInt();
		
		System.out.print("5. ���� : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("6. �޿� : ");
		int salary = sc.nextInt();
		
		System.out.print("7. ���ʽ� ����Ʈ : ");
		double bonusPoint = sc.nextDouble();
		sc.nextLine();
		
		System.out.print("8. ��ȭ��ȣ : ");
		String phone = sc.nextLine();
		
		System.out.print("9. �ּ� : ");
		String address = sc.nextLine();
		
		Employee emp = new Employee(empName, dept, job, age, gender, salary, bonusPoint, phone, address);
		
		return emp;
		
	}
	
	public void modifyEmployee(Employee emp) {
		
		// ���� �޴� ȭ�� ��� --> �ݺ� ���� ó��
		while(true) {
			System.out.println("==== ��� ���� ���� �޴� ====");
			System.out.println("1. �̸� ����");
			System.out.println("2. �޿� ����");
			System.out.println("3. �μ� ����");
			System.out.println("4. ���� ����");
			System.out.println("9. ���� �޴���");
			System.out.print("���� �޴� ���� : ");
			int modifyMenu = sc.nextInt();
			sc.nextLine();
			
			switch(modifyMenu) {
			case 1:
				System.out.print("1. �̸� ���� : ");
				String cagName = sc.nextLine();
				emp.setEmpName(cagName);
				break;
			case 2:
				System.out.print("2. �޿� ���� : ");
				int cagSalary = sc.nextInt();
				emp.setSalary(cagSalary);
				break;
			case 3:
				System.out.print("3. �μ� ���� : ");
				String cagDept = sc.nextLine();
				emp.setDept(cagDept);
				break;
			case 4:
				System.out.print("4. ���� ���� : ");
				String cagJob = sc.nextLine();
				emp.setJob(cagJob);
				break;
			case 9:
				mainMenu();
				return;
			default:
				System.out.println("���� �޴� �Դϴ�. �ٽ� ����ּ���.");
				continue;
				// �� ��ȣ�� ���� ������ ���� �Է� �ް� setter �޼ҵ带 �̿��Ͽ� ����
			}break;
		}
	}
	

}
