package com.kh.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDao {
	
	 // 입력을 위한 Scanner
	Scanner sc = new Scanner(System.in);
	
	public FileDao() {} // 기본 생성자
	
	//어떤 파일에 어떤 내용을 저장할지 입력 받아 파일 출력을 실행하는 메소드
	public void fileSave() {
		
		// StringBuilder - StringBuffer와 비슷한 가변 클래스
		// StringBuilder는 단일 스레드 환경에서 주로 발생(동기화 처리를 하면 속도가 저하되기 떄문)
		// StringBuffer는 멀티 스레드 환경 -> 동기화 처리가 되어야 안전함
		StringBuilder sb = new StringBuilder();
		
		BufferedWriter bw = null;
		
		// “파일에 저장할 내용을 반복해서 입력하시오("exit"을 입력하면 내용 입력 끝) :”
		// 값을 Scanner로 입력 받아 StringBuilder에 저장하고, “exit”을 입력 했을시 빠져나가는 while문 생성
		System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) :");
		while(true) {
			String note = sc.nextLine();
			
			//그 값을 StringBuilder에 넣기 전에 exit인지 아닌지 판단하는 구문이 필요하겠죠?
			if(note.equals("exit")) {
				break;
			}else {
				sb.append(note + "\n");
			}
		}
		
		// “저장하시겠습니까? (y/n)”
		System.out.print("저장하시겠습니까? (y/n) : ");
		char save = sc.nextLine().toUpperCase().charAt(0);
					
		// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
		// 저장할 파일명을 입력 받음
		if(save == 'Y') {
			try{
				// “입력받은 파일명.txt”로 저장되게
				// BufferedWriter와 FileWriter 스트림 사용
				System.out.print("저장할 파일 명을 입력하시오 : ");
				String fileName = sc.nextLine();
							
				// “입력받은 파일명.txt”로 저장되게
				// BufferedWriter와 FileWriter 스트림 사용
				FileWriter fw = new FileWriter(fileName +".txt");
				bw = new BufferedWriter(fw);
				bw.write(sb.toString()); // write() 버퍼에 쌓는다
				bw.flush(); // flush() 내보낸다
				// “입력받은 파일명.txt 파일에 성공적으로 저장하였습니다.”
				System.out.println( fileName + ".txt 파일에 성공적으로 저장하였습니다.");
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					// 열었던 스트림 close
					try {
						bw.close(); 
						// finally안에 있기에 bw가 인식되지 않아 while문 밖에 BufferedWriter bw = null;로 선언해줌
						} catch (IOException e) {
							e.printStackTrace();
						}
				}
		}else {
			// 입력 받은 값이 y가 아닌 어떤 값이든 “다시 메뉴로 돌아갑니다.” 출력
			System.out.println("다시 메뉴로 돌아갑니다.");
		}
	}
	
	//원하는 파일을 파일 입력 후 콘솔 화면에 출력하는 메소드
	public void fileOpen() {
		BufferedReader br = null;
		// “열기 할 파일명 : "
		System.out.print("열기 할 파일명 : ");
		// 파일명을 Scanner로 입력 받아, BufferedReader와 FileReader 스트림 사용
		String open = sc.nextLine();
		try{
			br = new BufferedReader(new FileReader( open + ".txt"));
			// try구문 안에서 readLine()메소드를 통해 한줄씩 콘솔로 입력받은 값 출력
			String value = "";
			// read()의 반환 값이 int일 때 읽어올 것이 없으면 -1반환
			// readLine()의 반환 값은 String이므로 읽어올 것이 없으면 null 반환
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			// 열었던 스트림 close
			try {
				br.close(); 
				// BufferedReader br = null;로 밖으로 뺴주기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 기존 파일을 입출력을 통해 내용을 추가해 수정하는 메소드
	public void fileEdit() {
		StringBuilder sb = new StringBuilder();
		
		// “수정 할 파일명 : "
		System.out.print("수정 할 파일명 : ");
		String edit = sc.nextLine();
		
		// 파일명을 입력받아 BufferedReader와 BufferedWriter, FileReader와 FileWriter
		BufferedReader br = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		FileWriter fw = null;
		
			try {
				br = new BufferedReader(new FileReader( edit + ".txt"));
				// 반복문을 통해 해당 파일의 내용을 readLine()메소드를 통해 콘솔에 출력
				String value = "";
				while((value = br.readLine()) != null) {
					System.out.println(value);
				}
				// “파일에 추가할 내용을 입력하시오 : “
				System.out.print("파일에 추가할 내용을 입력하시오 (\"exit\"입력 전까지):");
				while(true) {
					String editContent = sc.nextLine();
					// 사용자가 “exit”을 입력하기 전까지 내용을 StringBuilder
					if(editContent.equals("exit")) {
						break;
					}else {
						sb.append(editContent + "\n");
					}
				}
					// “변경된 내용을 파일에 추가하시겠습니까? (y/n)”
					System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
					String addFile = sc.nextLine();
					
					// 입력 받은 값이 대문자이든 소문자이든 상관없이 “y”이면,
					if(addFile.equalsIgnoreCase("y")) {
						fw = new FileWriter(edit +".txt", true);
						bw = new BufferedWriter(fw);
						bw.write(sb.toString());
						bw.flush();
						System.out.println(edit + ".txt 파일의 내용이 변경되었습니다.");
					}
			}catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				// 열었던 스트림 close
				try {
					br.close(); 
					// BufferedReader br = null;로 밖으로 뺴주기
				} catch (IOException e) {
					e.printStackTrace();
				}
			}	
		

		
	}
	

}
