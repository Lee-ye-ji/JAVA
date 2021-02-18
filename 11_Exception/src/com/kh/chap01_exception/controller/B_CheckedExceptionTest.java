package com.kh.chap01_exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedExceptionTest {
	// ChectedException�� �ݵ�� ���� ó���� ���־���ϴ� ����
	// -> ���ǹ��̳� �ҽ� �ڵ� �������δ� �ذ��� �� ����
	// -> �ַ� IOException ó��
	
	public void method1() {
		method2();
	}
	
	public void method2(){
		// IO������ ���� �𸣹Ƿ� �����ϰ� �׽�Ʈ
		// Scanner�� ���� Ű����� ���� �Է¹޴� �뵵��
		// java.io.BufferedReader ��ü ����(���ڿ��� �Է� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ڿ��� �Է� : ");
		
		// �����(IO)�� "��Ʈ��"�� ���� �ܺ� �ڿ��� �̷����
		// ex. ���� ����� �� �ش� ��ο� �о�� ������ ������ �о�� �� �����Ƿ�
		// IOException�� �ļ��� FileNotFoundException�� �߻���
		
		try {
			String str = br.readLine();
			System.out.println("�Է� ���� ���ڿ� : " + str);
		}catch(IOException e) {
			e.printStackTrace();
		}finally{
			// ��� �� ��Ʈ���� �ݾ���� �ϹǷ� finally �� �ȿ� ��Ʈ���� �ݴ� ������ �ۼ���
			try {
				br.close();	
			}catch(IOException e){
				e.printStackTrace();
			}
			
		}
		
		// 1. throws : ���� ȣ���� �޼ҵ忡�� ���� ó�� ����
		// ���ϴ� ��ġ���� ����ó���� �� �� �ֵ��� ��
		// main �޼ҵ忡���� ó������ �ʴ� ��� ������ ����
		
		// 2. try ~ catch
		// (1) try {} : ���� �߻� ���ɼ� �ִ� ���� �ۼ�
		// (2) catch(����Ŭ���� �Ű�����){} : ���ܰ� �߻��Ǵ� ��� ó���ؾ��ϴ� ���� �ۼ�
		// (3) finally {} : ���� �߻� ���ο� ���� ���� �� ó���ؾ��ϴ� ���� ���
		
	}
}

// ��ӵ� �׷�����
// Throwable <- Error
//			 <- Exception <- RuntimeException : ���α׷� ���� �� / ������ ���� X / ����ó�� ���û���(if�� �ǰ�) => UncheckException
//						<- �� ��(IOException) : ������ ���� / ������ ���� / ������ ���� O / ����ó�� �ʼ����� => CheckedException
