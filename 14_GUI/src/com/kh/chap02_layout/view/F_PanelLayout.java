package com.kh.chap02_layout.view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame{
	public F_PanelLayout() {
		super("JPanelLayout");
		
		JLabel lb = new JLabel("�� �� : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		
		JTextField tf = new JTextField(20);
		tf.setLocation(110, 100);
		tf.setSize(200, 50);
		
		// �г� �� �� ����
		JPanel panel = new JPanel();
		panel.setSize(800, 500);
		
		// �г��� ���̾ƿ� �⺻ ���� flowlayout
		// �г��� ���̾ƿ��� �������� ������ �⺻ flowlayout�� center ���� ����
		// �г� ���� ������� ��ġ�ϱ� ���ؼ��� �гο��� ���̾ƿ��� �������־�� ��
		panel.setLayout(null);
		
		// �г� ���� �� ���� ������Ʈ �ø�
		panel.add(lb);
		panel.add(tf);
		panel.setBackground(Color.lightGray);
		
		// ȭ�鿡 ���̱� ���ؼ��� ������ ���� �г��� �ø�
		this.add(panel);
		
		this.setBounds(300, 200, 800, 500);	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
