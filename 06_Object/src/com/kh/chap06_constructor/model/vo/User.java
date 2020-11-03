package com.kh.chap06_constructor.model.vo;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	/* ������ ��� ����
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. �Ű������� ���� ���� ���� �ʵ忡 �ʱ�ȭ �� ����
	 * 
	 * ������ ��� �� ���ǻ���
	 * 1. �ݵ�� Ŭ������� ���� �ؾ� ��(��ҹ��ڱ���)
	 * 2. ��ȯ���� �������� ����
	 * 3. �Ű����� ������ �ۼ� �� �⺻ �����ڴ� �ݵ�� �ۼ��ؾ� ��
	 * */
	
	public User() {
		// �⺻ ������(�Ű����� ����)
		// ���� ��ü�� ������ �� �� ���
		// �⺻ �����ڸ� �����ϴ� ��� -> JVM�� �ڵ����� �������� ������ ��ü ���� ����
	}
	
	// �Ű����� ������
	public User(String userId, String userPwd, String userName) {
		// ��ü ������ ���ÿ� �Ű������� ���� �� ������ �ش� ����� �ʱ�ȭ�ϴ� ���
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	// �Ű����� ������2
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;*/
		this(userId, userPwd, userName);
		// ���� ���� �ߺ��Ǵ� ������ �ʱ�ȭ ������ �����ڰ� �����ϴ� ��� this() ������ ��� ����
		// ���� Ŭ���� ������ �����ڿ��� �ٸ� ������ ȣ�� ����
		//  *** ��, �̶� �ݵ�� ù �ٿ� �ۼ��ؾ��� ***
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	// ����� ���� �޼ҵ�
	public String information() {
		return "[userId =" + userId + ", userPwd = " + userPwd + ",userName=" + userName + 
				", age = " + age + ",gender = " + gender + "]"; 
	}

	// getter - setter : ���߿� �߰��ϱ�
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
