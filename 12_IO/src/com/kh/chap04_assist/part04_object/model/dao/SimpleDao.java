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
		Phone ph = new Phone("�Ｚ", 990000); //�� ��ü ����
		Phone ph2 = new Phone("LG", 880000);
		// Phone ����ȭ ���� �ʾ��� �� java.io.NotSerializableException �߻�
		
		
		// ���� ��Ʈ��	
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
			
			// �о �ٷ� ����ϱ� -> �� ������� ��� ��
			// System.out.println(ois.readObject());
			// System.out.println(ois.readObject());
			// readObject -> �о�� ���뿡 �´� Ŭ������ ���ٸ� ClassNotFoundException �߻� ����
		
			// ���۷��� ������ ��Ƽ� ���
			Phone p1 = (Phone)ois.readObject();
			// ���� �� ��ȯ(Phone)
			System.out.println(p1);
			Phone p2 = (Phone)ois.readObject();
			System.out.println(p2);
			// readObject �� � Object�� ����� �𸣹Ƿ� ��� Object�� ������
			// Object Ŭ���� Ÿ������ ���� ��(������) -> �ٷ���� �ϴ� Ÿ������ �ٿ� ĳ�����ؼ� �����
			
			// ���� �� �̻� ���� ��ü�� ���µ� readObject()�� ȣ���Ѵٸ�?
			Phone p3 = (Phone)ois.readObject();
			System.out.println(p2);
			
		} catch(EOFException e) {
			System.out.println("������ �� �о����ϴ�.");
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
