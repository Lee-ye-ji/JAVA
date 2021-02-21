package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A_TextField {
	// 숫자 입력 받아서 입력 받은 숫자를 제곱한 결과 리턴하기
	public void textFieldTest() {
		// 1. Frame 생성
		JFrame frame = new JFrame("제곱 계산하기");
		frame.setSize(300, 130);
		
		// 2. Panel 생성
		JPanel panel = new JPanel();
		panel.add(new JLabel("숫자 입력 : "));  //패널에 라벨 부착
		
		// 텍스트 상자 생성
		JTextField text = new JTextField(15);
		panel.add(text);
		
		// 결과물 영역
		panel.add(new JLabel("제곱 한 값 : "));
		
		// 제곱된 결과 값이 담길 textfield이므로 수정 불가하게 설정
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		JButton btn = new JButton("ok");
		panel.add(btn);
		
		// btn을 클릭했을 때
		// text에 있는 값을 읽어와서 제곱 계산을 한 뒤 result에 넣어주는 이벤트 생성
		// 익명 클래스를 통해 ActionListener에 정의 된 메소드를 오버라이딩해서 이벤트 추가
		btn.addActionListener(new ActionListener() {
			/* ActionEvent : 사용자가 어떤 동작을 할 경우 발생. 모든 컴포넌트에서 발생하지 않음.
			 * 1. 버튼이 눌러졌을 때
			 * 2. 메뉴를 클릭했을 때
			 * 3. 텍스트 필드에서 엔터키를 눌렀을 때
			 */
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText());
				result.setText(value * value + " ");
				
				// 텍스트 상자로 다시 포커스 가져가기
				text.requestFocus();
			}
			
		});
		
		// 프레임 위에 패널 부착
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
