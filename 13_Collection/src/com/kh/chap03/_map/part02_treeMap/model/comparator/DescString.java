package com.kh.chap03._map.part02_treeMap.model.comparator;

import java.util.Comparator;

public class DescString implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}
