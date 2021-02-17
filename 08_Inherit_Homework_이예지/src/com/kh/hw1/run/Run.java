package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.vo.Employee;
import com.kh.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 3���� �л� ������ ����� �� �ְ� ��ü �迭 �Ҵ�
		Student student = new Student();
		// ���� ��뵥���� �����Ͽ� 3���� �л� ���� �ʱ�ȭ
		Student[] stu = { new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�"),
						  new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�"),
						  new Student("������", 23, 167.0, 45.0, 4, "��������а�")};
		// ���� �л� ���� ��� ���
		// --> ���� for�� �̿��ؼ�
		for(Student s : stu) {
			System.out.println(s.toString());
		}
		
		// �ִ� 10���� ��� ������ ����� �� �ְ� �迭�� �Ҵ�
		Employee[] employee = new Employee[10];
		int count = 0;
		
		// ������� ������ Ű����� ��� �Է� �ް� 
		// --> while(true) ���� �ݺ����� ����
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("------ ��� ������ �Է��ϼ��� -----");
			System.out.print("�̸� :");
			String name = sc.nextLine();
			System.out.print("����:");
			int age = sc.nextInt();
			System.out.print("����:");
			double height = sc.nextDouble();
			System.out.print("������:");
			double weight = sc.nextDouble();
			System.out.print("�޿�:");
			int salary = sc.nextInt();
			sc.nextLine();
			System.out.print("�μ�:");
			String dept = sc.nextLine();
			
			// ��� �߰��� ������ �����, ��ҹ��� ������� ��y���̸� ��� ��ü �߰�
			System.out.print("��� �߰��Ͻ� �̴ϱ�?(y/n):");
			String c = sc.nextLine();
			
			if(c.equalsIgnoreCase("y")) {
				// �� �� �߰� �� ������ ī��Ʈ��
				// 2�� ������ ��� ������ �Է� �޾� ��ü �迭�� ����
				employee[count++]= new Employee(name, age, height, weight, salary, dept);
			}else {
				System.out.println("��� ������ �����մϴ�.");
				return;
			}
			// ���� ��ϵ� ������� ������ ��� ���
			for(int i = 0; i < count; i++) {
				System.out.println(employee[i]);
			}

		}
		
	}

}
