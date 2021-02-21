package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 자바 GUI 이벤트 처리(Event Hading) 방법 1
// 내부 클래스에 리스너나 어댑터 상속 처리해서 메소드 오버라이딩
public class C_InnerClassTest extends JFrame{
	private JButton btn;
	private JLabel label;
	
	public C_InnerClassTest() {
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼을 눌러보세요");
		label = new JLabel("이전 버튼이 눌러지지 않았습니다.");
		
		btn.addActionListener(new MyEvent());
		
		panel.add(btn);
		panel.add(label);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	private class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btn) {
				label.setText("드디어 버튼이 눌러졌습니다.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new C_InnerClassTest();
	}
}


