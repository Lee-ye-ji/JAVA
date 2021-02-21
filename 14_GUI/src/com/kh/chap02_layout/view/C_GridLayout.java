package com.kh.chap02_layout.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class C_GridLayout extends JFrame{
	public C_GridLayout() {
		super("GridLayout");
		
		// 컴포넌트를 가로, 세로 일정 수 만큼 배치하고자 할 때 사용
		this.setLayout(new GridLayout(5, 5, 10, 20));
		//							가로 칸, 세로 칸, 가로 갭, 세로 갭
		
		for(int i = 1; i <= 25; i++) {
			String str = new Integer(i).toString();
			this.add(new JButton(str));
		}
		
		this.setBounds(300, 200, 800, 500);	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
