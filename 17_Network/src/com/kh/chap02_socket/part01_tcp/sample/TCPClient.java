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
		// 0) 클라이언트가 서버에게 요청을 하기 위해서는 반드시 서버의 IP주소와 포트번호를 알아야함
		int port = 8888;
		try {
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			// 지금은 serverIP를 자기 자신의 ip로 설정하기 위해 InetAddress 클래스의 getLocalHost() 메소드 활용
			// 실제 연결해야 할 서버 주소가 있다면 해당 주소로 입력 ex. "192.168.10.47"
			
			try {
				// 1) 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하여 클라이언트용 소켓 객체 생성
				Socket socket = new Socket(serverIP, port);
				// 만약에 통신에 실패한다면 null반환
				// 따라서 연결 확인을 위해 if문 사용
				if(socket != null) {
					// 2) 서버와의 입출력 스트림 오픈
					// 3) 보조 스트림을 통해 성능 개선
					BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream());
					
					// 4) 스트림을 통해 읽고 쓰기
					// 클라이언트 --> 서버 메시지 전송
					pw.println("반가워요!");
					pw.flush();
					
					// 서버 --> 클라이언트 메시지 읽어 들임
					System.out.println("서버로부터 받은 메시지: " + br.readLine());
					
					// 5) 통신 종료
					// 스트림 닫기, 소켓 닫기
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
