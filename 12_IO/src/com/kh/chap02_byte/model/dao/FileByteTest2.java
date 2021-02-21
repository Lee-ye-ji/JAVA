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
			// 존재하는 이미지 파일을 바이트 기반 파일 입력 스트림을 통해 읽어올 것
			fis = new FileInputStream("panda.png");
			
			//바이트 기반 출력 스트림을 통해 이미지 파일을 복사해서 출력할 것
			fos = new FileOutputStream("copy.png");
			
			byte[] bArr = new byte[1024];
			
			int cnt = 1;
			int input = 0;
			while((input =  fis.read(bArr)) != -1) {
				fos.write(bArr, 0, input);
				System.out.println(cnt++ + "KB 전송완료");
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
