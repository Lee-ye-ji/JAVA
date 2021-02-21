package com.kh.chap02_layout.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame{
	public F_PanelLayout() {
		super("JPanelLayout");
		
		JLabel lb = new JLabel("이 름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		// 패널 한 개 생성
		JPanel panel = new JPanel();
		panel.setSize(800, 500);
		
		// 패널의 레이아웃 기본 값은 flowlayout
		// 패널의 레이아웃을 설정하지 않으면 기본 flowlayout의 center 값을 가짐
		// 패널 위의 마음대로 배치하기 위해서는 패널에도 레이아웃을 지정해주어야 함
		panel.setLayout(null);
		
		// 패널 위에 두 개의 컴포넌트 올림
		panel.add(lb);
		panel.add(tf);
		panel.setBackground(Color.lightGray);
		
		// 화면에 보이기 위해서는 프레임 위에 패널을 올림
		this.add(panel);
		
		this.setBounds(300, 200, 800, 500);	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
