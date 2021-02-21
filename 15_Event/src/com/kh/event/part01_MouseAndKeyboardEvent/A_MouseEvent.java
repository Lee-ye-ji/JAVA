package com.kh.event.part01_MouseAndKeyboardEvent;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

// MouseEvent : 마우스 클릭 될 때, 늘릴 때 , 뗄 때, 해당 주체 들어갈 때, 빠져나올 때의 상황에서 클릭
// MouseMotionEvent : 마우스가 움직였을 때 발생
// 해당 프레임 클래스에서 리스너 상속받아 메소드 오버라이딩
public class A_MouseEvent extends JFrame implements MouseListener, MouseMotionListener{

	public A_MouseEvent() {
		this.setTitle("Mouse Event");
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		
		// 패널에 마우스 이벤트 감지 부착
		panel.addMouseListener(this); // -> A_MouseEvent에서 MouseListener를 상속 받아 구현하였으므로 this 전달
		panel.addMouseMotionListener(this);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new A_MouseEvent();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		this.display("Mouse Clicked : ", e);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.display("Mouse Pressed : ", e);
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.display("Mouse Released: ", e);
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.display("Mouse Entered : ", e);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.display("Mouse Exited : ", e);
		
	}

	private void display(String s, MouseEvent e) {
		System.out.println(s + "X =" + e.getX() + " Y =" + e.getY());
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		this.display("Mouse Dragged : ", e);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		this.display("Mouse Moved : ", e);
		
	}

}
