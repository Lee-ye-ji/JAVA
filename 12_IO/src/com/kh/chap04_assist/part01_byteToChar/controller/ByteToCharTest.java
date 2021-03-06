package com.kh.chap04_assist.part01_byteToChar.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ByteToCharTest {
	//문자 변환 보조 스트림
	// java.io.InputStreamReader
	// java.io.OutputStreamWriter
	public void input() {
		// 보조스트림 a = new 보조스트림(기반스트림)
		InputStreamReader isr = new InputStreamReader(System.in);
		// 표준 입출력 : System.in, System.out, System.err
		// JVM이 자동으로 스트림을 제공해주므로 new를 이용해 직접 스트림을 생성할 필요 없이
		// 바로 외부 자원으로 키보드, 모니터를 선정한 채로 기반으로 인식함
		
		// readLine()이라는 메소드를 사용하기 위해 BufferReader 추가
		// 보조스트림 b = new 보조스트림(a)
		BufferedReader br = new BufferedReader(isr);

		try {
			System.out.print("값 입력 :");
			String value = br.readLine();
			System.out.println("value = " + value);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// 위의 구문을 try~with~resource문으로 작성하기
		// ()안에서 연 스트림을 블럭이 끝나면 자동으로 close하는 문법
		try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))){
			System.out.print("값 입력 :");
			String value = br.readLine();
			System.out.println("value = " + value);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void output() {
		// 보조스트림 a = new 보조스트림(기반스트림)
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		// 보조스트림 b = new 보조스트림(a)
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			String str = "Hello";
			bw.write(str);
			
			// write() 버퍼에 쌓는다
			// flush() 내보낸다
			bw.flush();
			
		}catch (IOException e) {
			e.printStackTrace();
		}/*finally {
			try {
				bw.close(); // close() 시 자동으로 flush() 해줌
				// -> bw.close()시 BufferedWriter 닫히고 -> OutputStreamWriter 닫히고 -> System.out도 닫힘
				// System.out -> 개발자가 생성한 스트림이 아니라  프로그램에서 생성 되어서 제공되는 스트림
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		// 위의 구문 try~with~resource 구문으로 바꾸기
		try(BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out))){
			String str = "Hello";
			bw2.write(str);
			// write() 버퍼에 쌓는다
			// flush() 내보낸다
			bw2.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

	}

