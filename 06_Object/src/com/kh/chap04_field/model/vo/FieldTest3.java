package com.kh.chap04_field.model.vo;

// Ŭ���� ���� (static ����)�� ���ؼ� �˾ƺ���
public class FieldTest3 {
	
	// ���� ������ ������ Ŭ���� ������ static ���� ���� ������ ����
	// static Ű���尡 ������ ���α׷� ���� ���ڸ��� static �޸� ������ �Ҵ� ��
	
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// static ������ FieldTest3��� Ŭ����(��)�� �� ��� ��ü���� "����"�ϴ� ����
	// ��ü ���� �� �ʿ� ���� ���α׷� �������ڸ��� static �޸� ������ �Ҵ��
	
	public FieldTest3() {}
		
		// private�� ���� getter/setter �޼ҵ�
		
		/*public void setPriSta(String priSta) {
			this.priSta = priSta;
		}*/
		// static�� ��ü ������ ���� �ʾƵ� ���α׷� ����� ���ÿ� static ������ �Ҵ��
		// ��, this�� ������ ����
		public static void setPriSta(String priSta) {
			FieldTest3.priSta = priSta;
		}
		
		public static String getPriSta() {
			return priSta;
		}

}
