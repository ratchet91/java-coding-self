package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestDemo {
	public static void main(String[] args) {
		List<String> str = new ArrayList<String>();
		str.add("gfge");
		str.add("ewrtght");
		str.add("21345esrfdgh");
		str.add("gfe");
		str.add("geertty");
		str.add("g");

		for (String s : str) {
			System.out.println(" -> " + s);
		}
		// new String[] {"qer","1234sd","234edfg","wefertgtg"};
		Collections.sort(str, new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				// TODO Auto-generated method stub
				return arg0.length() - arg1.length();
			}

		});

		for (String s : str) {
			System.out.println(" -> " + s);
		}
	}
}
