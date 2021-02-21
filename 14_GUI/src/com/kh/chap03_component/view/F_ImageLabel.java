package com.kh.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class F_ImageLabel {
	public void imageLabelTest() {
		JFrame frame = new JFrame("이미지 라벨 테스트");
		frame.setSize(250, 300);
		
		JPanel panel = new JPanel();
		
		// 이미지 크기 지정하여 이미지 객체 생성
		Image icon = new ImageIcon("image/user.PNG").getImage().getScaledInstance(150, 150, 0);
		// 만들어진 이미지 객체를 JLabel에 넣기
		JLabel label = new JLabel(new ImageIcon(icon));
		JButton button = new JButton("이미지 보기");
		
		// 버튼 클릭 시 다른 이미지로 변경
		button.addActionListener(new ActionListener() {
			int count = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				String image = "";
				if(count % 2 != 0) {
					// 강아지 이미지
					image = "image/dog.PNG";
				}else {
					//user이미지
					image = "image/user.PNG";
				}
				Image icon = new ImageIcon(image).getImage().getScaledInstance(150,150,0);
				label.setIcon(new ImageIcon(icon));
				
			}
			
		});
		
		panel.add(label);
		panel.add(button);
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
