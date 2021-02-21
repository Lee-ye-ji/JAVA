package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 자바 GUI 이벤트 처리(Event Handing) 방법 2
// 별도의 외부 클래스로 작성하고 참조해서 사용
public class B_OtherClassTest extends JFrame{
	
	private JButton btn;
	private JLabel label;
	
	public B_OtherClassTest() {
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		btn = new JButton("버튼을 눌러보세요");
		label = new JLabel("이전 버튼이 눌러지지 않았습니다.");
		
		btn.addActionListener(new MyEvent(btn, label));
		
		panel.add(btn);
		panel.add(label);
		
		this.add(panel);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new B_OtherClassTest();
	}
}


class MyEvent implements ActionListener{
	private JButton btn;
	private JLabel label;
	
	public MyEvent(JButton btn, JLabel label) {
		this.btn = btn;
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn) {
			label.setText("드디어 버튼이 눌러졌습니다.");
		}
		
	}
	
}