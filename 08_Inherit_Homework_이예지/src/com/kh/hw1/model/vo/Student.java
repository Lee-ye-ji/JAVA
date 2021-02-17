package com.kh.hw1.model.vo;

public class Student extends Person{
	private int grade; 	// 학년
	private String major; // 전공

	public Student() {
		super();
	}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);
		this.grade = grade;
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", major=" + major + "]";
	}
	
	
	
	
	

}
