package com.kh.chap01_container.view;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

// 프레임을 생성하는 방법2
// javax.swing.JFrame 클래스를 객체로 생성 후
// 해당 프레임 객체의 설정 값을 변경하는 방법
public class JFrameView2 {
	public JFrameView2() {}
	
	public void showJFrame() {
		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("MyFrame2");
		
		// Rectangle 객체를 활용한 사이즈 설정
		Rectangle r = new Rectangle(300, 200, 800, 500);
		mainFrame.setBounds(r);
		
		mainFrame.setResizable(false);
		
		try {
			mainFrame.setIconImage(ImageIO.read(new File("image/icon.PNG")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
