package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public void clientStart() {
		// 0) Ŭ���̾�Ʈ�� �������� ��û�� �ϱ� ���ؼ��� �ݵ�� ������ IP�ּҿ� ��Ʈ��ȣ�� �˾ƾ���
		int port = 8888;
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			// ������ serverIP�� �ڱ� �ڽ��� ip�� �����ϱ� ���� InetAddress Ŭ������ getLocalHost() �޼ҵ� Ȱ��
			// ���� �����ؾ� �� ���� �ּҰ� �ִٸ� �ش� �ּҷ� �Է� ex. "192.168.10.47"
			
			try {
				// 1) ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ��ü ����
				Socket socket = new Socket(serverIP, port);
				// ���࿡ ��ſ� �����Ѵٸ� null��ȯ
				// ���� ���� Ȯ���� ���� if�� ���
				if(socket != null) {
					// 2) �������� ����� ��Ʈ�� ����
					// 3) ���� ��Ʈ���� ���� ���� ����
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					
					// 4) ��Ʈ���� ���� �а� ����
					// Ŭ���̾�Ʈ --> ���� �޽��� ����
					pw.println("�ݰ�����!");
					pw.flush();
					
					// ���� --> Ŭ���̾�Ʈ �޽��� �о� ����
					System.out.println("�����κ��� ���� �޽���: " + br.readLine());
					
					// 5) ��� ����
					// ��Ʈ�� �ݱ�, ���� �ݱ�
					pw.close();
					br.close();
					socket.close();
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
