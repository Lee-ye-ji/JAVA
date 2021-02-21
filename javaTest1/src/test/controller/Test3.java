package test.controller;

public class Test3 {

	public static void main(String[] args) {
		// 문제 3
		int num = 1;
		double sum = 0.0;
		double avg = 0.0;
		
		while(num <= 100) {
			sum += num;
			num++;
			avg = sum / 100;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		

	}

}
