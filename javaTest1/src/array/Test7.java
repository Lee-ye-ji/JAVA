package array;

public class Test7 {

	public static void main(String[] args) {
		// ���� 7
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0.0;
		
		for(int i = 0; i < 10; i++) {
			if(array[i] % 2 == 0) {
				continue;
			}
			System.out.println(array[i]);
			sum += array[i];
		}
		System.out.println("�հ� : "+ sum);


	}

}
