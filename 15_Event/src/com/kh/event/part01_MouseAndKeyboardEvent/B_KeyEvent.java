package com.kh.event.part01_MouseAndKeyboardEvent;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

// KeyEvent : 키를 누르면 키보드 포커스를 가지고 있는 객체에서 발생

// 해당 프레임 클래스에서 리스너 상속 받아 메소드 오버라이딩
public class B_KeyEvent extends JFrame implements KeyListener{
	
	public B_KeyEvent() {
		this.setTitle("키보드 이벤트");
		this.setSize(300, 200);
		
		JTextField tf = new JTextField(20);
		tf.addKeyListener(this);
		
		this.add(tf);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new B_KeyEvent();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		this.display("Mouse keyTyped : ", e);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		this.display("Mouse Pressed : ", e);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		this.display("Mouse Released : ", e);
		
	}

	private void display(String s, KeyEvent e) {
		// 눌러진 키에 해당하는 문자 값
		char c = e.getKeyChar();
		// 눌러진 키에 대한 정수형인 키 코드 값
		int keyCode = e.getKeyCode();
		
		// Alt, Ctrl, Shift 판별
		String modifies = e.isAltDown() + " " + e.isControlDown() + " " + e.isShiftDown();
		
		System.out.println(s + " " + c + " " + keyCode + " " + modifies);
	}

}
