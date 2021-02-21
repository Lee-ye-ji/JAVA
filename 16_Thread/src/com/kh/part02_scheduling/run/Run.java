package com.kh.part02_scheduling.run;

import com.kh.part02_scheduling.model.vo.Car;
import com.kh.part02_scheduling.model.vo.Plane;
import com.kh.part02_scheduling.model.vo.Tank;

public class Run {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Car());
		Thread t2 = new Thread(new Plane());
		Thread t3 = new Thread(new Tank());
		
		// 스레드는 기본적으로 1 ~ 10 의 우선순위 총 5의 우선순위를 가지고 있음
		// -> 우선 순위는 스레드를 생성한 스레드로부터 상속받음(메인 스레드의 우선 순위가 5이므로)
		System.out.println("Car 우선 순위 : " + t1.getPriority());
		System.out.println("Plane 우선 순위 : " + t2.getPriority());
		System.out.println("Tank 우선 순위 : " + t3.getPriority());
		
		// 실행 순서가 매번 다른 이유는 각각의 스레드가 모두 같은 우선 순위를 가지고 있기 때문
		// 운영체제가 직접 임의의 스레드를 한번씩 호출해서 출력
		
		// 따라서 일의 우선 순서를 정할 필요가 있을 때는 우선 순위를 직접 할당해야함
		// 우선 순위가 높은 스레드일수록 더 많은 양의 실행 시간이 주어짐
		t1.setPriority(1);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t3.setPriority(10);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("Car 우선 순위 : " + t1.getPriority());
		System.out.println("Plane 우선 순위 : " + t2.getPriority());
		System.out.println("Tank 우선 순위 : " + t3.getPriority());
		
		/* 데몬 스레드 : 다른 스레드의 작업을 돕는 보조적인 역할을 하는 스레드
		 * 데몬 스레드 이외의 스레드들이 모두 종료되면 데몬 스레드는 강제적으로 종료 됨
		 * 데몬 스레드가 될 스레드의 레퍼런스 변수에 setDemon(true)를 호출하여 생성
		 * start() 이전에 setDamon(true)을 호출해야 함
		 * -> 다른 작업이 종료되면 수행 할 필요가 없는 보조 작업을 데몬 스레드로 수행
		 * -> ex 가비지 컬렉터, 자동 저장, 화면 자동 갱신 등
		 * */
		
		// 시작 전에 Damon스레드
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		// 우선 순위가 잘 적용되지 않음 -> cpu 멀티 코어 환경
		
		// 다른 스레드들이 다 돌기 전에 메인 스레드가 종료
		// 지정한 스레드가 종료될 때까지 현재 메인 스레드의 종료를 대기시키려면?
		/*try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println("=============== main end ==================");

	}

}
