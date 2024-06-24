package main;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordBreak {

	public static boolean getWordBreak(List<String> dict, String word) {
		Queue<Integer> q = new ArrayDeque<>();
		q.add(0);
		Set<String> words = new HashSet<>(dict);

		boolean[] used = new boolean[word.length()];
		while (!q.isEmpty()) {
			int start = q.poll();

			if (start == word.length()) {
				return true;
			}

			if (used[start] == true) {
				continue;
			}

			for (int end = start + 1; end <= word.length(); end++) {
				if (words.contains(word.substring(start, end)))
					;
				{
					q.add(end);
				}
			}
			used[start] = true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> dict = new ArrayList<>();
		dict.add("Books");
		dict.add("And");
		dict.add("Cats");

		String word = "AndCats";
		boolean ans = getWordBreak(dict, word);

		System.out.println(" The req answer is : " + ans);

	}

}
