package test.controller;

public class Test3 {

	public static void main(String[] args) {
		// ���� 3
		int num = 1;
		double sum = 0.0;
		double avg = 0.0;
		
		while(num <= 100) {
			sum += num;
			num++;
			avg = sum / 100;
		}
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		

	}

}
