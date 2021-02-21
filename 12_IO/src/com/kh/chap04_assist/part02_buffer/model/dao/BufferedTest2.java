package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTest2 {
	// ���� �׽�Ʈ
	public void testFileReader() {
		try(FileReader fr = new FileReader("bufferedTest.txt")){
			
			long start = System.currentTimeMillis();
			// ���� �ð��� �и������ʷ� �˷���
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println();
			System.out.println("FileReader ��� ��Ʈ�������� �о���� �� �ɸ� �ð� :"
					+ (end - start) + "(ms)");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testBufferedReader() {
		try(BufferedReader br = new BufferedReader(new FileReader("bufferTest.txt"))){
			
			long start = System.currentTimeMillis();
			
			String value = "";
			while((value = br.readLine()) != null) {
				System.out.print(value);
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println();
			System.out.println("BufferedReader�� ������Ʈ������ ����Ͽ� �о���� �� �ɸ� �ð� : "
					+ (end - start) + "(ms)");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
