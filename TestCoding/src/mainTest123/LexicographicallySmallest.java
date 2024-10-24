package mainTest123;

public class LexicographicallySmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcfdds";
		int[] arr = new int[26];
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'a']++;
		}
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			if (arr[i] > 0) {
				char c = (char) (i + 'a');
				s.append(c);
			}
		}
		System.out.println(" the srtr req is: " + s.toString());
	}

}
