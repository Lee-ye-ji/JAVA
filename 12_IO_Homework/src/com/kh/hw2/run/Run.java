package com.kh.hw2.run;

import com.kh.hw2.model.dao.ScoreProcess;

public class Run {

	public static void main(String[] args) {
		// ScoreProcess 클래스 객체 생성 후 
		ScoreProcess sp = new ScoreProcess();
		// 각 메소드를 순차적으로 실행
		sp.scoreSave();
		sp.scoreRead();


	}

}
