package ncs.test6;

public class Calculator  {
	
	public double getSum(int data) throws InvalidException{
		double result = 0.0;
		if(2 <= data && data <= 5) {
			for(int i = 1; i <= data; i++) {
				result += i;
			}
		}else{
			throw new InvalidException("�Է� ���� ������ �ֽ��ϴ�.");
		}
		return result;
		
	}

}
