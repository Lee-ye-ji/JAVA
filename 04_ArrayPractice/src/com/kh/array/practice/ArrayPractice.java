package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() { 
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 10-i;
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수: ");
		int num = sc.nextInt();
		
		int[] nArr = new int[num];
		
		for(int i = 0; i < num; i++) {
			nArr[i] = i+1;
			System.out.print(nArr[i] + " ");
		}
	}
	
	public void practice4() {
		
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arrStr = new char[str.length()];
		
		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);
		
		int count = 0;
		
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스): ");
		
		for(int i = 0; i < str.length(); i++) {
			arrStr[i] = str.charAt(i);
			if(ch == arrStr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(ch + " 개수 : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int day = sc.nextInt();
		
		String[] week = new String[]{"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		if(day > 6 || day < 0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			System.out.println(week[day]);
		}
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] numArr = new int[num];
		
		int sum = 0;
		
		for(int i = 0; i < num; i++) {
			System.out.println("배열 " + i +"번째 인덱스에 넣을 값: ");
			int inNum = sc.nextInt();
			numArr[i] = inNum;
			sum += inNum;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.print(numArr[i] + " ");
		}
		System.out.println();
		System.out.println("총합 : " + sum);
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if( num >= 3 && num % 2 == 1) {
				
				int[] oddNum = new int[num];
				
				//콤마 , 출력 밖으로 빼야함 3을 입력했을 때 1, 2, 1,나옴
				for(int i = 0; i < (num/2)+1; i++) {
					oddNum[i] = i+1;
					System.out.print(oddNum[i] + ", ");
				}
				for(int j = (num/2)+1; j < oddNum.length; j++) {
					oddNum[j] = oddNum.length-j;
					System.out.print(oddNum[j] + ", ");
				}
				break;
				
				//출력
//				for(int i = 0; i < oddNum.length; i++) {
//					if(i< oddNum.length-1) {
//						System.out.print(oddNum[i] + ", ");
//					}
//				}
				
			}else {
				System.out.println("다시 입력하세요.");
			}
		}	
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요: ");
		String chicken = sc.nextLine();
		
		String[] menu = {"양념", "후라이드", "갈릭", "숯불", "간장"};
		
		
		//for문 안에 출력문 넣으면 안됨!
		int i = 0;
		for(; i < menu.length; i++) {
			if(menu[i].equals(chicken)) {
				break;
			}
		}
		
		if(i < menu.length) {
			System.out.println(chicken +"치킨 배달 가능");
		}else {
			System.out.println(chicken +"치킨은 없는 메뉴입니다.");
		}
	
	}
	
	public void practice10() {
		int[] nansu = new int[10];
		
		for(int i = 0; i < nansu.length; i++) {
			nansu[i] = (int)(Math.random()* 10) + 1;
			
			System.out.print(nansu[i] + " ");
		}
	}
	
	public void practice11() {

		int[] nansu = new int[10];
		
		//중복값 없애기
		for(int i = 0; i < nansu.length; i++) {
				nansu[i] = (int)(Math.random()* 10) + 1;
				for(int j = 0; j < i; j++) { 
					if(nansu[i] == nansu[j]) { 
						i--; // 중복이 되면 다시 외부 for문으로 돌아가서 수행
						break;
					}
				}
			}
		// 출력
		for(int i = 0; i < nansu.length; i++) {
			System.out.print(nansu[i] + " ");
		}
		}

	public void practice12() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String jumin = sc.nextLine();
		
		char[] chArr = new char[jumin.length()];
		char[] copyChArr = chArr;
		
		for(int i = 0; i < jumin.length(); i++) {
			chArr[i] = jumin.charAt(i);
			if(i > 7) {
				copyChArr[i] = '*';
			}else {
				copyChArr[i] = chArr[i];
			}
			System.out.print(copyChArr[i]);
		}
	}
	
	public void practice13() {
		int[] lotto = new int[6];
		
		//중복 값 없애기
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 오름차순 정렬
//		Arrays.sort(lotto);
		for(int i = 1;  i < lotto.length; i++) {
			for(int j = 0; j < i; j++) {
				if(lotto[i] < lotto[j]) {
					int temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}	
			}
		}
		
		// 값 출력
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] chArr = new char[str.length()];
		int count = 0;
		
		System.out.print("문자열에 있는 문자 : ");
		
		for(int i = 0; i < str.length(); i++) {
			
			boolean check = true; // 중복 체크
			
			chArr[i] = str.charAt(i);
			
			for(int j = 0; j < i; j++) {
				if(chArr[i] == chArr[j]) {
					check = false;
					continue;
				}
			}
			if(check) {
				if(i == 0) {
					System.out.print(chArr[i]);
				}else {
					System.out.print(", " + chArr[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.print("문자개수 : " + count);
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int arrNum = sc.nextInt();
		sc.nextLine();
		
		String[] strArr = new String[arrNum];
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print((i+1) + "번째 문자열 : ");
			strArr[i] = sc.nextLine();	
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) :");
			char yn = sc.next().charAt(0);
			
			if(yn == 'Y' || yn == 'y') {
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int more = sc.nextInt();
				sc.nextLine();
				
				String[] moreArr = new String[arrNum + more];
				
				for(int i = 0; i < moreArr.length; i++) {
					if( i < strArr.length) {
						moreArr[i] = strArr[i];
					}else {
						System.out.print((i+1) + "번째 문자열 : ");
						moreArr[i] = sc.nextLine();
					}
				}
				//얕은 복사
				strArr = moreArr; // 기존 배열에 새로운 배열의 주소값 대입 --> 기존 배열 사라지게 됨 
				
			}else if(yn == 'N' || yn == 'n') {
				break;
			}else {
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
		System.out.println(Arrays.toString(strArr));
	}
}
