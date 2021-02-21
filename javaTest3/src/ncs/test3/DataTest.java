package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataTest {

	public static void main(String[] args) {
		// Ư�� ���� ��¥ - 1987�� 5�� 27�� ������
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy�� M�� dd�� E����");
		Calendar c = new GregorianCalendar(1987, 5-1, 27);
		String formatDate1 = sdf1.format(c.getTime());
		System.out.println("���� : " + formatDate1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy�� MM�� dd��");

		Calendar cToday = Calendar.getInstance();
        String formatDate2 = sdf2.format(cToday.getTime());
        System.out.println("����: " + formatDate2);

        String age1 = formatDate1.substring(0,4);
        String age2 = formatDate2.substring(0,4);
        
        int i = Integer.parseInt(age1);
        int j = Integer.parseInt(age2);

        System.out.println("����: " + (j-i) + "��");
	}

}
