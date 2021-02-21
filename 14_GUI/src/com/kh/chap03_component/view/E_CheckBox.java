package com.kh.chap03_component.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class E_CheckBox {
	public void checkBoxTest() {
		JFrame frame = new JFrame();
		
		// �迭 �����Ͽ� ���� ���� üũ �ڽ��� ������
		String[] fruits = {"apple", "orange", "banana"};
		JCheckBox[] buttons = new JCheckBox[3];
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		// ���� ���� üũ�ڽ��� �ݺ����� ����Ͽ� ����
		JPanel checkPanel = new JPanel();
		for(int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		
		// ��� ����
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("������ ������ �����ϴ�.");
		resultPanel.add(text);
		
		// ���� ���� �̺�Ʈ�� ���ÿ� �ݺ����� ���� ���� ����
		for(int i = 0; i < buttons.length; i++) {
			// �׸��� ���� �Ǵ� ���� �Ǿ����� ��Ÿ���� ItemEvent�� ���ڱ�
			buttons[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = "";
					int ctn = 0;
					// üũ�� �Ǿ��ִ� üũ�ڽ��� ��� Ȯ���Ͽ�
					// ���ڿ��� ���� �����ϰ� �󺧿� ����� ������
					for(int i = 0; i < buttons.length; i++) {
						// üũ �� ���¸� true
						if(buttons[i].isSelected()) {
							result += buttons[i].getText() + " ";
							ctn++;
						}
					}
					if(ctn == 0) {
						text.setText("������ ������ �����ϴ�.");
					}else {
						text.setText(result);
					}
					
				}
				
			});
		}
		
		
		
		
		
		frame.add(checkPanel, "North");
		frame.add(resultPanel, "Center");
		
		// ���� ���� ������Ʈ ������� ����� �� -> pack
		frame.pack();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
