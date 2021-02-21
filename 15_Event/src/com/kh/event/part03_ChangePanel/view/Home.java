package com.kh.event.part03_ChangePanel.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home extends JPanel implements ActionListener{
	private JFrame mainFrame;
	private JButton[] btn = new JButton[5];
	
	public Home(JFrame mf) {
		mainFrame = mf;
		this.setLayout(null);
		
		JLabel main = new JLabel("HOME");
		main.setBounds(575, 0, 100, 30);
		this.add(main);
		
		JPanel menuPanel = new JPanel();
		menuPanel.setBounds(350, 50, 500, 50);
		
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton("MENU" + (i+1));
			// 각 버튼 클릭 시 별도의 화면 이동 이벤트 작성하면 됨
			btn[i].addActionListener(this);
			menuPanel.add(btn[i]);
		}
		
		this.add(menuPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JPanel changePanel = null;
		
		if(e.getSource() instanceof JButton) {
			System.out.println(e.getSource() instanceof JButton);
			JButton btn = (JButton)e.getSource();
			System.out.println(btn.getText());
			switch(btn.getText()) {
			case "MENU1" : changePanel = new Menu1(mainFrame);
				break; 
			/*case "MENU2" : changePanel = new Menu2();
				break;
			case "MENU3" : changePanel = new Menu3();
				break;
			case "MENU4" : changePanel = new Menu4();
				break;
			case "MENU5" : changePanel = new Menu5();
				break;*/
			}
			mainFrame.getContentPane().removeAll();
			mainFrame.getContentPane().add(changePanel);
			mainFrame.repaint();
			mainFrame.setVisible(true);
		}
		
	}

}
