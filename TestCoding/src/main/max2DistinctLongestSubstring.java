package main;

import java.util.HashMap;
import java.util.Map;

public class max2DistinctLongestSubstring {

	public static int getMaxLength(String s) {
		int i = 0, j = 0, ans = 0;
		int n = s.length();
		Map<Character, Integer> map = new HashMap();

		while (j < n) {
			int val = map.getOrDefault(s.charAt(j), 0) + 1;
			map.put(s.charAt(j), val);
			j++;
			if (map.size() > 2) {
				while (true) {
					val = map.getOrDefault(s.charAt(i), 0) - 1;
					map.put(s.charAt(i), val);

					if (val == 0) {
						map.remove(s.charAt(i));
						i++;
						break;
					}
					i++;
				}

			}
			ans = Math.max(ans, j - i);

		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "raaatraaaarchit";
		int x = getMaxLength(str);
		System.out.println("the result is : " + x);

	}

}
