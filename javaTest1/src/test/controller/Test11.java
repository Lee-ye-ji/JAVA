package test.controller;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// ���� 11(����������)
		Scanner sc = new Scanner(System.in);
		String rsp = " ";
		System.out.println("���� ���� �� ������ �����մϴ�.");
		while(true) {
			System.out.print("���� ���� �� �� �� ���� �Է��ϼ��� : ");
			String user = sc.nextLine();
			int num = (int)(Math.random() * 3 + 1);
			
			switch(num) {
			case 1 :
				rsp = "����";
				break;
			case 2:
				rsp = "����";
				break;
			case 3:
				rsp = "��";
				break;
			}
			
			if( (user.equals("����") && rsp.equals("����")) || (user.equals("����") && rsp.equals("��")) || (user.equals("��") && rsp.equals("����")) ) {
				// ----- ��ǻ�Ϳ��� ���� ��� -----
				System.out.println("----- ��ǻ�Ϳ��� ���� ��� -----");
				System.out.println("����� " + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� " + rsp + "�� �½��ϴ�.");
				System.out.println("����� �����ϴ�.");
				break;
			}else if( (user.equals("����") && rsp.equals("��")) || (user.equals("����") && rsp.equals("����")) || (user.equals("��") && rsp.equals("����")) ) {
				// ----- ��ǻ�Ϳ��� �̱�� ��� -----
				System.out.println("----- ��ǻ�Ϳ��� �̱�� ��� -----");
				System.out.println("����� " + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� " + rsp + "�� �½��ϴ�.");
				System.out.println("����� �̰���ϴ�.");
				break;
			}else if( user.equals(rsp) ){
				// ---- ��ǻ�Ϳ� ���� ��� -----
				System.out.println("----- ��ǻ�Ϳ� ���� ��� -----");
				System.out.println("����� " + user + "�� �½��ϴ�.");
				System.out.println("��ǻ�ʹ� " + rsp + "�� �½��ϴ�.");
				System.out.println("�����ϴ�. �ٽ� �����մϴ�.");
			}else {
				// ---- ���� ���� �� ���� �ٸ� �ܾ �Է����� ��� -----
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �����մϴ�.");
			}
		
		}

	}

}
