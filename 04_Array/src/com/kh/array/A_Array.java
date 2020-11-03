package com.kh.array;

import java.util.Random;
import java.util.Scanner;

public class A_Array {
	/* 배열: 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * 		저장 된 값마다 인덱스가 지정되며 인덱스는 0부터 시작함 */
	
	public void method1() {
		
		System.out.println("------ method 1 -------");
		
		// 배열을 안 쓰는 경우
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		// 이런 식으로 계속해서 수 백개의 변수가 있다면?
		// 위의 변수들을 출력하기 위해서 또는 연산하지 위해서는 모두 명시해주어야 함
		// 위의 변수들은 모두 같은 자료형이므로 배열을 사용하여 훨씬 간단하게 프로그래밍 가능함
		
		/* 1. 배열 선언
		 * 	  자료형[] 배열명;
		 * 	 자료형 배열명[]
		 */
		
		int[] arr; // -> 자료형 뒤에 대괄호가 있는 편이 바로 배열임을 알 수 있음
		//int arr2[];
		
		/* 2. 배열 할당
		 * 		배열명 = new 자료형[배열 크기];
		 */
		arr = new int[5];
		
		// 선언과 할당 동시에
		int[] arr1 = new int[5]; // -> 배열에 5개의 int형 정수를 담을 수 있다.
		
		/* 3. 초기화
		 * 배열명[인덱스] = 값;
		 */
		
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		
		// 배열의 장점 : 대입을 할 때 인덱스의 위치나 값에 일정한 규칙이 있다면 반복문 사용 가능
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = i;
		}
		
		//출력 시에도 반복문을 사용하여 접근해서 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method2() {
		
		System.out.println("------ method 2 -------");
		
		// 변수 선언
		int i; 		// 메모리 공간에 값을 담을 박스를 만드는 과정
					// 이 때 메모리의 Stack이라는 영역에 할당
		
		// 배열 선언 
		int[] iArr; // 배열을 선언하면 변수 선언과 똑같이 stack 영역에 공간이 생김
					// 하지만 이 공간은 값을 담을 용도가 아니라 어떤 주소를 보관할 공간
					// 따라서 값을 담는 변수는 그냥 변수라고 하고 주소 값을 담는 변수는 참조 변수/ 레퍼런스 변수 라고 함
		
		char[] cArr;
		// 즉, 기본 자료형으로 선언 된 변수는 -> 변수
		// 그 외로 선언 된 경우 -> 레퍼런스
		
		// 배열 할당 
		// iArr = new int[]; -> 배열 할당 시 반드시 크기를 지정해 주어야 함, 크기 미지정시 에러 발생
		
		iArr = new int[5];
		cArr = new char[10];
		// 위의 길이 new라는 연산자를 통해 배열을 할당하게 되면
		// 메모리의 heap영역에 해당 배열의 크기만큼의 공간이 만들어지고
		// 그 공간의 주소 값을 stack영역의 레퍼런스 변수에 저장
		
		// 따라서 해당 배열에 값을 넣거나 수정 할 때 해당 주소를 참조해서 사용함
		
		// 위의 배열 선언과 할당을 동시에 
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
		// 여기까지는 배열을 선언하고 할당만 했고
		// 아직 실제 값을 넣지 않음(초기화X)
		
		// 해당 인덱스에 접근해서 출력하면 어떤 값이 나오는지 반복문으로 출력 확인하기
		for(int i = 0; i < cArr.length; i++) {
			System.out.println(cArr[i]);
		}
		
		System.out.println("=====================");
		
		for(int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/*int num;
		System.out.println(num);*/
		// 배열의 경우 지역 변수와 달리 초기화 하지 않아도 오류 없이 출력됨
		// 배열을 따로 초기화하지 않는다면 JVM이 지정한 기본 값으로 배열이 초기화 됨
		// 왜냐면 heap영역에는 값이 없는 공간이 존재할 수 없음
		// 그래서 초기화를 안하면 JVM이 자동으로 초기값을 부여해줌
		// int는 0이 초기화  // char는 공백이 초기화  //String은 null이 초기화
		
		System.out.println("iArr의 길이: " + iArr.length);
		System.out.println("cArr의 길이: " + cArr.length);
		
		// 문자열의 길이를 알기 위해 length()라는 메소드를 이용함
		// String의 문자열 길이는 메소드로 제공하고 있기 때문
		// 배열의 길이를 알 수 있는 방법은 메소드가 아닌 어떤 변수로 제공함
		// 따라서 .length()가 아니라 .length 임을 유의
	}
	
