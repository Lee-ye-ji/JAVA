package com.kh.chap03._map.part03_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		// 4. load(InputStream inStream)
		// : 바이트 스트림으로 저장 된 파일의 내용을 읽어와서 Properties 객체에 저장
		// : 문자 스트림으로 저장된 파일의 내용을 읽어와서 Properties 객체에 저장
		//	 loadFromXML(InputStream inStream)
		// : 바이트 스트림으로 저장된 XML 파일의 내용을 읽어와서 Properties 객체에 저장
		try {
			//prop.load(new FileInputStream("collection.properties"));
			prop.loadFromXML(new FileInputStream("collection.xml"));
			
			// 5. list(PrintStream out) : 특정 out stream을 통한 출력
			prop.list(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
