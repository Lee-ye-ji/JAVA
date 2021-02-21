package com.kh.chap01_file.controller;

import java.io.File;
import java.io.IOException;

public class FileBasicTest {

	// java.io ��Ű���� �ִ� File Ŭ������ �̿��� ���� ����/ ���� -> ���Ͽ� ���� ������ �׽�Ʈ
	public void method1() {
		try {
			// 1. ���� ������Ʈ�� ���� �����ϱ�
			File f1 = new File("text.txt"); // ��������� �޸𸮿� ��ü�� �ִ� ����
			f1.createNewFile();	
			
			// 2. �����ϴ� �⺻ ����̺곪 ������ ���� ���� -> ��α��� ����
//			File f2 = new File("D:\\test.txt");
//			f2.createNewFile();
			
			// 3. ������ ����� ���� �����ϱ�
			//File f3 = new File("D:\\temp\\test.txt");
			//f3.createNewFile();
			// java.io.IOException : ������ ��θ� ã�� �� �����ϴ� -> �ٷ� �����ϴ� ���� �Ұ���
			
			File f3 = new File("D:\\temp");
			//mkdir() : ���ο� ���丮 ����
			//mkdies() : ��� �� ���� ��� ���丮 ����
			f3.mkdir();
			
			File f4 = new File("D:\\temp\\test.txt");
//			f4.createNewFile();
			
			// ������� ���� ���丮�� delete() �� �� ����
			// ���丮�� �ִ� ������ ����� ���丮 �����
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
			
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���� ��� : " + file.getAbsolutePath());
			System.out.println("���� ��� ��� : " + file.getPath());
			System.out.println("���� �뷮 : " + file.length());
			System.out.println("���� ���� : " + file.getParent());			
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
