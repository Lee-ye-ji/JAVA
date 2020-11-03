package com.kh.chap02.encapsulation.run;

import com.kh.chap02.encapsulation.model.vo.Student;

public class Run {
	/* ĸ��ȭ
	 * 
	 *  ���� : �߻�ȭ�� ���� ���� �� �Ӽ���� ����� �ϳ��� ���� �����ϴ� �������
	 *  	Ŭ������ ���� �߿��� ������ ������ ���� ������ ��Ģ���� �Ͽ� �ܺο��� ������ ���� ������ ����
	 *  	��ſ� �����͸� ó���ϴ� �޼ҵ���� Ŭ���� ���ο� �ۼ��Ͽ� �����Ϳ� ���������� �����ϴ� ����� ����
	 *  
	 *  1) ���� ����(private)
	 *  	�߻�ȭ�� ���� ���� �� �Ӽ���(��� ����)�� �ܺηκ����� ���� ������ ���� ���� private ���� ������ ���
	 *  	
	 *  2) setter/getter �޼ҵ�
	 *  	���������� �Ӽ��� �����Ͽ� ���� ����ϰ� ��ȸ�ؿ��� �޼ҵ�
	 *  
	 * */

	public static void main(String[] args) {
		Student st = new Student();
		/*st.name = "�캰��";
		st.kor = 100;
		st.math = 90;
		st.eng = 80; */
		// -> private ���� �����ڸ� ���� �Ӽ��� �����Ͽ� �ܺο��� ���� ������ �� ����
		// -> ���� ������ ���Ҵٸ� ���������� ������ �� �ְ� class ���ο� ����� �����ؾ� �� (settle/ getter �޼ҵ�)
		
		// ��ü�� �� ���� -> setter
		st.setName("�캰��");
		st.setKor(100);
		st.setMath(90);
		st.setEng(80);
		
		// ��ü�� �� �˾ƿ��� -> getter
		System.out.println("�̸� : " + st.getName());
		System.out.println("���� ���� : " + st.getKor());
		System.out.println("���� ���� : " + st.getMath());
		System.out.println("���� ���� : " + st.getEng());
		
		// �ѹ��� ��� �ʵ��� ������ ����ϴ� information �޼ҵ� ȣ��
		System.out.println(st.information());
	}

}
