package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �ڹ� GUI �̺�Ʈ ó��(Event Hading) ��� 1
// ���� Ŭ������ �����ʳ� ����� ��� ó���ؼ� �޼ҵ� �������̵�
public class C_InnerClassTest extends JFrame{
	private JButton btn;
	private JLabel label;
	
	public C_InnerClassTest() {
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		btn = new JButton("��ư�� ����������");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
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
				label.setText("���� ��ư�� ���������ϴ�.");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		new C_InnerClassTest();
	}
}


