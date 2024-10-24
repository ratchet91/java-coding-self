package mainTest123;

import java.util.Arrays;

public class DigiCert2 {
	public static int[] getResultantArray(int[] arr) {
		int[] resArr = new int[arr.length];
		int[] pref = new int[arr.length];
		pref[0] = 0;
		for (int i = 1; i < arr.length; i++) {
			pref[i] = pref[i - 1] + arr[i - 1];

		}

		int[] postf = new int[arr.length];
		postf[arr.length - 1] = 0;
		for (int i = arr.length - 2; i >= 0; i--) {
			postf[i] = postf[i + 1] + arr[i + 1];
			System.out.print(":" + postf[i]);

		}
		int[] sub = new int[arr.length];
//		int mid = arr.length / 2;
//		for (int i = 0; i < arr.length; i++) {
//			if (i < mid) {
//				sub[i] = -1 * (arr[i] * (arr.length - 1));
//			} else if (i > mid) {
//				sub[i] = (arr[i] * (i - 1));
//			} else {
//				sub[i] = 0;
//			}
//		}

		for (int i = 0; i < arr.length; i++) {
			int n = i;
			int p = arr.length - 1 - i;
			sub[i] = arr[i] * (n - p);
		}
		System.out.println(Arrays.toString(sub));
		System.out.println("/n");
		for (int i = 0; i < arr.length; i++) {
			resArr[i] = ((postf[i] - pref[i]) + sub[i]);
		}
		return resArr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 4, 6, 8, 10 };

		System.out.println(Arrays.toString(getResultantArray(arr)));

	}

}
