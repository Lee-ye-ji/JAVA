package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButton {
	public void radioButtonTest() {
		JFrame frame = new JFrame("���� ��ư �׽�Ʈ");
		frame.setSize(300, 150);
		
		JPanel toPanel = new JPanel();
		JLabel label = new JLabel("�ũ���� Ŀ�Ǹ� �ֹ��Ͻðڽ��ϱ�?");
		
		toPanel.add(label);
		frame.add(toPanel, "North");
		
		// ���� ��ư ����
		JRadioButton small = new JRadioButton("Small Size");
		JRadioButton medium = new JRadioButton("Medium Size");
		JRadioButton large = new JRadioButton("Large Size");
		
		// ���� ��ư�� ���� ������ �Ұ����ϰ� �����ϰ� ����� �뵵 �̹Ƿ�
		// ��ư�� �ݵ�� �׷����� �����־�� ��
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		
		// ���� ��ư�� ���� �� �г� ����
		JPanel sizePanel = new JPanel();
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);
		
		frame.add(sizePanel, "Center");
		
		// ��� ����
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("ũ�Ⱑ ���õ��� �ʾҽ��ϴ�.");
		resultPanel.add(text);
		frame.add(resultPanel, "South");
		
		small.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Small size�� ���õǾ����ϴ�.");
				
			}
			
		});
		
		medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Medium size�� ���õǾ����ϴ�.");
				
			}
			
		});
		
		large.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Large size�� ���õǾ����ϴ�.");
				
			}
			
		});
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
