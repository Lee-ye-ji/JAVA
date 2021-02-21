package com.kh.chap03_component.controller;

public class TestController {
	
	// 넘겨 받은 id와 pw가 가지고 있는 값과 일치하면 1리턴, 일치하지 않으면 0리턴
	public int login(String id, String pwd) {
		if(id.equals("user1") && pwd.equals("user11"))
			return 1;
		else
			return 0;
	}

}
