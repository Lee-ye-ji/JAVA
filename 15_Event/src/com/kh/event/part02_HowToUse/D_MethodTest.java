package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// 자바 GUI 이벤트 처리(Event Handing) 방법 4
// 해당 프레임 클래스에서 리스너 상속 받아 메소드 오버라이딩
public class D_MethodTest extends JFrame implements ActionListener{
	private JButton btn;
	private JLabel label;
	
	public D_MethodTest() {
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼을 눌러보세요");
		label = new JLabel("이전 버튼이 눌러지지 않았습니다.");
		
		btn.addActionListener(this);
		
		panel.add(btn);
		panel.add(label);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new D_MethodTest();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			label.setText("드디어 버튼이 눌러졌습니다.");
		}
		
	}

	
}
