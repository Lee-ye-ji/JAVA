package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	// BufferedReader, BufferedWriter를 통한 파일 입출력
	// 보조 스트림의 일종으로 일반 기반 스트림만으로 부족했던 성능을 향상 시켜줌
	// *** 보조 스트림은 단독으로 생성 불가 ***
	// 반드시 기반 스트림 객체가 필요
	
	public void fileSave() {
		//FileWriter fw = new FileWriter("bufferTest.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		// 한 줄로 만들기
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("bufferTest.txt"))){
			bw.write("안녕하세요"); //이어짐
			bw.write(" 여러분\n"); // 개행하고 싶을 떄 \n을 직접 입력
			bw.write("오늘은 수요일!");
			bw.newLine(); // newLine()을 통해 개행
			bw.write("화이팅");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		try(BufferedReader br = new BufferedReader(new FileReader("bufferTest.txt"))){
			// BufferedReader를 쓰는 이유는 한 줄씩 읽어오는 기능 readLine()을 사용하기 위해
			/*System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());*/
			// 반복문으로 수정
			String value = "";
			// read()의 반환 값이 int일 때 읽어올 것이 없으면 -1반환
			// readLine()의 반환 값은 String이므로 읽어올 것이 없으면 null 반환
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
