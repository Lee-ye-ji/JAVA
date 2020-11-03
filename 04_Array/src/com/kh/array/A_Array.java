package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/* �迭: ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	 * 		���� �� ������ �ε����� �����Ǹ� �ε����� 0���� ������ */
	
	public void method1() {
		
		System.out.println("------ method 1 -------");
		
		// �迭�� �� ���� ���
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		// �̷� ������ ����ؼ� �� �鰳�� ������ �ִٸ�?
		// ���� �������� ����ϱ� ���ؼ� �Ǵ� �������� ���ؼ��� ��� ������־�� ��
		// ���� �������� ��� ���� �ڷ����̹Ƿ� �迭�� ����Ͽ� �ξ� �����ϰ� ���α׷��� ������
		
		/* 1. �迭 ����
		 * 	  �ڷ���[] �迭��;
		 * 	 �ڷ��� �迭��[]
		 */
		
		int[] arr; // -> �ڷ��� �ڿ� ���ȣ�� �ִ� ���� �ٷ� �迭���� �� �� ����
		//int arr2[];
		
		/* 2. �迭 �Ҵ�
		 * 		�迭�� = new �ڷ���[�迭 ũ��];
		 */
		arr = new int[5];
		
		// ����� �Ҵ� ���ÿ�
		int[] arr1 = new int[5]; // -> �迭�� 5���� int�� ������ ���� �� �ִ�.
		
		/* 3. �ʱ�ȭ
		 * �迭��[�ε���] = ��;
		 */
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// �迭�� ���� : ������ �� �� �ε����� ��ġ�� ���� ������ ��Ģ�� �ִٸ� �ݺ��� ��� ����
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
		
		//��� �ÿ��� �ݺ����� ����Ͽ� �����ؼ� ���
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method2() {
		
		System.out.println("------ method 2 -------");
		
		// ���� ����
		int i; 		// �޸� ������ ���� ���� �ڽ��� ����� ����
					// �� �� �޸��� Stack�̶�� ������ �Ҵ�
		
		// �迭 ���� 
		int[] iArr; // �迭�� �����ϸ� ���� ����� �Ȱ��� stack ������ ������ ����
					// ������ �� ������ ���� ���� �뵵�� �ƴ϶� � �ּҸ� ������ ����
					// ���� ���� ��� ������ �׳� ������� �ϰ� �ּ� ���� ��� ������ ���� ����/ ���۷��� ���� ��� ��
		
		char[] cArr;
		// ��, �⺻ �ڷ������� ���� �� ������ -> ����
		// �� �ܷ� ���� �� ��� -> ���۷���
		
		// �迭 �Ҵ� 
		// iArr = new int[]; -> �迭 �Ҵ� �� �ݵ�� ũ�⸦ ������ �־�� ��, ũ�� �������� ���� �߻�
		
		iArr = new int[5];
		cArr = new char[10];
		// ���� ���� new��� �����ڸ� ���� �迭�� �Ҵ��ϰ� �Ǹ�
		// �޸��� heap������ �ش� �迭�� ũ�⸸ŭ�� ������ ���������
		// �� ������ �ּ� ���� stack������ ���۷��� ������ ����
		
		// ���� �ش� �迭�� ���� �ְų� ���� �� �� �ش� �ּҸ� �����ؼ� �����
		
		// ���� �迭 ����� �Ҵ��� ���ÿ� 
		int[] iArr2 = new int[5];
		char[] cArr2 = new char[10];
		
		System.out.println("iArr : " + iArr);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("cArr : " + cArr);
		System.out.println("cArr2 : " + cArr2);
	}
	
	public void method3() {
		
		System.out.println("------ method 3 -------");
		
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// ��������� �迭�� �����ϰ� �Ҵ縸 �߰�
		// ���� ���� ���� ���� ����(�ʱ�ȭX)
		
		// �ش� �ε����� �����ؼ� ����ϸ� � ���� �������� �ݺ������� ��� Ȯ���ϱ�
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		System.out.println("=====================");
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/*int num;
		System.out.println(num);*/
		// �迭�� ��� ���� ������ �޸� �ʱ�ȭ ���� �ʾƵ� ���� ���� ��µ�
		// �迭�� ���� �ʱ�ȭ���� �ʴ´ٸ� JVM�� ������ �⺻ ������ �迭�� �ʱ�ȭ ��
		// �ֳĸ� heap�������� ���� ���� ������ ������ �� ����
		// �׷��� �ʱ�ȭ�� ���ϸ� JVM�� �ڵ����� �ʱⰪ�� �ο�����
		// int�� 0�� �ʱ�ȭ  // char�� ������ �ʱ�ȭ  //String�� null�� �ʱ�ȭ
		
		System.out.println("iArr�� ����: " + iArr.length);
		System.out.println("cArr�� ����: " + cArr.length);
		
		// ���ڿ��� ���̸� �˱� ���� length()��� �޼ҵ带 �̿���
		// String�� ���ڿ� ���̴� �޼ҵ�� �����ϰ� �ֱ� ����
		// �迭�� ���̸� �� �� �ִ� ����� �޼ҵ尡 �ƴ� � ������ ������
		// ���� .length()�� �ƴ϶� .length ���� ����
	}
	
	public void method4() {
		
		System.out.println("------ method 4 -------");
		
		// ����ڿ��� �Է� ���� ������ �迭�� ���̸� �����غ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Ҵ��� �迭�� ����: ");
		int size = sc.nextInt();
		
		// double�� �迭 dArr�� ����ڰ� �Է��� size��ŭ �Ҵ��غ���
		double[] dArr = new double[size];
		System.out.println(dArr);
		System.out.println("dArr�� ���� : " + dArr.length);
		
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}
	
	public void method5() {
		
		System.out.println("------ method 5 -------");
		
		int[] iArr = new int[5];
		
		// 2, 4, 6, 8, 10���� �ʱ�ȭ
		int num = 2;
		for(int i = 0; i< iArr.length; i++) {
			iArr[i] = num;
			num += 2;
//			System.out.println(iArr[i]);
		}
		
		// �ʱ�ȭ ��� ���
		for(int i = 0; i< iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("iArr�� �ؽ��ڵ� ��: " + iArr.hashCode());
		// hashCode() -> �ּ� ���� �ؽ� ������ ���� 10���� ������ ����
		System.out.println("iArr�� ����: " + iArr.length);
		
		//iArr[5] = 12;
		// -> ���࿡ �迭�� ũ�⸦ ����� �ε����� �߰��� ���� �־��ָ� ArrayIndexOutofBoundsException �߻�
		
		// ���� ū �迭�� ���� -> �� �� ������ ũ��� ������ �� ������
		// ���� ũ�⸦ �ٲٷ��� �ٽ� �迭�� ũ�⸦ �����ؼ� �Ҵ� �� �־����
		iArr = new int[10];
		// 10�̶�� ũ���� �迭�� heap������ ���� �����ϰ�
		// ���� ������ �ּҸ� iArr�̶�� ���۷��� ������ ���� �� ��
		
		System.out.println("======== ���� ���� iArr =======");
		System.out.println("iArr�� �ؽ��ڵ� ��: " + iArr.hashCode());
		System.out.println("iArr�� ����: " + iArr.length);
		
		// �ּ� ���� �ٲ� ���� Ȯ�� �� �� ����
		// ������ �����ϰ� �ִ� ������ ����� ���ο� ���� �����ϰ� ����
		// �׷��� ���� �迭�� ��� ������ �������� �ʰ� heap ������ ���ٴϴ� ����
		// -> ���� �ð��� ������ ������ �÷��Ͱ� �� �̻� ���� ���ٰ� �Ǵ��Ͽ� ������ (�ڵ� �޸� ����)
		
		// ���� �����ϰ� �ִ� 10��¥�� �迭�� ����� �ʹٸ�?
		iArr = null;
		// ���۷��� ������ null ���� ���� �Ǹ� �ּҰ��� null�� �ٲ�
		// ��, �����ϰ� �ִ� �ּҰ� ���ٴ� �ǹ�
		// -> heap�� �ִ� ������ ����� ���� ����Ƿ� �����ð��� ������ ������ �÷��Ͱ� �����ϰ� ��
		
		System.out.println("======== ���� ���� iArr =======");
		System.out.println("iArr�� ��: " + iArr);
		System.out.println("iArr�� ����: " + iArr.length);
		// NullPointerException �߻�
		// �ƹ��͵� �������� �ʰ� null�̶�� Ư���� ���� �����ϰ� ���� �� �߻�
	}
	
	public void method6() {
		
		System.out.println("------ method 6 -------");
		
		// �迭 ���� �� �Ҵ�� ���ÿ� �ʱ�ȭ����
		int[] iArr = {1, 2, 3, 4, 5};
		// -> �߰�ȣ ���� ����ϴ� ��� new �����ڸ� ������� �ʾƵ� �Ǹ�,
		// ���� ������ŭ �ڵ����� ũ�� �Ҵ� ��
		
		int[] iArr2 = new int[] {1, 2, 3, 4, 5};
		// �� ������ε� ��� ����
		
		System.out.println(iArr == iArr2);
		// iArr�� iArr2�� �� �ִ� ���� �����ϹǷ� == �� Ȯ���غ���
		// ���۷��� �������� ������ �ִ� �ּ� ���� ���ϰ� �ְ�
		// ����  heap ������ �Ҵ� �Ǿ��ִ� �ٸ� �迭�̹Ƿ� �ּҴ� ���� �� ����.
		
	}
	
	public void method7() {
		
		System.out.println("------ method 7 -------");
		
		String[] sArr = new String[5]; //String ���ڿ��� �迭 ��� ����
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		Scanner sc = new Scanner (System.in);
		// 0�� �ε������� ������ �ε������� �ݺ��ϸ�
		// ����ڿ��� ���ڿ��� �Է� �ް� �Է� ���� �� �ֱ�
		for(int i = 0; i < sArr.length; i++) {
			System.out.println("���ڿ� �Է�: ");
			sArr[i] = sc.nextLine();
		}
		//�� �ԷµǾ����� ���
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
	
	public void method8() {
		
		System.out.println("------ method 8 -------");
		
		// ����ڿ��� 5���� Ű�� ������ �Է� �޾� �迭�� ��Ƶΰ�
		// �ݺ����� ���� 5���� Ű�� ����, ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		double[] height = new double[5];
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			System.out.print("Ű �Է�:");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		System.out.println("����: " + sum);
		System.out.println("���: " + sum / height.length);
	}
	
	public void method9() {
		
		System.out.println("------ method 9 -------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		// �ش� �迭�� 1���� 100������ �������� �߻����Ѽ� �ֱ�
		// ��� 1. java.lang.Math Ŭ������ random() �޼ҵ�
		// ��� 2. java.util.Random Ŭ����
		Random ran = new Random();
		System.out.println("int ������ ���� : " + ran.nextInt());
		// -21�� ~ 21����� int�� ǥ�� �� �� �ִ� ���� ���� �ȿ��� �߻��Ǵ� ���� ��
		System.out.println("1~100������ ����: " + ran.nextInt(100) + 1); //(���� ��) + ���� ��  0���� �����ϹǷ� 
		// 0���� 99������ ������ �߻���Ű�ڴٴ� �ǹ� -> 100
		// 1���� ���� -> 1 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void method10() {
		
		System.out.println("------ method 10 -------");
		
		// ����ڿ��� ���ڿ��� �Է¹޾� �ش� ���ڿ��� �� ���ڸ� ���ڹ迭�� ���ʷ� �ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է�: ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		
		System.out.println("------ method 11 -------");
		
		// �ִ밪 �ּҰ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		// 5���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] arr = new int[5];
		
		// �� �ε����� ����ڷκ��� �� �Է� ����
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "��° �Է�: ");
			arr[i] = sc.nextInt();
		}
		
		// arr[0]���� �ִ밪�� �ּҰ��� ���� ������ �ʱ�ȭ �� ��
		int max = arr[0];
		int min = arr[0];
		
		// 1�� �ε������� �迭 ������ ���ϱ�
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("�ִ� ��: " + max);
		System.out.println("�ּ� ��:" + min);
	}
	

}
