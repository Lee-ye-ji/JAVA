package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest2;
import com.kh.chap02_byte.model.dao.FileBytest;

public class Run {

	public static void main(String[] args) {
		// ����Ʈ ��� ��Ʈ�� --> �����͸� 1����Ʈ ������ �����ϴ� �۾�
		
		//FileInputStream/FileOutputStream --> �ܺ� ��ü�� ����
		FileBytest fb = new FileBytest();
//		fb.fileSave();
//		fb.fileOpen();
		
		FileByteTest2 fb2 = new FileByteTest2();
		fb2.fileCopy();
	}

}
