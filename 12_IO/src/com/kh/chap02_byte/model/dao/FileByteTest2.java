package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest2 {
	public void fileCopy() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			// �����ϴ� �̹��� ������ ����Ʈ ��� ���� �Է� ��Ʈ���� ���� �о�� ��
			fis = new FileInputStream("panda.png");
			
			//����Ʈ ��� ��� ��Ʈ���� ���� �̹��� ������ �����ؼ� ����� ��
			fos = new FileOutputStream("copy.png");
			
			byte[] bArr = new byte[1024];
			
			int cnt = 1;
			int input = 0;
			while((input =  fis.read(bArr)) != -1) {
				fos.write(bArr, 0, input);
				System.out.println(cnt++ + "KB ���ۿϷ�");
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();	
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
