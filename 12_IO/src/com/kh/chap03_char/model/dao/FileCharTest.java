package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharTest {
	// �ؽ�Ʈ ������� ���� ���� ������� �ϴ� Reader/Writer�� ������
	
	public void fileSave() {
		// FileWriter ��� - ���� ��� ���� ��� ��Ʈ��
		FileWriter fw = null;
		
		try {
			// ������ �������� ������ �ڵ����� ���� ����
			// ������ ������ ������ �����
			// ����� �Ȱ� �߰��� ���� �ְ� ���� ���� �Ű����� �����ڿ� true ���(default �Ǵ� false)
			fw = new FileWriter("charTest.txt", true);	
			
			// 1. write(int c) 2. write(char[] cbuf) 3. write(char[] cbut, int off, int len)
			// 4. write(String str) 5. write(String str, int off, int len)
			fw.write("KH����������"); // 4��
			fw.write("L����������", 0, 3); // 5��
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		// FileReader - ���� ��� ���� �Է� ��Ʈ��
		FileReader fr = null;
		
		try {
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
			fr = new FileReader("charTest.txt");	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			try {
				fr.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	

}