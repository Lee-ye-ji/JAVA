package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest2;
import com.kh.chap02_byte.model.dao.FileBytest;

public class Run {

	public static void main(String[] args) {
		// 바이트 기반 스트림 --> 데이터를 1바이트 단위로 전송하는 작업
		
		//FileInputStream/FileOutputStream --> 외부 매체로 파일
		FileBytest fb = new FileBytest();
//		fb.fileSave();
//		fb.fileOpen();
		
		FileByteTest2 fb2 = new FileByteTest2();
		fb2.fileCopy();
	}

}
