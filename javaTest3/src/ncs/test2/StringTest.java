package ncs.test2;

import org.omg.Messaging.SyncScopeHelper;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[]= new double[5];
		double sum = 0;
		int index = 0;
		
		// str���� �����͸� �и��Ѵ�.
		 String[] st = str.split(",");
		 for(String s : st){ 
		//for~each �� ����Ѵ�.
			 
		// �迭�� �Ǽ� �����͸� �ִ´�.
		data[index] = Double.parseDouble(s);
		//�迭 �������� ���� ���Ѵ�.
		sum += data[index];
		index++;
		}
		 // ��� ���� ��� �Ѵ�. 
	      System.out.printf("�հ� : %.3f\n",sum);
	      System.out.printf("��� : %.3f\n", sum/data.length);
		 
		 
	}

}
