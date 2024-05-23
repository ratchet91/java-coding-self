package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonPrefix {

	public static String getLongestCommonPrefix(List<String> inp) {
		String str = inp.get(0);
		Iterator itr = inp.iterator();
		while (itr.hasNext()) {
			String curr = (String) itr.next();
			while (curr.indexOf(str) != 0) {
				str = str.substring(0, str.length() - 1);
			}
		}
		return str.length() != 0 ? str : "false";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> inp = new ArrayList<>();
		inp.add("rachit");
		inp.add("rachi");
		inp.add("pra");

		String ans = getLongestCommonPrefix(inp);
		System.out.println(" the req string is : " + ans);
	}

}
