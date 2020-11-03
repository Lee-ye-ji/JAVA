package com.kh.chap04_field.model.vo;

// 필드들의 접근 제한자를 테스트 해보기 위한 클래스
public class FieldTest1 {
	// 클래스에서 사용 가능한 접근 제한자는 public, default 뿐
	// 필드에서 사용 가능한 접근 제한자는 4가지
	
	// public -> 어디서든(같은 패키지, 다른 패키지 모두) 접근 가능
	// protected -> 같은 패키지 접근 가능 + 만약 다른패키지 라면 상속 구조에서는 접근 가능
	// default -> 같은 패키지 접근 가능
	// private -> 오직 자기 자신 클래스에서만 접근 가능
	
	// 1. 필드
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String def = "default"; // default는 생략하는 것
	private String pri = "private";

	// 2. 생성자
	public FieldTest1() {}
	
	// 3. 메소드 (getter/ setter)
	// public -> 직접 접근이 가능하므로 getter/ setter 무의미
	
	public String getPro() {
		return pro;
	}
	
	public void setPro(String pro) {
		this.pro = pro;
	}
	
	public String getDef() {
		return def;
	}
	
	public void setDef(String def) {
		this.def = def;
	}
	
	public String getPri() {
		return pri;
	}
	
	public void setPri(String pri) {
		this.pri = pri;
	}
}
