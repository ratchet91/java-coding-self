package may8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 1. infinte list -> find the number x -> return true/false
 * 2. Linked list of size n -> twins(node 1 & node(n-i-1) are twins => Max(twinSum)
 * 
 * 1->2->3->4->5->6
 * 5->13->4->3->1
 * 
 * 
 * 3-> 2-> 1-> 4->13->5
 * 
 * 
 * 
 * 
 */

public class TestHaevoData {

	public static void main(String[] args) {
		String str = "I am living in Bangalore. I am in Delhi";
		Map<String, Integer> map = new HashMap<>();
		int n = str.length();
		int max = Integer.MIN_VALUE;
		String res = "";
		String[] s = str.split(" ");
		int size = s.length;
		for (int i = 0; i < size - 1; i++) {
			map.put(s[i] + s[i + 1], map.getOrDefault(s[i] + s[i + 1], 0) + 1);
			if (max < map.get(s[i] + s[i + 1])) {
				max = map.get(s[i] + s[i + 1]);
				res = s[i] + s[i + 1];
			}
		}
		System.out.println(" The result is : " + res + " with count as :" + max);
		List<Integer> ans = new ArrayList<>();
		ans.add(1);
		ans.add(234);
		System.out.println(ans.contains(123));
		System.out.println(ans.contains(234));

	}

}
