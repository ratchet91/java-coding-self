package may7;

class Solution {
	public String minWindow(String s, String t) {
		int start = 0, end = 0, count = t.length(), minLen = Integer.MAX_VALUE;
		int minStart = 0;
		int[] map = new int[128];
		for (char c : t.toCharArray()) {
			map[c]++;
		}
		while (end < s.length()) {
			final char c1 = s.charAt(end);
			if (map[c1] > 0)
				count--;
			map[c1]--;
			end++;
			while (count == 0) {
				if (minLen > end - start) {
					minLen = end - start;
					minStart = start;
				}

				char c2 = s.charAt(start);
				map[c2]++;
				if (map[c2] > 0)
					count++;
				start++;
			}
		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);

	}
}
