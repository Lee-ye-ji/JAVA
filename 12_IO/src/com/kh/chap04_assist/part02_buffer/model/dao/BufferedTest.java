package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	// BufferedReader, BufferedWriter�� ���� ���� �����
	// ���� ��Ʈ���� �������� �Ϲ� ��� ��Ʈ�������� �����ߴ� ������ ��� ������
	// *** ���� ��Ʈ���� �ܵ����� ���� �Ұ� ***
	// �ݵ�� ��� ��Ʈ�� ��ü�� �ʿ�
	
	public void fileSave() {
		//FileWriter fw = new FileWriter("bufferTest.txt");
		//BufferedWriter bw = new BufferedWriter(fw);
		// �� �ٷ� �����
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("bufferTest.txt"))){
			bw.write("�ȳ��ϼ���"); //�̾���
			bw.write(" ������\n"); // �����ϰ� ���� �� \n�� ���� �Է�
			bw.write("������ ������!");
			bw.newLine(); // newLine()�� ���� ����
			bw.write("ȭ����");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		try(BufferedReader br = new BufferedReader(new FileReader("bufferTest.txt"))){
			// BufferedReader�� ���� ������ �� �پ� �о���� ��� readLine()�� ����ϱ� ����
			/*System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());*/
			// �ݺ������� ����
			String value = "";
			// read()�� ��ȯ ���� int�� �� �о�� ���� ������ -1��ȯ
			// readLine()�� ��ȯ ���� String�̹Ƿ� �о�� ���� ������ null ��ȯ
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
