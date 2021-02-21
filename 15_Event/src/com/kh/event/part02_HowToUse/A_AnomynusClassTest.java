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

// �ڹ� GUI �̺�Ʈ ó��(Event Handing) ��� 1
// �ش� ������Ʈ�� ������ �߰��ϸ� ����(�͸�) Ŭ���� ����
public class A_AnomynusClassTest {
	private static int count = 0;
	
	public static void main(String[] args) {
		JFrame mf = new JFrame("�͸�Ŭ���� ����");
		mf.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton btn = new JButton("��ư�� ����������");
		JLabel label = new JLabel("���� ��ư�� �������� �ʾҽ��ϴ�.");
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btn) {
					label.setText("���� ��ư�� ���������ϴ�.");
				}
				System.out.println(btn);
				System.out.println(e);
				System.out.println(e.getSource());
			}
			
		});
		
		/* �̺�Ʈ �߻� ���� .addXXXListener(XXXListener / XXXAdapter ����);
		 * 
		 * XXXListener -> Interface -> �߻� �޼ҵ常�� ������ ����
		 * XXXAdapter -> Abstract Class -> Listener�� ������ �߻� Ŭ����
		 * 
		 * Listener �������̽��� �ƹ� ���� ���� ������ ���� Ŭ���� -> Adapter Ŭ����
		 * */
		btn.addMouseListener(new MouseAdapter() {
			// Listener�� �ƴ� Adapter�� ����ϸ� �������̵� �ϰ� ����  �޼ҵ常 ��� �ۼ�(���� �������̵��� �ƴ�)
			
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
