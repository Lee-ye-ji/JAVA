package com.kh.chap01_list.part02_list.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02_list.model.vo.Music;

public class ListController {
	/* List 계열 특징 : 순서 유지, 중복 저장 가능  -> 인덱스가 있으니깐!
	 * List 계열 종류 : ArrayList(동기화 X), Vector(동기화 O), LinkedList
	 * LinkedList -> 객체 삽입, 삭제가 빈번한 경우는 ArrayList보다 효율이 좋음
	 * Vector는 ArrayList()의 구버전이며 리스트 계열의 사용 메소드는 동일하므로 ArrayList를 대표로 테스트 */
	public void doList() {
		// List는 인터페이스이므로 객체 생성 불가
		//List list = new List();
		
		// List의 후손 클래스인 ArrayList로 객체 생성(다형성 : 부모 레퍼런스로 자식 객체를 다룸)
		//List list = new ArrayList();
		
		/* 노란줄(경고성 메시지)가 뜨는 이유?
		 * 어떤 타입을 저장하는지 규정하지 않아서 안정성에 문제가 있다고 알려주는 메시지
		 * 제네릭스 <Music>으로 지정해주면 경고가 사라지고 String 값은 저장 불가능 하게 됨
		 * 제네릭스 설정 이유
		 * 1. 안정성(다른 타입이 들어갈 시 컴파일 에러 생성)
		 * 2. 반환형 다운 캐스팅 필요 없음
		 * */
		
		ArrayList<Music> list = new ArrayList<Music>(3);
		// 기본 생성자 -> 크기 지정 X -> 기본 10
		// 매개변수 생성자 -> 크기 지정 O
		
		System.out.println(list);
		
		// 1. add(E e) : 리스트의 끝에 인스턴스 데이터 추가
		list.add(new Music("제시", "눈누난나"));
		list.add(new Music("화사", "Maria"));
		list.add(new Music("오마이걸", "살짝 설렜어"));
		//list.add("끝");  // *** Music으로 제네릭스 설정하면 String타입은 add불가능하므로 에러 발생
		
		// 지정한 크기보다 더 많은 객체를 넣어도 오류 X
		// -> 1. 크기의 제한이 없음
		// Music 객체가 아닌 String 객체를 넣어도 상관 X
		// -> 2. 여러 타입의 객체를 저장할 수 있음
		System.out.println(list.toString());
		
		// 중간에 넣기
		// 2. add(int index, E e) : 인덱스 지정하며 해당 인덱스에 E추가
		list.add(1, new Music("Anne-Marie", "2000"));
		System.out.println(list);
		
		// 바꾸기
		// 3. set(int index, E e) : 지정한 인덱스 값을 E로 변경
		list.set(1, new Music("장범준", "흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야"));
		System.out.println(list);
		
		// collection은 length가 아닌 size로!!
		// 4. size() : 리스트 안에 몇 개의 데이터가 들어있는지 리턴
		System.out.println(list.size());
		
		// 삭제
		// 5. remove(int index) : 해당 인덱스의 인스턴스 삭제
		list.remove(0);
		System.out.println(list);
		System.out.println(list.size());
		// -> 추가, 삭제 시 자동 처리(별로의 알고리즘 작성할 필요 없음)되어 간단함
		
		// 6. get(int index) : 해당 인덱스의 인스턴스 조회
		// Music으로 다운캐스팅
		// 0번째 데이터 보여주기
		// 제네릭스 설정 전 : get메소드가 Object 타입으로 리턴되어 Music으로 다운 캐스팅
		//Music m = (Music) list.get(0); 
		//*** 제네릭스 설정 후 : get메소드의 리턴 타입이 Music으로 한정 되므로 캐스팅 불필요 ***
		Music m =  list.get(0);
		System.out.println(m);
		
		// 이 객체에 이 리스트가 있나요? 확인  참 거짓 리턴
		// 7. contains(Object o) : 해당 객체를 포함하고 있는지 거짓 리턴
		// contains는 필드 값 비교가 아닌 주소 값 비교!!
		System.out.println(list.contains(new Music("장범준", "흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야")));
		// 필드 값 비교가 아닌 주소 값 비교를 하므로 처음에는 false를 리턴함
		// 실제 필드 값을 비교하게 하려면 -> Music 클래스에 필드값을 비교하는 equals() 오버라이딩
		
		// 8. indexOf(Object o) : 해당 값을 가진 인덱스 리턴 -> 해당하는 값이 없으면 -1을 리턴
		// contains() 내부에서 호출되었던 메소드로 역시 equals() 오버라이딩이 되어야 잘 동작함
		// indexOf는 해당 값을 가지고 있지 않으면 -1
		System.out.println(list.indexOf((new Music("장범준", "흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야"))));
		
		// 9. subList(int index1, int index2) : index1부터 index2 이전까지 List로 추출하여 리턴
		// subString처럼 추출과 비슷
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		// 10. addAll(Collection c) : 리스트의 끝에 컬렉션 추가
		list.addAll(sub);
		System.out.println(list);
		
		// 11. isEmpty() : 리스트 안의 값이 비었는지 참 거짓 리턴
		System.out.println(list.isEmpty());
		
		// 12. clear() : 전체 삭제
		//list.clear();
		//System.out.println(list.isEmpty());
		
		// 반복문을 통헤 담긴 객체 하나씩 접근하여 출력
		for(int i  = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("====================================");
		
		// 향상 된 for문(for each문)
		for(Music music: list) {
			System.out.println(music);
		}
	}
	

}
