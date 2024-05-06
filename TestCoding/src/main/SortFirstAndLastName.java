package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Name {
	String firstName;
	String lastName;

	Name(String a, String b) {
		firstName = a;
		lastName = b;

	}

	public String getFirstName() {
		return firstName;
	}

}

public class SortFirstAndLastName {
	public static void sortNames(List<Name> names) {
		Collections.sort(names, new Comparator<Name>() {
			public int compare(Name n1, Name n2) {
				if (n1.firstName.length() != n2.firstName.length()) {
					return n1.firstName.length() - n2.firstName.length();
				} else if (n1.lastName.length() != n2.lastName.length()) {
					return n1.lastName.length() - n2.lastName.length();
				} else if (n1.firstName.compareTo(n2.firstName) != 0) {
					return n1.firstName.compareTo(n2.firstName);
				} else {
					return n1.lastName.compareTo(n2.lastName);
				}
			}
		});
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i).firstName + " " + names.get(i).lastName);
		}
		System.out.println("HI");

	}

	public static void main(String[] args) {

		Name name1 = new Name("Jayant", "Verma");
		Name name2 = new Name("Ajay", "Gupta");
		Name name3 = new Name("Mohan", "Sharma");
		Name name4 = new Name("Rahul", "Dev");
		Name name5 = new Name("Ajay", "Gupta1");
		Name name6 = new Name("Ajay", "Gupta2");
		Name name7 = new Name("Ajay", "Gupta3");
		Name name9 = new Name("z", "Verma");
		Name name8 = new Name("z", "V");

		List<Name> names = new ArrayList<>();
		names.add(name7);
		names.add(name1);
		names.add(name2);
		names.add(name3);
		names.add(name4);
		names.add(name5);
		names.add(name6);
		names.add(name9);
		names.add(name8);

		sortNames(names);
		// TODO Auto-generated method stub

	}

}
