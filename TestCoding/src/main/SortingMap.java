package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortingMap {

	public static void sortMapByKey(Map<String, Integer> mapTest) {
		List<String> keyStr = new ArrayList(mapTest.keySet());

		Collections.sort(keyStr, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}

		});

//		for (String x : keyStr) {
//			System.out.println(" " + x + " -> " + mapTest.get(x));
//		}

		Set<String> set = new HashSet<>(mapTest.keySet());
		Iterator i = set.iterator();
		while (i.hasNext()) {
			Map.Entry me2 = (Map.Entry) i.next();
			System.out.print(me2.getKey() + ": ");
			// System.out.println(" " + i. + " -> " + mapTest.get(x));

		}
	}

	public static void sortMapByValue(Map<String, Integer> mapTest) {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> mapTest = new HashMap<>();
		mapTest.put("abs", 2);
		mapTest.put("qwe", 24);
		mapTest.put("as", 25);
		mapTest.put("aa", 21);
		mapTest.put("rachit", 20);
		mapTest.put("aaa", 26);
		mapTest.put("bac", 22);
		mapTest.put("baa", 23);

		sortMapByKey(mapTest);
		sortMapByValue(mapTest);

	}

}
