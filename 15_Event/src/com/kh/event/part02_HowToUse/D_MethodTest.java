package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


// �ڹ� GUI �̺�Ʈ ó��(Event Handing) ��� 4
// �ش� ������ Ŭ�������� ������ ��� �޾� �޼ҵ� �������̵�
public class D_MethodTest extends JFrame implements ActionListener{
	private JButton btn;
	private JLabel label;
	
	public D_MethodTest() {
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		btn = new JButton("��ư�� ����������");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
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
			label.setText("���� ��ư�� ���������ϴ�.");
		}
		
	}

	
}