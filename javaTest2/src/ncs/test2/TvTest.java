package ncs.test2;

public class TvTest {

	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		// Tv 객체를 3개 생성하여 배열에 넣는다.
		tvArray[0] = new Tv("INFINIA", 1500000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1000000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2000000, "3D TV");

		// 배열에 있는 객체 정보를 모두 출력 한다. – for 문 이용
		for(int i = 0; i < tvArray.length; i++) {
			System.out.println(tvArray[i].toString());
		}
		int max = tvArray[0].getPrice();
		int min = tvArray[0].getPrice();
		String maxName = "";
		String minName = "";
		
		// 큰 값, 작은 값
		for(int i = 0; i < tvArray.length; i++) {
			// 큰 값
			if(max < tvArray[i].getPrice()) {
				max = tvArray[i].getPrice();
				maxName = tvArray[i].getName();
				
			}
			
			// 작은 값
			if(min > tvArray[i].getPrice()) {
				min = tvArray[i].getPrice();
				minName = tvArray[i].getName();
			}
		}
		
		// 실행 결과와 같이 출력
		System.out.println("가격이 가장 비싼 제품 : " + maxName);
		System.out.println("가격이 가장 저렴한 제품 : " + minName);
	}

}
