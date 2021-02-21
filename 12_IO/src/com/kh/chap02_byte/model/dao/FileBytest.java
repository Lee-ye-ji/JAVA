package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// vo => value object == dto => data transfer object(������ ���� ��ü)
// dao => data access object : DataBase�� data�� �����ϱ� ���� ��ü 
// DBMS�� ���� �������� File�� Data�� �����Ͽ� ������ϴ� ������ ���� �� ��

public class FileBytest {
	public void fileSave() {
		// ���� ���� -> ���α׷����κ��� ������ ������ -> ���� ���
		// FileOutputStream ���
		File file = new File("sample.txt");
		FileOutputStream fout = null;
		
		try {
			// FileOutputStream fout = new FileOutputStram(file); -> ���� ��ü ����
			// -> �ش� ��Ʈ���� �� ���� FileNotFoundException �߻� �� �� �����Ƿ� try~catch ó��
			
			fout = new FileOutputStream("byteTest.txt", true); // -> ���ڿ��� ���ϸ� ����
			// -> ������ ������ ���������� ����� �ִµ� �� FileNotFoundException�� �߻��ұ�?
			// -> �������� �ʴ� ��θ� �ۼ����� ��� "������ ��θ� ã�� �� �����ϴ�"��� exception �߻�
			
			// 1. write(int b)
			fout.write(65);
			fout.write('B');
			
			// 2. write(int b)
			byte[] bArr = {97,98,99};
			fout.write(bArr);
			
			// 3. write(byte[]b, int off, int len)
			// �־��� �迭�� ����� ���� �� off��°���� len�� ��ŭ ����
			fout.write(bArr, 1, 2);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			// ��Ʈ���� ��� �� �ݵ�� �ݳ��ؾ� �ϹǷ� ��Ʈ��.close() �޼ҵ� ȣ�� �ʿ�
			// �ش� ��Ʈ���� ���� ������ try{} �� �迭���� ���־�� finally{} �������� �ν��� �� ����
			// ��Ʈ���� ���� ���� IOException ó���� �ʿ�
			try {
				fout.close();	
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void fileOpen() {
		// ������ ���� -> ���α׷����� ������ �о� �� -> �Է� ��Ʈ��
		//FileInputStream ���
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("byteTest.txt"); //FileNotFoundException�߻� ����
			
			// 1. int read() : 1byte�� �о���� �� �̻� �о�� ���� ������ -1�� ��ȯ
			// 2. int read(byte[] b) : �迭 b�� ũ�� ��ŭ �о �迭�� ä��� �о�� �������� �� ��ȯ
			// 3. int read(byte[] b, int off, int len) : �ִ� len���� byte�� �о �迭 b�� ������ ��ġ(off)���� ����
			
			/*System.out.println(fis.read()); // IOException �߻� ����
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());*/ // �� �̻� �о�� ���� ������ -1��ȯ
			
			// �ݺ������� �ٲٱ� -> fis.read() �� �� ȣ���ϴ� ���� �ƴ϶� ������ �޾��ִ� ������ ����
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
