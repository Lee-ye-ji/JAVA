package com.kh.chap03._map.part01_hashMap.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03._map.part01_hashMap.model.vo.Car;

public class HashMapTest {

	/* Map �迭�� Ư¡ : Ű(key) �� ��(value)���� �����Ǿ� ������ Ű�� ���� ��� ��ü
	 * 				Ű�� �ߺ� ���� X -> Set ���
	 * 				���� �ߺ� ���� O -> List ���
	 * 				Ű�� �ߺ��� ���� �ٽ� ����Ǹ� ���� Ű�� ���� ���� ����
	 * 	Map �迭�� ���� : HashMap, HashTable, LinkedHashMap, Properties, TreeMap
	 * HashMap : key ��ü�� hashCode(), equals() ������ �ؾ� �� -> set���� ó�� ���� ��ü �ߺ� ���� X
	 * 			�ַ� String Ŭ������ Ű Ÿ������ ���(�̹� hashCode(), equals() �������̵� �Ǿ� ����)
	 * HashTable : HashMap�� ������, ����ȭ ����
	 * LinkedHashMap : HashMap�� ��� �޾� ������ Ŭ������ ���� ������ ���� �ȴٴ� �������� ����
	 */

	public void doHashMap() {
		HashMap<String, Car> hm = new HashMap<>();
		
		// List, Set �� �߰� => add() : Collection �������̽� ����
		
		// 1. put(K key, V value) : ������ Ű�� �� ��ü�� �ʿ� ����
		hm.put("�ҳ�Ÿ", new Car("����", 13.3));
		hm.put("K5", new Car("���", 16.1));
		hm.put("������", new Car("������", 15.3));
		System.out.println(hm);   // ���� ���� ���� X
		
		// �ٸ� key�� ���� value
		hm.put("�ƹݶ�", new Car("����", 13.3));
		System.out.println(hm); 	// �ٸ� key�� ������ ���� value ���� ����
		
		// ���� key�� �ٸ� value
		hm.put("������", new Car("������", 16.3));
		System.out.println(hm);   // ���� Key�� ������ ���Ӱ� �Է��� value�� ����
		
		// 2. get(K key): ������ Ű�� �� ��ü�� ��������
		Car c = /*(Car)*/hm.get("K5");
		System.out.println(c);
		
		// 3. containsKey(object key) : key�� ������ true ��ȯ
		// containsValue(object value) : value�� ������ true��ȯ
		System.out.println(hm.containsKey("������"));
		System.out.println(hm.containsValue(new Car("������", 16.3)));
		// -> containsKey�� String Ŭ������ ����ϹǷ� equals()�� �������̵��Ǿ� ���� �ʵ� �� �񱳸� ��
		// -> containsValue�� �츮�� ���� CarŬ������ ����ϹǷ� equals()�� �������̵� �Ǿ� ���� �ʾ�
		// Object Ŭ������ equals()�� ȣ���Ͽ� �ּҰ� �񱳸� �� --> Car Ŭ������ �������̵��ϰ� ����
		
		// 4. remove(K key) : �ش� Ű ���� �ν��Ͻ� ����
		hm.remove("�ƹݶ�");
		System.out.println(hm);
		// size(), clear(), isEmpty() �� ������ �����̹Ƿ� ����
		
		// ---------------------------------------------------
		// Map ������Ʈ�� �����ϱ�
		// 1. values() : ��� value�� Collection�� ��� ��ȯ
		System.out.println(hm.values());
		System.out.println();
		
		// Map�� key-value�� ���� �����ϰ� �ֱ� ������ iterator() ���� ȣ�� �Ұ�
		// keySet(), entrySet()�� ���� �޼ҵ带 ���� Set ���·� Ű�� ���� ���� ��
		// iterator() ȣ��
		
		// 2. keySet() :��� key�� Set�� ��� ��ȯ
		// (1) keySet() + Iterator
		System.out.println("---- keySet() :��� key�� Set�� S��� ��ȯ ----");
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("Ű : %s, ��:  %s\n", key, hm.get(key));
		}
		System.out.println("---- KeySet() : for each�� ----");
		// (2) KeySet() : for each��
		for(String key : hm.keySet()) {
			System.out.printf("Ű : %s, ��:  %s\n", key, hm.get(key));
		}
		System.out.println("-------- entrySet() --------");
		// 3. entrySet() : ��� entry ��ü(key + value)�� set�� ��� ��ȯ
		// (1) entrySet() + Iterator
		Set <Entry<String, Car>> entrySet = hm.entrySet();
		Iterator<Entry<String, Car>> it2 = entrySet.iterator();
		while(it2.hasNext()) {
			Entry<String, Car> entry = it2.next();
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());
		}
		
		// (2) entrySet() : for each��
		System.out.println("---- entrySet() : for each�� ----");
		for(Entry<String, Car> entry : hm.entrySet()) {
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());
		}
	}
	

}
