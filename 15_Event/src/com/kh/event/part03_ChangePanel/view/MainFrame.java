package com.kh.event.part03_ChangePanel.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		this.setTitle("프로젝트명");
		this.setBounds(50, 50, 1200, 800);
		
		// 프레임이 가진 컨테이너 호출해서 이용하고자 하는 채널 추가
		// frame 매개변수 전달하면서
		this.getContentPane().add(new StartPage(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
