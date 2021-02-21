package com.kh.chap01_inet.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetSample {
	// 연결하고자 하는 대상의 네트워크 정보를 확인할 수 있는 InetAddress 객체 테스트
	public void inSample() {
		try {
			// static InetAddress getLocalHost() : 지역호스트의 IP주소 반환
			InetAddress localIP = InetAddress.getLocalHost();
			System.out.println(localIP);  // 내 pcIP주소 확인
			
			// byte[] getAddress() : IP주소를 byte 배열로 반환
			byte[] ipAddr = localIP.getAddress();
			System.out.println(Arrays.toString(ipAddr));
			
			// String getHostName() : 호스트의 이름 반환
			System.out.println("내 PC명 : " + localIP.getHostName());
			// String getHostAddress() : 호스트의 IP주소 반환
			System.out.println("내 IP : " + localIP.getHostAddress());
			
			// static InetAddress getByName(String host) : 도메인명을 통해 IP주소 얻음
			InetAddress googleIP = InetAddress.getByName("www.google.com");
			System.out.println("구글 서버명 : " + googleIP.getHostName());
			System.out.println("구글 IP : " + googleIP.getHostAddress());
			
			// 해당 도메인이 가지고 있는 IP들을 배열로도 받을 수 있음
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 아이피 개수 : " + naverIPs.length);
			for(InetAddress ip : naverIPs) {
				System.out.println(ip);
			}
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
		}
	}

}
