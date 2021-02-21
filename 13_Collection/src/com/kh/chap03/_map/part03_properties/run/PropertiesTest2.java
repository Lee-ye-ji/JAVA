package com.kh.chap03._map.part03_properties.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		// 4. load(InputStream inStream)
		// : ����Ʈ ��Ʈ������ ���� �� ������ ������ �о�ͼ� Properties ��ü�� ����
		// : ���� ��Ʈ������ ����� ������ ������ �о�ͼ� Properties ��ü�� ����
		//	 loadFromXML(InputStream inStream)
		// : ����Ʈ ��Ʈ������ ����� XML ������ ������ �о�ͼ� Properties ��ü�� ����
		try {
			//prop.load(new FileInputStream("collection.properties"));
			prop.loadFromXML(new FileInputStream("collection.xml"));
			
			// 5. list(PrintStream out) : Ư�� out stream�� ���� ���
			prop.list(System.out);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
