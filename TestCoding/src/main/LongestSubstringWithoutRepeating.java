package main;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = "abc";
		Set<Character> set = new HashSet<>();
		int i = 0, j = 0, max = Integer.MIN_VALUE;
		for (; j < inp.length(); j++) {
			if (!set.contains(inp.charAt(j))) {
				set.add(inp.charAt(j));
				max = Math.max(max, j - i);
			} else {
				set.remove(inp.charAt(i));
				i++;
			}
		}
		System.out.println(" The req length is : " + (max + 1));

	}

}
