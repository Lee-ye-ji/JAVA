package com.kh.chap04_assist.part04_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part04_object.model.vo.Phone;
import com.kh.chap04_assist.part04_object.model.vo.Student;

public class ObjectDao {
	private Student[] stList = new Student[10];
	
	// 인스턴스 초기화 블럭
	//  ObjectDao 객체가 생성 될 때 초기화하는 것 
	{
		// 샘플 데이터
		stList[0] = new Student("우별림", 20, 'F', new Phone("삼성", 990000));
		stList[1] = new Student("김철수", 22, 'M', new Phone("LG", 880000));
	}
	
	public void fileSave() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentList.dat"))){
			
			// 반복문을 통해 Student 10번 출력
			/*for(int i  = 0; i < stList.length; i++) {
				oos.writeObject(stList[i]);
			}*/
			
			// Student[]을 한번에 출력
			oos.writeObject(stList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		Student[] readList = new Student[10];
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentList.dat"))){
			
			// 반복문을 통해 Student 10번 읽어오기
			/*for(int i = 0; i < readList.length; i++) {
				readList[i] = (Student) ois.readObject();
			}*/
			
			// Student[] 1번 읽어오기
			readList = (Student[]) ois.readObject();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		// 읽어온 리스트 출력
		for(int i  = 0; i < readList.length; i++) {
			System.out.println(readList[i]);
		}
		
	}

}
