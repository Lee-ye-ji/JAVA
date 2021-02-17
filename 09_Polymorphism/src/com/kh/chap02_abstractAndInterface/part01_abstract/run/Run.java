package com.kh.chap02_abstractAndInterface.part01_abstract.run;

import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_abstract.model.vo.Sports;

public class Run {

	public static void main(String[] args) {
		//Sports s = new Sports();
		// -> �߻� Ŭ�����δ� ��ü ���� �Ұ�(�̿ϼ� Ŭ�����̹Ƿ�)
		Sports s;
		// -> ��ü ������ �ȵ� ������ ���۷����δ� ��� ����
		s = new Football();
		// -> �������� �����Ͽ� �ڽ� ��ü�� �����ؼ� �޾� �� �� ����
		
		// Sports ��ü �迭 �����
		Sports[] arr = new Sports[2];
		arr[0] = new Basketball();
		arr[1] = new Football();
		
		// rule ȣ��
		for(int i = 0; i < arr.length; i++) {
			arr[i].rule();
			// ���� ���ε��� ���ؼ� �Ʊ� ������ �������̵� �� ������ �޼ҵ带 ã�Ƽ� ����
		}
		
		// for-each
		for(Sports sp : arr) {
			sp.rule();
		}
		
		/* �߻� Ŭ������ �� ����ϳ���?
		 * 
		 * �� �ڽ� Ŭ�������� ���� �����Ǿ���ϴ� ������ �ٸ����� ������ ����(�޼ҵ� ��, �Ű�����, ������)���� �����Ǿ����� �� �� 
		 * �ڽ�Ŭ���������� ��� �޾� ������ �������̵��Ͽ� ������ ������ ���� �� ����
		 * => ��Ӻ��� �������� �Ծ��� ���� 
		 */

	}

}
