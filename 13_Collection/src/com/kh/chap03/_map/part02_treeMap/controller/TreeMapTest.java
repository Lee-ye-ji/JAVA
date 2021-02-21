package com.kh.chap03._map.part02_treeMap.controller;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.chap03._map.part01_hashMap.model.vo.Car;
import com.kh.chap03._map.part02_treeMap.model.comparator.DescString;

public class TreeMapTest {
	public void doTreeMap() {
		TreeMap<String, Car> tm = new TreeMap<>();
		
		// 1. put(K key, V value) : 값 추가
		tm.put("소나타", new Car("현대", 13.3));
		tm.put("K5", new Car("기아", 16.1));
		tm.put("말리부", new Car("쉬보레", 15.3));
		System.out.println(tm);
		// -> Key값인 String의 오버라이딩 된 compareTo를 기준으로 문자열 오름차순 정렬
		
		// 다른 key값에 같은 value 입력
		tm.put("아반떼", new Car("현대", 13.3));
		System.out.println(tm);
		
		// 같은 Key값에 다른 value 입력
		tm.put("말리부", new Car("쉐보레", 16.3));
		System.out.println(tm);
		
		// 2. 내림차순 구현 방법
		// (1) 사용자 정의 vo가 정렬기준인 경우 Comparable을 상속 받는 메소드 내용 변경
		// (2) 매개변수 생성자를 통해 재정렬(String, Wrapper 클래스 등)
		TreeMap<String, Car> descTm = new TreeMap<>(new DescString());
		descTm.put("소나타", new Car("현대", 13.3));
		descTm.put("K5", new Car("기아", 16.1));
		descTm.put("말리부", new Car("쉬보레", 15.3));	
		System.out.println(descTm);
		
		// 3. keySet(), entrySet() 이용하여 하나씩 출력하는 연습 -> tm, descTm
		// keySet() + Iterator
		System.out.println("===== keySet() + Iterator =====");
		Set<String> keySet = tm.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("키 : %s, 값 : %s\n", key, tm.get(key));
		}
		// keySet() + for each
		System.out.println("=====  keySet() + for each =====");
		for(String key : tm.keySet()) {
			System.out.printf("키 : %s, 값 : %s\n", key, tm.get(key));
		}
		// entrySet() + Iterator
		System.out.println("===== entrySet() + Iterator =====");
		Set<Entry<String, Car>> entrySet = tm.entrySet();
		Iterator<Entry<String, Car>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Car> entry = it2.next();
			System.out.printf("키 : %s, 값 : %s\n", entry.getKey(), entry.getValue());
		}
		System.out.println("===== entrySet() + for each =====");
		// entrySet() + for each
		for(Entry<String, Car> entry : tm.entrySet()) {
			System.out.printf("키 : %s, 값 : %s\n", entry.getKey(), entry.getValue());
		}
		System.out.println();
	}

}
