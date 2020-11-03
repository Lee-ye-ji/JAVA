package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	// 중복 제거
	public void method1() {
		
		System.out.println("------ method 1 ------");
		
		// 사용자에게 5개의 값을 입력받아 배열에 저장
		// 단, 중복 값은 허용하지 않음
		
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 정수 값: ");
			arr[i] = sc.nextInt();
			
			// 이전에 입력받은 값 중 중복 값이 있는지 확인하는 반복문
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) { // 중복 값이 존재하는 경우
					System.out.println("중복 값이 존재합니다.");
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
	
	public void method2() {
		
		System.out.println("------ method 2 ------");
		
		int[] arr = new int[5];
		// 1~10사이의 난수를 중복없이 채우기
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(j + "번째와 " + i + "번째 :" +arr[i] + "중복");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
