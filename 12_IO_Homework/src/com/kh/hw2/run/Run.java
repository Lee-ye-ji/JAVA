package com.kh.hw2.run;

import com.kh.hw2.model.dao.ScoreProcess;

public class Run {

	public static void main(String[] args) {
		// ScoreProcess Ŭ���� ��ü ���� �� 
		ScoreProcess sp = new ScoreProcess();
		// �� �޼ҵ带 ���������� ����
		sp.scoreSave();
		sp.scoreRead();


	}

}
