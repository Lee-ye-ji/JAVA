package com.kh.chap03._map.part01_hashMap.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03._map.part01_hashMap.model.vo.Car;

public class HashMapTest {

	/* Map 계열의 특징 : 키(key) 와 값(value)으로 구성되어 있으며 키와 값은 모두 객체
	 * 				키는 중복 저장 X -> Set 방식
	 * 				값은 중복 저장 O -> List 방식
	 * 				키가 중복된 값이 다시 저장되면 기존 키에 값을 덮어 씌움
	 * 	Map 계열의 종류 : HashMap, HashTable, LinkedHashMap, Properties, TreeMap
	 * HashMap : key 객체는 hashCode(), equals() 재정의 해야 함 -> set에서 처럼 동등 객체 중복 저장 X
	 * 			주로 String 클래스를 키 타입으로 사용(이미 hashCode(), equals() 오버라이딩 되어 있음)
	 * HashTable : HashMap의 구버전, 동기화 지원
	 * LinkedHashMap : HashMap을 상속 받아 구현된 클래스로 저장 순서가 유지 된다는 차이점만 있음
	 */

	public void doHashMap() {
		HashMap<String, Car> hm = new HashMap<>();
		
		// List, Set 값 추가 => add() : Collection 인터페이스 구현
		
		// 1. put(K key, V value) : 지정한 키와 값 객체를 맵에 저장
		hm.put("소나타", new Car("현대", 13.3));
		hm.put("K5", new Car("기아", 16.1));
		hm.put("말리부", new Car("쉐보레", 15.3));
		System.out.println(hm);   // 넣은 순서 유지 X
		
		// 다른 key에 같은 value
		hm.put("아반떼", new Car("현대", 13.3));
		System.out.println(hm); 	// 다른 key를 가지면 같은 value 저장 가능
		
		// 같은 key에 다른 value
		hm.put("말리부", new Car("쉐보레", 16.3));
		System.out.println(hm);   // 같은 Key를 가지면 새롭게 입력한 value로 변경
		
		// 2. get(K key): 지정한 키의 값 객체로 가져오기
		Car c = /*(Car)*/hm.get("K5");
		System.out.println(c);
		
		// 3. containsKey(object key) : key가 있으면 true 반환
		// containsValue(object value) : value가 있으면 true반환
		System.out.println(hm.containsKey("말리부"));
		System.out.println(hm.containsValue(new Car("쉐보레", 16.3)));
		// -> containsKey는 String 클래스를 사용하므로 equals()가 오버라이딩되어 실제 필드 값 비교를 함
		// -> containsValue는 우리가 만든 Car클래스를 사용하므로 equals()가 오버라이딩 되어 있지 않아
		// Object 클래스의 equals()를 호출하여 주소값 비교를 함 --> Car 클래스에 오버라이딩하고 오기
		
		// 4. remove(K key) : 해당 키 값의 인스턴스 삭제
		hm.remove("아반떼");
		System.out.println(hm);
		// size(), clear(), isEmpty() 등 동일한 사용법이므로 생략
		
		// ---------------------------------------------------
		// Map 엘리먼트에 접근하기
		// 1. values() : 모든 value를 Collection에 담아 반환
		System.out.println(hm.values());
		System.out.println();
		
		// Map은 key-value를 페어로 저장하고 있기 때문에 iterator() 직접 호출 불가
		// keySet(), entrySet()과 같은 메소드를 통해 Set 형태로 키와 값을 얻어온 뒤
		// iterator() 호출
		
		// 2. keySet() :모든 key를 Set에 담아 반환
		// (1) keySet() + Iterator
		System.out.println("---- keySet() :모든 key를 Set에 S담아 반환 ----");
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("키 : %s, 값:  %s\n", key, hm.get(key));
		}
		System.out.println("---- KeySet() : for each문 ----");
		// (2) KeySet() : for each문
		for(String key : hm.keySet()) {
			System.out.printf("키 : %s, 값:  %s\n", key, hm.get(key));
		}
		System.out.println("-------- entrySet() --------");
		// 3. entrySet() : 모든 entry 객체(key + value)를 set에 담아 반환
		// (1) entrySet() + Iterator
		Set <Entry<String, Car>> entrySet = hm.entrySet();
		Iterator<Entry<String, Car>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Car> entry = it2.next();
			System.out.printf("키 : %s, 값 : %s\n", entry.getKey(), entry.getValue());
		}
		
		// (2) entrySet() : for each문
		System.out.println("---- entrySet() : for each문 ----");
		for(Entry<String, Car> entry : hm.entrySet()) {
			System.out.printf("키 : %s, 값 : %s\n", entry.getKey(), entry.getValue());
		}
	}
	

}
