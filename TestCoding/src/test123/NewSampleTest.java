package test123;

import java.util.HashMap;
import java.util.PriorityQueue;

public class NewSampleTest {

	String str = "";

	NewSampleTest(String str) {
		this.str = str;
	}

	@Override
	public boolean equals(Object o) {
		return false;
	}

	@Override
	public int hashCode() {
		return 1;
	}

	public static void main(String[] args) {

		NewSampleTest a1 = new NewSampleTest("AB");
		NewSampleTest a2 = new NewSampleTest("AB");
		NewSampleTest a3 = new NewSampleTest("PQ");
		NewSampleTest a4 = a1;
		NewSampleTest a7 = new NewSampleTest("sdf");

		HashMap<NewSampleTest, Integer> mp = new HashMap<NewSampleTest, Integer>();

		mp.put(a1, 1); // same exception
		mp.put(a1, 2); // exception will be thrown for key not present as we override the equals method
						// and return false every time -> thus as per HashMap bucket logic -> every time
						// key comparison is made at bucket 1 linked list created we will get false
		mp.put(a2, 2);
		mp.put(a3, 2);
		mp.put(a4, 3);
		mp.put(new NewSampleTest("sdf"), 7);

		int size = mp.size();
		System.out.println("Size of the map: " + size); // 3
		System.out.println(mp.get(a1)); //
		System.out.println(mp.get(a2)); //
		System.out.println(mp.get(a3)); //
		System.out.println(mp.get(a4));
		System.out.println(mp.get(a7));//

		System.out.println("TESTINGGGGG");

		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Java");
		StringBuilder sb1 = new StringBuilder();
		sb1.append("Ja").append("va");
		System.out.println(s1 == s2); // true
		System.out.println(s2 == s3); // false
		s3 = "Java";
		System.out.println(s1 == s3); // true
		System.out.println(s1.equals(s2)); // true
		System.out.println(sb1.toString() == s1); // false
		System.out.println(sb1.toString().equals(s1)); // true

		System.out.println("TESTINGGGGG");
		System.out.println("");
		System.out.println("");

		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("carrot");
		pq.add("apple");
		pq.add("banana");
		System.out.println(pq.poll() + ":" + pq.peek()); // apple:banana

	}
}
