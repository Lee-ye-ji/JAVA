package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// vo => value object == dto => data transfer object(데이터 전송 객체)
// dao => data access object : DataBase의 data에 접근하기 위한 객체 
// DBMS를 배우기 이전에는 File에 Data를 저장하여 입출력하는 것으로 구현 할 것

public class FileBytest {
	public void fileSave() {
		// 파일 저장 -> 프로그램으로부터 파일을 내보냄 -> 파일 출력
		// FileOutputStream 사용
		File file = new File("sample.txt");
		FileOutputStream fout = null;
		
		try {
			// FileOutputStream fout = new FileOutputStram(file); -> 파일 객체 전달
			// -> 해당 스트림을 열 때는 FileNotFoundException 발생 할 수 있으므로 try~catch 처리
			
			fout = new FileOutputStream("byteTest.txt", true); // -> 문자열로 파일명 전달
			// -> 파일이 없으면 내부적으로 만들어 주는데 왜 FileNotFoundException이 발생할까?
			// -> 존재하지 않는 경로를 작성했을 경우 "지정된 경로를 찾을 수 없습니다"라는 exception 발생
			
			// 1. write(int b)
			fout.write(65);
			fout.write('B');
			
			// 2. write(int b)
			byte[] bArr = {97,98,99};
			fout.write(bArr);
			
			// 3. write(byte[]b, int off, int len)
			// 주어진 배열에 저장된 내용 중 off번째부터 len개 만큼 쓰기
			fout.write(bArr, 1, 2);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// 스트림은 사용 후 반드시 반납해야 하므로 스트림.close() 메소드 호출 필요
			// 해당 스트림에 대한 선언은 try{} 블럭 배열에서 해주어야 finally{} 블럭에서도 인식할 수 있음
			// 스트림을 닫을 때도 IOException 처리가 필요
			try {
				fout.close();	
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileOpen() {
		// 파일을 연다 -> 프로그램에서 파일을 읽어 옴 -> 입력 스트림
		//FileInputStream 사용
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("byteTest.txt"); //FileNotFoundException발생 가능
			
			// 1. int read() : 1byte를 읽어오며 더 이상 읽어올 값이 없으면 -1을 반환
			// 2. int read(byte[] b) : 배열 b의 크기 만큼 읽어서 배열을 채우고 읽어온 데이터의 수 반환
			// 3. int read(byte[] b, int off, int len) : 최대 len개의 byte를 읽어서 배열 b의 지정된 위치(off)부터 저장
			
			/*System.out.println(fis.read()); // IOException 발생 가능
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/ // 더 이상 읽어올 값이 없으면 -1반환
			
			// 반복문으로 바꾸기 -> fis.read() 두 번 호출하는 것이 아니라 변수로 받아주는 것으로 변경
			/*while(fis.read() != -1) {
				System.out.println((char)fis.read());
			}*/
			
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println((char)value);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();	
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
