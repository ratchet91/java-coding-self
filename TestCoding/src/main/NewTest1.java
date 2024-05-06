package main;

import java.util.ArrayList;
import java.util.List;

public class NewTest1 {
	public static String encodeStr = "@";

	// 10000
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Anuj");
		list.add("Anuj4");
		list.add("Rakhi");
		// 4@Anuj16@4@Anuj5@Rakhi

		NewTest1 m = new NewTest1();
		System.out.println(m.encode(list));
		System.out.println("res2 : " + m.decode(m.encode(list)));
	}

	public String encode(List<String> list) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			int size = list.get(i).length();
			sb.append(size);
			sb.append(encodeStr);
			sb.append(list.get(i));
		}

		return sb.toString();
	}

	public List<String> decode(String s) {
		// char[] ch = new char[s.length()];
		int j = 0;

		List<String> res = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			int size = 0;
			while (s.charAt(i) != '@') {
				size = size * 10 + (Integer.parseInt("" + s.charAt(i)));
				i++;
			}
			String str = s.substring(i + 1, i + size + 1);
			res.add(str);
			i = i + size;
		}
		return res;
	}
}
