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
		// ��й�ȣ�� �Է� �� �� �ִ� TextField -> �ԷµǴ� ���� ȭ�� �󿡼� �� �� ������ �ѱ� �Է� �Ұ�
		JPasswordField pwd = new JPasswordField(30);
		panel.add(pwd);
		
		JTextArea tArea = new JTextArea(10,30);
		tArea.setEditable(false);
		
		JButton btn = new JButton("������");
		
		// ������ ��ư�� �������� �� id, pw�� �ۼ� �� ���� ������ �����ϴ� �������� Ȯ��
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
					tArea.setText("���������� �α����߽��ϴ�.");
				}else {
					tArea.setText("�α��ο� �����߽��ϴ�.");
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
