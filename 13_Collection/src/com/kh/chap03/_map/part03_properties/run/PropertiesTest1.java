package com.kh.chap03._map.part03_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03._map.part01_hashMap.model.vo.Car;

public class PropertiesTest1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		/*prop.put("소나타", new Car("현대", 13.3));
		System.out.println(prop);
		System.out.println(prop.get("소나타"));
		
		try {
			prop.store(new FileOutputStream("test.properties"), "test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// Properties는 .properties 파일을 위해 사용되는 타입으로
		// 키, 값 모두 String으로 한정
		
		// 1. setProperty(String key, String value) : 값 저장
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop);
		// 순서 유지 X, 키 중복 불가( 값 덮어쓰기)
		
		// 2. getProperty(String key) : 값 가져오기
		System.out.println(prop.getProperty("List"));
		
		// 3. store(OutputStream os, String comments)
		// 		: 저장 된 정보를 바이트 스트림으로 파일에 출력 저장
		//		store(Writer writer, String comments)
		// 		: 저장 된 정보를 문자 스트림으로 파일에 출력 저장
		//		storeToXML(OutputStream os, String comments)
		// 		: 저장 된 정보를 바이트 스트림으로 XML로 출력 저장
		try {
			//prop.store(new FileOutputStream("collection.properties"), "collection");
			prop.storeToXML(new FileOutputStream("collection.xml"), "collection");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
