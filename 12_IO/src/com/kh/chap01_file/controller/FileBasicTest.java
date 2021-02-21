package com.kh.chap01_file.controller;

import java.io.File;
import java.io.IOException;

public class FileBasicTest {

	// java.io 패키지에 있는 File 클래스를 이용한 파일 생성/ 삭제 -> 파일에 대한 간단한 테스트
	public void method1() {
		try {
			// 1. 현재 프로젝트에 파일 생성하기
			File f1 = new File("text.txt"); // 여기까지는 메모리에 객체로 있는 상태
			f1.createNewFile();	
			
			// 2. 존재하는 기본 드라이브나 폴더에 파일 생성 -> 경로까지 지정
//			File f2 = new File("D:\\test.txt");
//			f2.createNewFile();
			
			// 3. 폴더를 만들고 파일 생성하기
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			// java.io.IOException : 지정된 경로를 찾을 수 없습니다 -> 바로 생성하는 것을 불가능
			
			File f3 = new File("D:\\temp");
			//mkdir() : 새로운 디렉토리 생성
			//mkdies() : 경로 상에 없는 모든 디렉토리 생성
			f3.mkdir();
			
			File f4 = new File("D:\\temp\\test.txt");
//			f4.createNewFile();
			
			// 비어있지 않은 디렉토리는 delete() 할 수 없음
			// 디렉토리에 있는 파일을 지우고 디렉토리 지우기
			f4.delete();
			f3.delete();
			
			System.out.println(f1.exists());
			System.out.println(f1.isFile());
			System.out.println(f3.exists());
			System.out.println(f3.isFile());
			
			File folder = new File("parnet");
			folder.mkdir();
			File file = new File("parent\\person.txt");
			file.createNewFile();
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("저장 경로 : " + file.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + file.getPath());
			System.out.println("파일 용량 : " + file.length());
			System.out.println("상위 폴더 : " + file.getParent());			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
