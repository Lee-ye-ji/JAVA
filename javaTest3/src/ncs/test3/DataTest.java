package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataTest {

	public static void main(String[] args) {
		// 특정 형태 날짜 - 1987년 5월 27일 수요일
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 M월 dd일 E요일");
		Calendar c = new GregorianCalendar(1987, 5-1, 27);
		String formatDate1 = sdf1.format(c.getTime());
		System.out.println("생일 : " + formatDate1);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일");

		Calendar cToday = Calendar.getInstance();
        String formatDate2 = sdf2.format(cToday.getTime());
        System.out.println("현재: " + formatDate2);

        String age1 = formatDate1.substring(0,4);
        String age2 = formatDate2.substring(0,4);
        
        int i = Integer.parseInt(age1);
        int j = Integer.parseInt(age2);

        System.out.println("나이: " + (j-i) + "세");
	}

}
