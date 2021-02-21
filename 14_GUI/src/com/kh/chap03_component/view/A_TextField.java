package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A_TextField {
	// ���� �Է� �޾Ƽ� �Է� ���� ���ڸ� ������ ��� �����ϱ�
	public void textFieldTest() {
		// 1. Frame ����
		JFrame frame = new JFrame("���� ����ϱ�");
		frame.setSize(300, 130);
		
		// 2. Panel ����
		JPanel panel = new JPanel();
		panel.add(new JLabel("���� �Է� : "));  //�гο� �� ����
		
		// �ؽ�Ʈ ���� ����
		JTextField text = new JTextField(15);
		panel.add(text);
		
		// ����� ����
		panel.add(new JLabel("���� �� �� : "));
		
		// ������ ��� ���� ��� textfield�̹Ƿ� ���� �Ұ��ϰ� ����
		JTextField result = new JTextField(15);
		result.setEditable(false);
		panel.add(result);
		
		JButton btn = new JButton("ok");
		panel.add(btn);
		
		// btn�� Ŭ������ ��
		// text�� �ִ� ���� �о�ͼ� ���� ����� �� �� result�� �־��ִ� �̺�Ʈ ����
		// �͸� Ŭ������ ���� ActionListener�� ���� �� �޼ҵ带 �������̵��ؼ� �̺�Ʈ �߰�
		btn.addActionListener(new ActionListener() {
			/* ActionEvent : ����ڰ� � ������ �� ��� �߻�. ��� ������Ʈ���� �߻����� ����.
			 * 1. ��ư�� �������� ��
			 * 2. �޴��� Ŭ������ ��
			 * 3. �ؽ�Ʈ �ʵ忡�� ����Ű�� ������ ��
			 */
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int value = Integer.parseInt(text.getText());
				result.setText(value * value + " ");
				
				// �ؽ�Ʈ ���ڷ� �ٽ� ��Ŀ�� ��������
				text.requestFocus();
			}
			
		});
		
		// ������ ���� �г� ����
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
