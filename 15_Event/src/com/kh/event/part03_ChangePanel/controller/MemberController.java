package com.kh.event.part03_ChangePanel.controller;

import java.util.ArrayList;

import com.kh.event.part03_ChangePanel.model.vo.Member;
import com.kh.event.part03_ChangePanel.model.vo.MemberDao;

public class MemberController {
	private MemberDao md = new MemberDao();
	
	//DAO�� ��� ����Ʈ ������ ȣ��
	public ArrayList<Member> getMemberList(){
		return md.openMemberListFile();
	}

}
