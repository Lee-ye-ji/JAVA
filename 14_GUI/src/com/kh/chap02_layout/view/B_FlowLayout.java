package com.kh.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame{
	public B_FlowLayout() {
		super("FlowLayout");
		
		// ������Ʈ�� ���γ� ���� ������ �� ������ ��ġ�ϴ� ���̾ƿ�
		this.setLayout(new FlowLayout()); // �⺻�� "CENTER"
		
//		this.setLayout(new FlowLayout(FlowLayout.CENTER));
//		this.setLayout(new FlowLayout(FlowLayout.LEFT));
//		this.setLayout(new FlowLayout(FlowLayout.RIGHT));
//		this.setLayout(new FlowLayout(FlowLayout.LEADING));
//		this.setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		this.add(new JButton("1��"));
		this.add(new JButton("2��"));
		this.add(new JButton("3��"));
		this.add(new JButton("4��"));
		this.add(new JButton("5��"));
		this.add(new JButton("6��"));
		this.add(new JButton("7��"));
		this.add(new JButton("8��"));
		this.add(new JButton("9��"));
		this.add(new JButton("10��"));
		this.add(new JButton("11��"));
		this.add(new JButton("12��"));
		this.add(new JButton("13��"));
		this.add(new JButton("14��"));
		this.add(new JButton("15��"));
		
		
		// ������ ��ġ �� ũ�� ����
		this.setBounds(300, 200, 800, 500);	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}