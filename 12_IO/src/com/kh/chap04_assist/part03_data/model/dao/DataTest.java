package com.kh.chap04_assist.part03_data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataTest {
	// DataInputStream
	// DataOutputStream --> ����Ʈ ��� '����'��Ʈ��
	// 1byte ������ �ƴ϶� �츮�� �˰� �ִ� �⺻ �ڷ���, String ���� �ڷ��� ������ �а� �� �� ����
	
	public void fileSave() {
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))){
			
			// Data ���� ��Ʈ���� �̿������ν� write+�ڷ���() �߰�
			dout.writeUTF("�Ѹ�");  //String�� ��� �޼ҵ� ����  writeUTF()
			dout.writeInt(20);
			dout.writeChar('F');
			dout.writeDouble(171.5);
			
			// ���� ��������
			// int�� 4byte, char�� 2byte, double�� 8byte�� ũ��� ���� �����ϹǷ�
			// txt(���� ��� ����)�� ���� �ؼ��ϸ� �츮 ���� ���̴� ������� Ȯ�� �Ұ�
			// ���� char�� F�� Ȯ�� ����
			// => Ÿ�Կ� �°� �о�;� ������ Ȯ�� ����
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

	public void fileOpen() {
		try(DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))){
			
			String name = din.readUTF();
			int age = din.readInt();
			char gender = din.readChar();
			double height = din.readDouble();
			// ���� ���Ѽ� �о� �;� ��
			// �о�� ���� write
			
			System.out.println("name : " + name);
			System.out.println("age : " + age);
			System.out.println("gender : " + gender);
			System.out.println("height : " + height);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave2() {
		Scanner sc = new Scanner(System.in);
		try(DataOutputStream dout2 = new DataOutputStream(new FileOutputStream("member2.txt"))){
			while(true) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = sc.nextLine();
				
				System.out.print("���̸� �Է��ϼ��� : ");
				int age = sc.nextInt();
				sc.nextLine();
				
				System.out.print("������ �Է��ϼ��� : ");
				char gender = sc.nextLine().charAt(0);
				
				System.out.print("Ű�� �Է��ϼ��� : ");
				double height = sc.nextDouble();
				sc.nextLine();
				
				// Data ���� ��Ʈ���� �̿������ν� write+�ڷ���() �߰�
				dout2.writeUTF(name);  //String�� ��� �޼ҵ� ����  writeUTF()
				dout2.writeInt(age);
				dout2.writeChar(gender);
				dout2.writeDouble(height);
				
				System.out.print("�Է��� �����ðڽ��ϱ�?(y/n) :");
				char yn = sc.nextLine().charAt(0);
				
				if(yn == 'y' || yn == 'Y') {
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen2() {
		try(DataInputStream din2 = new DataInputStream(new FileInputStream("member2.txt"))){
			
			while(true) {
			
				System.out.println(din2.readUTF() + ", " + din2.readInt() + ", "
						+ din2.readChar() + ", " + din2.readDouble());
			}
			// EOFException -> End of File
			// : ���Ͽ� �� �̻� ���� ������ ���� �� �߻��ϴ�  exception
			// �߻��� �� �ۿ� ���� ������ �߻� ���� ����� ������ �ۼ�
		
		} catch (EOFException e) {
			// TODO Auto-generated catch block
			System.out.println("������ �� �о�Խ��ϴ�.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
