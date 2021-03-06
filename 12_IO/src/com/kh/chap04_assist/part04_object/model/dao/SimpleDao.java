package com.kh.chap04_assist.part04_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part04_object.model.vo.Phone;

public class SimpleDao {
	// ObjectInput/ outputStream
	public void fileSave() {
		Phone ph = new Phone("삼성", 990000); //폰 객체 생성
		Phone ph2 = new Phone("LG", 880000);
		// Phone 직렬화 하지 않았을 시 java.io.NotSerializableException 발생
		
		
		// 보조 스트림	
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.dat"))){
			oos.writeObject(ph);
			oos.writeObject(ph2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.dat"))){
			
			// 읽어서 바로 출력하기 -> 들어간 순서대로 출력 됨
			// System.out.println(ois.readObject());
			// System.out.println(ois.readObject());
			// readObject -> 읽어온 내용에 맞는 클래스가 없다면 ClassNotFoundException 발생 가능
		
			// 레퍼런스 변수에 담아서 출력
			Phone p1 = (Phone)ois.readObject();
			// 강제 형 변환(Phone)
			System.out.println(p1);
			Phone p2 = (Phone)ois.readObject();
			System.out.println(p2);
			// readObject 시 어떤 Object가 담길지 모르므로 모든 Object의 조상인
			// Object 클래스 타입으로 리턴 됨(다형성) -> 다루고자 하는 타입으로 다운 캐스팅해서 써야함
			
			// 만약 더 이상 읽을 객체가 없는데 readObject()를 호출한다면?
			Phone p3 = (Phone)ois.readObject();
			System.out.println(p2);
			
		} catch(EOFException e) {
			System.out.println("파일을 다 읽었습니다.");
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
