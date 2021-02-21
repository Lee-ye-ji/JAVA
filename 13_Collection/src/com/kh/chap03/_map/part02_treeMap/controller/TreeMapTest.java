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
		
		// 1. put(K key, V value) : �� �߰�
		tm.put("�ҳ�Ÿ", new Car("����", 13.3));
		tm.put("K5", new Car("���", 16.1));
		tm.put("������", new Car("������", 15.3));
		System.out.println(tm);
		// -> Key���� String�� �������̵� �� compareTo�� �������� ���ڿ� �������� ����
		
		// �ٸ� key���� ���� value �Է�
		tm.put("�ƹݶ�", new Car("����", 13.3));
		System.out.println(tm);
		
		// ���� Key���� �ٸ� value �Է�
		tm.put("������", new Car("������", 16.3));
		System.out.println(tm);
		
		// 2. �������� ���� ���
		// (1) ����� ���� vo�� ���ı����� ��� Comparable�� ��� �޴� �޼ҵ� ���� ����
		// (2) �Ű����� �����ڸ� ���� ������(String, Wrapper Ŭ���� ��)
		TreeMap<String, Car> descTm = new TreeMap<>(new DescString());
		descTm.put("�ҳ�Ÿ", new Car("����", 13.3));
		descTm.put("K5", new Car("���", 16.1));
		descTm.put("������", new Car("������", 15.3));	
		System.out.println(descTm);
		
		// 3. keySet(), entrySet() �̿��Ͽ� �ϳ��� ����ϴ� ���� -> tm, descTm
		// keySet() + Iterator
		System.out.println("===== keySet() + Iterator =====");
		Set<String> keySet = tm.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("Ű : %s, �� : %s\n", key, tm.get(key));
		}
		// keySet() + for each
		System.out.println("=====  keySet() + for each =====");
		for(String key : tm.keySet()) {
			System.out.printf("Ű : %s, �� : %s\n", key, tm.get(key));
		}
		// entrySet() + Iterator
		System.out.println("===== entrySet() + Iterator =====");
		Set<Entry<String, Car>> entrySet = tm.entrySet();
		Iterator<Entry<String, Car>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Car> entry = it2.next();
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());
		}
		System.out.println("===== entrySet() + for each =====");
		// entrySet() + for each
		for(Entry<String, Car> entry : tm.entrySet()) {
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());
		}
		System.out.println();
	}

}
