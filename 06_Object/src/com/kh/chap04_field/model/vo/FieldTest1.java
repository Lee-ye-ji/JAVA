package com.kh.chap04_field.model.vo;

// �ʵ���� ���� �����ڸ� �׽�Ʈ �غ��� ���� Ŭ����
public class FieldTest1 {
	// Ŭ�������� ��� ������ ���� �����ڴ� public, default ��
	// �ʵ忡�� ��� ������ ���� �����ڴ� 4����
	
	// public -> ��𼭵�(���� ��Ű��, �ٸ� ��Ű�� ���) ���� ����
	// protected -> ���� ��Ű�� ���� ���� + ���� �ٸ���Ű�� ��� ��� ���������� ���� ����
	// default -> ���� ��Ű�� ���� ����
	// private -> ���� �ڱ� �ڽ� Ŭ���������� ���� ����
	
	// 1. �ʵ�
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String def = "default"; // default�� �����ϴ� ��
	private String pri = "private";

	// 2. ������
	public FieldTest1() {}
	
	// 3. �޼ҵ� (getter/ setter)
	// public -> ���� ������ �����ϹǷ� getter/ setter ���ǹ�
	
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
