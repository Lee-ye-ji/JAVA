package ncs.test3;

public class TestSort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int temp;
		
		System.out.print("before : ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 50) + 51;
			System.out.print(arr[i] + " ");
		}
		
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.print("after : ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		

	}

}