	public void method4() {
		
		System.out.println("------ method 4 -------");
		
		// 사용자에게 입력 받은 정수로 배열의 길이를 지정해보기
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 할당할 배열의 길이: ");
		int size = sc.nextInt();
		
		// double형 배열 dArr을 사용자가 입력한 size만큼 할당해보기
		double[] dArr = new double[size];
		System.out.println(dArr);
		System.out.println("dArr의 길이 : " + dArr.length);
		
		for(int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]);
		}
	}
	
	public void method5() {
		
		System.out.println("------ method 5 -------");
		
		int[] iArr = new int[5];
		
		// 2, 4, 6, 8, 10으로 초기화
		int num = 2;
		for(int i = 0; i< iArr.length; i++) {
			iArr[i] = num;
			num += 2;
//			System.out.println(iArr[i]);
		}
		
		// 초기화 결과 출력
		for(int i = 0; i< iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		System.out.println("iArr의 해쉬코드 값: " + iArr.hashCode());
		// hashCode() -> 주소 값을 해쉬 연산을 통해 10진수 값으로 변경
		System.out.println("iArr의 길이: " + iArr.length);
		
		//iArr[5] = 12;
		// -> 만약에 배열의 크기를 벗어나는 인덱스에 추가로 값을 넣어주면 ArrayIndexOutofBoundsException 발생
		
		// 가장 큰 배열의 단점 -> 한 번 지정한 크기는 변경이 불 가능함
		// 따라서 크기를 바꾸려면 다시 배열의 크기를 지정해서 할당 해 주어야함
		iArr = new int[10];
		// 10이라는 크기의 배열을 heap영역에 새로 생성하고
		// 새로 생성한 주소를 iArr이라는 레퍼런스 변수에 덮어 쓴 것
		
		System.out.println("======== 변경 후의 iArr =======");
		System.out.println("iArr의 해쉬코드 값: " + iArr.hashCode());
		System.out.println("iArr의 길이: " + iArr.length);
		
		// 주소 값이 바뀐 것을 확인 할 수 있음
		// 기존에 참조하고 있던 연결이 끊기고 새로운 곳을 참조하고 있음
		// 그러면 예전 배열은 어느 곳에서 참조되지 않고 heap 영역에 떠다니는 상태
		// -> 일정 시간이 지나면 가비지 컬렉터가 더 이상 쓸모 없다고 판단하여 지워줌 (자동 메모리 관리)
		
		// 지금 참조하고 있는 10개짜리 배열을 지우고 싶다면?
		iArr = null;
		// 레퍼런스 변수에 null 값이 들어가게 되면 주소값이 null로 바뀜
		// 즉, 참조하고 있는 주소가 없다는 의미
		// -> heap에 있는 공간과 연결된 고리가 끊기므로 일정시간이 지나면 가비지 컬렉터가 삭제하게 됨
		
		System.out.println("======== 삭제 후의 iArr =======");
		System.out.println("iArr의 값: " + iArr);
		System.out.println("iArr의 길이: " + iArr.length);
		// NullPointerException 발생
		// 아무것도 참조하지 않고 null이라는 특수한 값을 참조하고 있을 때 발생
	}
	
	public void method6() {
		
		System.out.println("------ method 6 -------");
		
		// 배열 선언 및 할당과 동시에 초기화까지
		int[] iArr = {1, 2, 3, 4, 5};
		// -> 중괄호 블럭을 사용하는 경우 new 연산자를 사용하지 않아도 되며,
		// 값의 갯수만큼 자동으로 크기 할당 됨
		
		int[] iArr2 = new int[] {1, 2, 3, 4, 5};
		// 이 방법으로도 사용 가능
		
		System.out.println(iArr == iArr2);
		// iArr과 iArr2는 들어가 있는 값이 동일하므로 == 로 확인해보자
		// 레퍼런스 변수들이 가지고 있는 주소 값을 비교하고 있고
		// 각각  heap 영역에 할당 되어있는 다른 배열이므로 주소는 같을 수 없다.
		
	}
	
	public void method7() {
		
		System.out.println("------ method 7 -------");
		
		String[] sArr = new String[5]; //String 문자열도 배열 사용 가능
		
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
		
		Scanner sc = new Scanner (System.in);
		// 0번 인덱스부터 마지막 인덱스까지 반복하며
		// 사용자에게 문자열을 입력 받고 입력 받은 값 넣기
		for(int i = 0; i < sArr.length; i++) {
			System.out.println("문자열 입력: ");
			sArr[i] = sc.nextLine();
		}
		//잘 입력되었는지 출력
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]);
		}
	}
	
	public void method8() {
		
		System.out.println("------ method 8 -------");
		
		// 사용자에게 5명의 키의 정보를 입력 받아 배열에 담아두고
		// 반복문을 통해 5명의 키의 총합, 평균 구하기
		Scanner sc = new Scanner(System.in);
		double[] height = new double[5];
		double sum = 0;
		
		for(int i = 0; i < height.length; i++) {
			System.out.print("키 입력:");
			height[i] = sc.nextDouble();
			sum += height[i];
		}
		System.out.println("총합: " + sum);
		System.out.println("평균: " + sum / height.length);
	}
	
	public void method9() {
		
		System.out.println("------ method 9 -------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		// 해당 배열에 1부터 100사이의 랜덤값을 발생시켜서 넣기
		// 방법 1. java.lang.Math 클래스의 random() 메소드
		// 방법 2. java.util.Random 클래스
		Random ran = new Random();
		System.out.println("int 범위의 난수 : " + ran.nextInt());
		// -21억 ~ 21억까지 int가 표현 할 수 있는 값의 범위 안에서 발생되는 랜덤 값
		System.out.println("1~100범위의 난수: " + ran.nextInt(100) + 1); //(범위 값) + 시작 값  0부터 시작하므로 
		// 0부터 99까지의 난수를 발생시키겠다는 의미 -> 100
		// 1부터 시작 -> 1 
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void method10() {
		
		System.out.println("------ method 10 -------");
		
		// 사용자에게 문자열을 입력받아 해당 문자열의 각 문자를 문자배열에 차례로 넣기
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		
		System.out.println("------ method 11 -------");
		
		// 최대값 최소값 구하기
		Scanner sc = new Scanner(System.in);
		
		// 5개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
		int[] arr = new int[5];
		
		// 각 인덱스에 사용자로부터 값 입력 받음
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 입력: ");
			arr[i] = sc.nextInt();
		}
		
		// arr[0]으로 최대값과 최소값을 담을 변수를 초기화 한 뒤
		int max = arr[0];
		int min = arr[0];
		
		// 1번 인덱스부터 배열 끝까지 비교하기
		for(int i = 1; i < arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대 깂: " + max);
		System.out.println("최소 값:" + min);
	}
	

}
