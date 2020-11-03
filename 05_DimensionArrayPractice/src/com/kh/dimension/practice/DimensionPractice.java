package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		
		int[][] arr = new int[4][4];
		int value = 1;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr = new int[4][4];
		int value = 16;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
			}
		}
		
	
	public void practice4() {
		int arr[][] = new int[4][4];
		
		for(int i = 0 ; i < (arr.length-1); i++) {
			for(int j = 0; j< (arr[i].length-1); j++) {
				
				arr[i][j] = (int)(Math.random() * 10)+1;
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
//			System.out.println();
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		int row;
		int col;
		
		while(true) {
			
			// row 행
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			
			// colum 열
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			if( row < 1 || row > 10 || col < 1 || col > 10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
			}else {
				char[][] cArr = new char[row][col];
				
				for(int i = 0; i < cArr.length; i++) {
					for(int j =0; j < cArr[i].length; j++) {
						cArr[i][j] = (char)((Math.random()*25)+65);
						System.out.print(cArr[i][j] + " ");
					}
					System.out.println();
				}
				break;
			}
			
		}
	}
	
	public void practice6() {
		String[][] strArr = new String[][] {{"이", "까", "왔", "앞", "힘"}, 
											{"차", "지", "습", "으", "냅"}, 
											{"원", "열", "니", "로", "시"}, 
											{"배", "심", "다", "좀", "다"}, 
											{"열", "히", "! ", "더", "!! "}};
											
		for(int j = 0; j < strArr.length; j++) {
			for(int i = 0; i < strArr[j].length; i++) {
				System.out.print(strArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		char[][] rArr = new char[row][];
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + "행의 크기 :");
			int iRow = sc.nextInt();
			rArr[i] = new char[iRow];
			// 1차원 배열에 할당
//			arr[i] = new char[col];
		} 
		int a = 97;
		
		for(int i = 0; i < rArr.length; i++) {
			for(int j = 0; j < rArr[i].length; j++) {
//				System.out.print("(" + i + ", " + j + ")");
				rArr[i][j] = (char)(a++);
				System.out.print(rArr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
	
	public void practice8() {
		String[] stu = new String[]{"김예수", "김영해 ", "방명수", "손은희", "송종기", "윤은애",
				"이영지", "임시환 ", "전지연", "정중하 ", "차태연", "하이유"};
		
		String[][] newStu = new String[6][2];
		
		int index = 0; // 일차원 배열의 0번 ~ 마지막 인덱스까지 접근하기 위한 변수
		
		for(int i = 0; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				newStu[i][j] = stu[index++];
			}
		}
		//출력
		System.out.println("== 1분단 ==");
		for(int i = 0; i < newStu.length/2; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 3; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	public void practice9() {
		String[] stu = new String[]{"김예수", "김영해 ", "방명수", "손은희", "송종기", "윤은애",
				"이영지", "임시환 ", "전지연", "정중하 ", "차태연", "하이유"};
		
		String[][] newStu = new String[6][2];
		
		int index = 0; // 일차원 배열의 0번 ~ 마지막 인덱스까지 접근하기 위한 변수
		
		for(int i = 0; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				newStu[i][j] = stu[index++];
			}
		}
		//출력
		System.out.println("== 1분단 ==");
		for(int i = 0; i < newStu.length/2; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 3; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				System.out.print(newStu[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("============================");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String name = sc.nextLine();
		
		for(int i = 0; i < newStu.length; i++) {
			for(int j = 0; j < newStu[i].length; j++) {
				if(name.equals(newStu[i][j])) {
					System.out.printf("검색하신 %s 학생은 %d분단 %d번째 줄 %s에 있습니다.", 
							name,  (i < 3 ? 1 : 2), (i < 3 ? i : i-2), (j==0 ? "왼쪽" : "오른쪽") );
				}
			}
		}
		
		
	}

}
