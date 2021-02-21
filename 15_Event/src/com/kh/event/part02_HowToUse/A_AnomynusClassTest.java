package com.kh.event.part02_HowToUse;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 자바 GUI 이벤트 처리(Event Handing) 방법 1
// 해당 컴포넌트에 리스너 추가하면 무명(익명) 클래스 구현
public class A_AnomynusClassTest {
	private static int count = 0;
	
	public static void main(String[] args) {
		JFrame mf = new JFrame("익명클래스 예제");
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton btn = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("이전 버튼이 눌러지지 않았습니다.");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn) {
					label.setText("드디어 버튼이 눌려졌습니다.");
				}
				System.out.println(btn);
				System.out.println(e);
				System.out.println(e.getSource());
			}
			
		});
		
		/* 이벤트 발생 주제 .addXXXListener(XXXListener / XXXAdapter 생성);
		 * 
		 * XXXListener -> Interface -> 추상 메소드만을 가지고 있음
		 * XXXAdapter -> Abstract Class -> Listener를 구현한 추상 클래스
		 * 
		 * Listener 인터페이스를 아무 내용 없이 구현해 놓은 클래스 -> Adapter 클래스
		 * */
		btn.addMouseListener(new MouseAdapter() {
			// Listener가 아닌 Adapter를 사용하면 오버라이딩 하고 싶은  메소드만 골라서 작성(강제 오버라이딩이 아님)
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int num = count % 7;
				switch(num) {
				case 0: 
					btn.setBackground(Color.RED);
					break;
				case 1: 
					btn.setBackground(Color.RED);
					break;
				case 2: 
					btn.setBackground(Color.blue);
					break;
				case 3: 
					btn.setBackground(Color.CYAN);
					break;
				case 4: 
					btn.setBackground(Color.darkGray);
					break;
				case 5: 
					btn.setBackground(Color.PINK);
					break;
				case 6: 
					btn.setBackground(Color.lightGray);
					break;
				}
				count++;
			}
			
			
		});
		
		panel.add(btn);
		panel.add(label);
		
		mf.add(panel);
		
		mf.setVisible(true);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
