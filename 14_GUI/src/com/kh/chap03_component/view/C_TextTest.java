package com.kh.chap03_component.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.chap03_component.controller.TestController;

public class C_TextTest {
	private TestController tc = new TestController();
	public void loginFrame() {
		JFrame frame = new JFrame();
		frame.setSize(800, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));
		panel.setSize(800, 300);
		
		panel.add(new JLabel("ID : "));
		JTextField id = new JTextField(30);
		panel.add(id);
		
		panel.add(new JLabel("PASSWORD : "));
		// 비밀번호를 입력 할 수 있는 TextField -> 입력되는 값을 화면 상에서 볼 수 없으며 한글 입력 불가
		JPasswordField pwd = new JPasswordField(30);
		panel.add(pwd);
		
		JTextArea tArea = new JTextArea(10,30);
		tArea.setEditable(false);
		
		JButton btn = new JButton("보내기");
		
		// 보내기 버튼이 눌러졌을 때 id, pw에 작성 된 값을 가지고 존재하는 유저인지 확인
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String userId = id.getText();
				char[] arr = pwd.getPassword();
				String userPwd = "";
				for(int i = 0; i < arr.length; i++) {
					userPwd += arr[i];
				}
				int result = tc.login(userId, userPwd);
				
				if(result > 0) {
					tArea.setText("성공적으로 로그인했습니다.");
				}else {
					tArea.setText("로그인에 실패했습니다.");
				}
			}
			
		});
		
		frame.add(panel, "North");
		frame.add(tArea, "Center");
		frame.add(btn, "South");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
