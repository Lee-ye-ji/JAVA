package com.kh.chap06_constructor.model.vo;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/* 생성자 사용 목적
	 * 1. 객체를 생성해주기 위한 목적
	 * 2. 매개변수로 전달 받은 값을 필드에 초기화 할 목적
	 * 
	 * 생성자 사용 시 주의사항
	 * 1. 반드시 클래스명과 동일 해야 함(대소문자구분)
	 * 2. 반환점이 존재하지 않음
	 * 3. 매개변수 생성자 작성 시 기본 생성자는 반드시 작성해야 함
	 * */
	
	public User() {
		// 기본 생성자(매개변수 없음)
		// 단지 객체를 생성만 할 때 사용
		// 기본 생성자를 생략하는 경우 -> JVM이 자동으로 만들어줬기 때문에 객체 생성 가능
	}
	
	// 매개변수 생성자
	public User(String userId, String userPwd, String userName) {
		// 객체 생성과 동시에 매개변수로 전달 된 값들을 해당 멤버에 초기화하는 노력
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// 매개변수 생성자2
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;*/
		this(userId, userPwd, userName);
		// 위와 같이 중복되는 동일한 초기화 내용의 생성자가 존재하는 경우 this() 생성자 사용 가능
		// 같은 클래스 내에선 생성자에서 다른 생성자 호출 가능
		//  *** 단, 이때 반드시 첫 줄에 작성해야함 ***
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	// 출력을 위한 메소드
	public String information() {
		return "[userId =" + userId + ", userPwd = " + userPwd + ",userName=" + userName + 
				", age = " + age + ",gender = " + gender + "]"; 
	}

	// getter - setter : 나중에 추가하기
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
