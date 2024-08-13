package may8;

import java.util.Arrays;
import java.util.Comparator;

class customComparator implements Comparator<String> {
	public int compare(String a, String b) {
		// TODO Auto-generated method stub
		String ab = a + b;
		String ba = b + a;
		return ab.compareTo(ba) > 0 ? -1 : 1;
	}

}

public class GenerateLongestNum {

	public static String getlargest(String[] str) {
		if (str.length == 0 || (str.length == 1 && str[0] == "0")) {
			return "0";
		}
		Arrays.sort(str, new customComparator());
		String res = "";
		for (String s : str) {
			res += s;
		}
		return res;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 2, 342, 6, 4, 121, 5 };
		String[] str = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			str[i] = String.valueOf(arr[i]);
		}
		String ans = getlargest(str);
		System.out.println(" answer is : " + ans);

	}

}
