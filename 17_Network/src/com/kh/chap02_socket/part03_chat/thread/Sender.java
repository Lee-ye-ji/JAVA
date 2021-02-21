package com.kh.chap02_socket.part03_chat.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender implements Runnable{
	// 1. Ŭ�������� ����� �ʵ� ����
	private String name;   // �����͸� ������ ����ڸ�
	private DataOutputStream out; // ������ ��¿� ��Ʈ��
	private Scanner sc;				// ä�� ������ �Է¹��� Scanner

	// 2. �Ű����� �ִ� ������
	// Sender ��ü ���� �� �Ű������� Socket�� name�� �޾ƿ�
	// Server���� ���� : ��û�� ������ Client�� ����, ������
	// Client���� ���� : ���� �� Server�� ����, Ŭ���̾�Ʈ��
	
	public Sender(Socket socket, String name) {
		this.name = name;
		try {
			this.out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		sc = new Scanner(System.in);
		
		while(true) {
			try {
				out.writeUTF(name + " > " + sc.nextLine());
			} catch (IOException e) {
				// e.printStackTrace();
				// ������ Ŭ���̾�Ʈ �� �� ���� ���� �����ϸ� ���� �߻� --> �����Ű��
				break;
			}
		}
		
	}
}