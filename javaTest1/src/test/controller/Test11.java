package test.controller;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// 문제 11(가위바위보)
		Scanner sc = new Scanner(System.in);
		String rsp = " ";
		System.out.println("가위 바위 보 게임을 시작합니다.");
		while(true) {
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String user = sc.nextLine();
			int num = (int)(Math.random() * 3 + 1);
			
			switch(num) {
			case 1 :
				rsp = "가위";
				break;
			case 2:
				rsp = "바위";
				break;
			case 3:
				rsp = "보";
				break;
			}
			
			if( (user.equals("가위") && rsp.equals("바위")) || (user.equals("바위") && rsp.equals("보")) || (user.equals("보") && rsp.equals("가위")) ) {
				// ----- 컴퓨터에게 지는 경우 -----
				System.out.println("----- 컴퓨터에게 지는 경우 -----");
				System.out.println("당신은 " + user + "를 냈습니다.");
				System.out.println("컴퓨터는 " + rsp + "를 냈습니다.");
				System.out.println("당신이 졌습니다.");
				break;
			}else if( (user.equals("가위") && rsp.equals("보")) || (user.equals("바위") && rsp.equals("가위")) || (user.equals("보") && rsp.equals("바위")) ) {
				// ----- 컴퓨터에게 이기는 경우 -----
				System.out.println("----- 컴퓨터에게 이기는 경우 -----");
				System.out.println("당신은 " + user + "를 냈습니다.");
				System.out.println("컴퓨터는 " + rsp + "를 냈습니다.");
				System.out.println("당신이 이겼습니다.");
				break;
			}else if( user.equals(rsp) ){
				// ---- 컴퓨터와 비기는 경우 -----
				System.out.println("----- 컴퓨터와 비기는 경우 -----");
				System.out.println("당신은 " + user + "를 냈습니다.");
				System.out.println("컴퓨터는 " + rsp + "를 냈습니다.");
				System.out.println("비겼습니다. 다시 시작합니다.");
			}else {
				// ---- 가위 바위 보 말고 다른 단어를 입력했을 경우 -----
				System.out.println("잘못 입력하셨습니다. 다시 시작합니다.");
			}
		
		}

	}

}
