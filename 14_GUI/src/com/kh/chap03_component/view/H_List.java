package com.kh.chap03_component.view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class H_List {
	public void listTest() {
		JFrame frame = new JFrame("����Ʈ �׽�Ʈ");
		frame.setSize(300, 200);
		
		// ����Ʈ�� �ø� ä��
		JPanel listPanel = new JPanel();
		
		// ����Ʈ�� ������ �迭 ����
		String[] cities = {"����", "����", "�λ�", "���", "��õ", "����", "����"};
		
		// ����Ʈ ����
		JList list = new JList(cities);
		
		// ����Ʈ ��輱 ����
		list.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 10));
		
		// ����Ʈ�� ��ũ�ѹ� �߰�
		JScrollPane scoller = new JScrollPane(list);
		
		// ��ũ���� ������Ʈ �гο� �ø�
		listPanel.add(scoller);
		
		// Dimension : ũ�⸦ �����ϱ� ���� Ŭ����
		scoller.setPreferredSize(new Dimension(200, 100));
		
		// ���� ��� 1. ���� ���� ���
//		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// ���� ��� 2. ���� ���� ��� -> ������ ����Ʈ�� ���� ����
//		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		// ���� ��� 3. ���� ���� ��� -> ������  + �ָ� �ִ� ����Ʈ ���� ����
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		// ��� ����
		JPanel resultPanel = new JPanel();
		JLabel label = new JLabel("���� �� �׸� : ");
		JTextField selected = new JTextField(10);
		selected.setEditable(false); // ���� �Ұ� -> readonly
		
		// ����Ʈ�� ���� �Ǿ��� ����� �̺�Ʈ ����
		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// ���� ���� ����� ��� ���õ� ���� ����Ʈ�� ���� ����
				List l = list.getSelectedValuesList();
				String result = "";
				for(int i = 0; i < l.size(); i++) {
					result += l.get(i) + " ";
				}
				// �ݺ������� �׾� �� ��� ���� �ؽ�Ʈ �ʵ忡 ����
				selected.setText(result);
			}
			
		});
		
		
		resultPanel.add(label);
		resultPanel.add(selected);
		
		frame.add(listPanel, "North");
		frame.add(resultPanel, "South");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
