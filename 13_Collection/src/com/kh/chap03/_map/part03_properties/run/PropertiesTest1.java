package com.kh.chap03._map.part03_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03._map.part01_hashMap.model.vo.Car;

public class PropertiesTest1 {
	public static void main(String[] args) {
		Properties prop = new Properties();
		
		/*prop.put("�ҳ�Ÿ", new Car("����", 13.3));
		System.out.println(prop);
		System.out.println(prop.get("�ҳ�Ÿ"));
		
		try {
			prop.store(new FileOutputStream("test.properties"), "test");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		// Properties�� .properties ������ ���� ���Ǵ� Ÿ������
		// Ű, �� ��� String���� ����
		
		// 1. setProperty(String key, String value) : �� ����
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop);
		// ���� ���� X, Ű �ߺ� �Ұ�( �� �����)
		
		// 2. getProperty(String key) : �� ��������
		System.out.println(prop.getProperty("List"));
		
		// 3. store(OutputStream os, String comments)
		// 		: ���� �� ������ ����Ʈ ��Ʈ������ ���Ͽ� ��� ����
		//		store(Writer writer, String comments)
		// 		: ���� �� ������ ���� ��Ʈ������ ���Ͽ� ��� ����
		//		storeToXML(OutputStream os, String comments)
		// 		: ���� �� ������ ����Ʈ ��Ʈ������ XML�� ��� ����
		try {
			//prop.store(new FileOutputStream("collection.properties"), "collection");
			prop.storeToXML(new FileOutputStream("collection.xml"), "collection");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
