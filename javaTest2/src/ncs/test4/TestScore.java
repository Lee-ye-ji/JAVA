package ncs.test4;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		double[][] arr = new double[3][3];
		Scanner sc = new Scanner(System.in);
		
		//�Է�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print( (i+1) + "���� "+ (j+1) + "���� �Է� >>");
				arr[i][j] = sc.nextDouble();
				sc.nextLine();
			}
		}
		// ���
		System.out.println("index \t ����1 \t ����2 \t ����3 \t ���� \t��� \t");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "\t");
			double sum = 0.0;
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
				sum += arr[i][j];
			}
			System.out.print(sum + "\t");
			System.out.print((sum/3) + "\t");
			System.out.println();
		}
	}

}
