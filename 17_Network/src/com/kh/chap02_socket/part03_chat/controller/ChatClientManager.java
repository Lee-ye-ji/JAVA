package com.kh.chap02_socket.part03_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.chap02_socket.part03_chat.thread.Receiver;
import com.kh.chap02_socket.part03_chat.thread.Sender;
 
public class ChatClientManager {
	public void startClient() {
		String name = "Client"; //Ŭ���̾�Ʈ ��
		
		int port = 8888;
		String serverIP = null;
		
		
		try {
			// ���� ��ǻ�Ϳ��� ����, Ŭ���̾�Ʈ ��� �����ϹǷ� ���� ��ǻ���� IP�� ���� IP
			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("Client Start");
			
			// Ŭ���̾�Ʈ�� ���� ��ü ����
			Socket socket = new Socket(serverIP, port);
			
			System.out.println("������ ����Ǿ����ϴ�.");
			
			// Ŭ���̾�Ʈ�� �޼����� ������ ���� �� �ֵ��� ������ ����
			Sender sender = new Sender(socket, name);
			Thread sth = new Thread(sender);
			
			Receiver receiver = new Receiver(socket);
			Thread rth = new Thread(receiver);
			
			sth.start();
			rth.start();
			
		} catch (UnknownHostException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
