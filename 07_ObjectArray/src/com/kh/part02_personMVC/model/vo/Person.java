package com.kh.part02_personMVC.model.vo;

public class Person {
	private String name;
	private int age;
	private int wealth;
	
	public Person() {}
	
	// 우클릭 Source > (Alt + Shift + s)
	// 생성자 : Generate C'o'nstructor using Fields클릭(Alt + shift + s + o )
	public Person(String name, int age, int wealth) {
		super();  // 상속 이후 배움
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWealth() {
		return wealth;
	}

	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	public String information() {
		return "name = " + name + ", age = "+ age + ", wealth = " + wealth;
	}
	
	
	
	

}
