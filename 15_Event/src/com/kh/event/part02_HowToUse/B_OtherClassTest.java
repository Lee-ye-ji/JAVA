package com.kh.event.part02_HowToUse;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// �ڹ� GUI �̺�Ʈ ó��(Event Handing) ��� 2
// ������ �ܺ� Ŭ������ �ۼ��ϰ� �����ؼ� ���
public class B_OtherClassTest extends JFrame{
	
	private JButton btn;
	private JLabel label;
	
	public B_OtherClassTest() {
		this.setSize(300,200);
		
		JPanel panel = new JPanel();
		btn = new JButton("��ư�� ����������");
		label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
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
			label.setText("���� ��ư�� ���������ϴ�.");
		}
		
	}
	
}