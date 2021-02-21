package com.kh.chap03_component.view;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class I_Spinner {
	public void spinnerTest() {
		JFrame frame = new JFrame("스피너 테스트");
		frame.setSize(500, 100);
		
		Panel panel = new Panel();
		
		// 1. SppinnerListModel : 문자열
		String[] items = {"소설", "잡지", "전공서적", "취미"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner spinner1 = new JSpinner(listModel);
		
		panel.add(spinner1);
		
		// 2. SpinnerNumberModel : 숫자
		// 시작값, 최소값, 최대값, 증가값
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);
		JSpinner spinner2 = new JSpinner(numberModel);
		
		panel.add(spinner2);
		
		// 3. SpinnerDateModel : 날짜
		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();		// 현재 날짜
		
		calendar.add(calendar.YEAR, -50);      // 현재 값보다 50년 감소한 날짜를 시작 날짜로
		Date start = calendar.getTime();
		
		calendar.add(calendar.YEAR, 100);    	// 이미 50년 전 이므로 + 100으로 50년 후 날짜
		Date end = calendar.getTime();
		
		// 기준 날짜, 시작 날짜, 끝 날짜, 캘린더를 구성하는 상수 중 하나 전달
		// 상수 -> getPreviousValue, getNextValue() 등을 호출할 때 기준으로 사용
		SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
		JSpinner spinner3 = new JSpinner(dateModel);
		
		// 스피너 포맷 설정
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
		
		panel.add(spinner3);

		// 버튼 만들고 패널에 올리기
		JButton button = new JButton("전송");
		panel.add(button);
		
		// 결과 값을 표현 할 패널과 라벨 만들기
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel();
		resultPanel.add(text);
		
		// 버튼 클릭 시 이벤트
		button.addActionListener(new ActionListener() {
			String result = "";
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 스피너가 현재 가지고 있는 값을 아는 방법
				// spinner.getValue()
				result = spinner1.getValue() + ", " + spinner2.getValue() + ", " + spinner3.getValue();
				text.setText(result);
				
			}
			
		});
		
		frame.add(panel, "North");
		frame.add(resultPanel,"Center");
		frame.setSize(400, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
