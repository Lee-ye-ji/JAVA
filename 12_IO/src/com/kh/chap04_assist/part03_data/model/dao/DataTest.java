package com.kh.chap04_assist.part03_data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataTest {
	// DataInputStream
	// DataOutputStream --> 바이트 기반 '보조'스트림
	// 1byte 단위가 아니라 우리가 알고 있는 기본 자료형, String 참조 자료형 단위로 읽고 쓸 수 있음
	
	public void fileSave() {
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))){
			
			// Data 보조 스트림을 이용함으로써 write+자료형() 추가
			dout.writeUTF("둘리");  //String의 경우 메소드 명이  writeUTF()
			dout.writeInt(20);
			dout.writeChar('F');
			dout.writeDouble(171.5);
			
			// 파일 깨져있음
			// int는 4byte, char는 2byte, double은 8byte의 크기로 값을 저장하므로
			// txt(문자 기반 파일)를 통해 해석하면 우리 눈에 보이는 모습으로 확인 불가
			// 따라서 char인 F만 확인 가능
			// => 타입에 맞게 읽어와야 데이터 확인 가능
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
		try(DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))){
			
			String name = din.readUTF();
			int age = din.readInt();
			char gender = din.readChar();
			double height = din.readDouble();
			// 순서 지켜서 읽어 와야 함
			// 읽어올 떄는 write
			
			System.out.println("name : " + name);
			System.out.println("age : " + age);
			System.out.println("gender : " + gender);
			System.out.println("height : " + height);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave2() {
		Scanner sc = new Scanner(System.in);
		try(DataOutputStream dout2 = new DataOutputStream(new FileOutputStream("member2.txt"))){
			while(true) {
				System.out.print("이름을 입력하세요 : ");
				String name = sc.nextLine();
				
				System.out.print("나이를 입력하세요 : ");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.print("성별을 입력하세요 : ");
				char gender = sc.nextLine().charAt(0);
				
				System.out.print("키를 입력하세요 : ");
				double height = sc.nextDouble();
				sc.nextLine();
				
				// Data 보조 스트림을 이용함으로써 write+자료형() 추가
				dout2.writeUTF(name);  //String의 경우 메소드 명이  writeUTF()
				dout2.writeInt(age);
				dout2.writeChar(gender);
				dout2.writeDouble(height);
				
				System.out.print("입력을 끝내시겠습니까?(y/n) :");
				char yn = sc.nextLine().charAt(0);
				
				if(yn == 'y' || yn == 'Y') {
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen2() {
		try(DataInputStream din2 = new DataInputStream(new FileInputStream("member2.txt"))){
			
			while(true) {
			
				System.out.println(din2.readUTF() + ", " + din2.readInt() + ", "
						+ din2.readChar() + ", " + din2.readDouble());
			}
			// EOFException -> End of File
			// : 파일에 더 이상 읽을 내용이 없을 때 발생하는  exception
			// 발생할 수 밖에 없기 떄문에 발생 했을 경우의 로직을 작성
		
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 다 읽어왔습니다.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
