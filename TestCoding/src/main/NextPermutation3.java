package main;

public class NextPermutation3 {

	public static void swap(int i, int k, char[] chArr) {
		char temp = chArr[k];
		chArr[k] = chArr[i];
		chArr[i] = temp;
	}

	public static void reverse(int i, char[] chArr) {
		int f = chArr.length - 1;
		while (f >= i) {
			char temp = chArr[f];
			chArr[f] = chArr[i];
			chArr[i] = temp;
			f--;
			i++;
		}
	}

	public static long getAns(char[] chArr) {
		long ans = 0;

		for (int i = 0; i < chArr.length; i++) {
			ans = ans * 10 + (chArr[i] - '0');
		}
		return ans;
	}

	public static int nextGreaterElement(int n) {
		String origNo = Integer.toString(n);
		char[] chArr = origNo.toCharArray();

		int index1 = -1, index2 = -1;

		int i = chArr.length - 2;

		while (i >= 0 && chArr[i] >= chArr[i + 1]) {
			i--;
		}
		if (i == -1)
			return -1;

		int k = chArr.length - 1;

		while (k >= 0 && chArr[k] <= chArr[i]) {
			k--;
		}

		swap(k, i, chArr);

		reverse(i + 1, chArr);

		long ans_ = getAns(chArr);

		return (ans_ > Integer.MAX_VALUE) ? -1 : (int) ans_;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;

		int ans = nextGreaterElement(number);
		System.out.println(" The answer is : " + ans);

	}

}
