package main;

import java.util.Scanner;

public class ZigzagConversion {
	public static String solution(String s, int k) {
		int n = s.length();
		if (s.length() == 0) {
			return "";
		}
		StringBuilder[] sb = new StringBuilder[k];
		boolean down = true;
		int l = 0;
		int i = 0;
		while (i < n) {
			if (down) {
				for (int m = 0; m < k; m++) {
					if (i == n) {
						break;
					}
					if (sb[m] == null) {
						sb[m] = new StringBuilder();
					}
					sb[m].append(s.charAt(i++));
				}
				down = false;
			} else {
				for (int m = k - 2; m >= 0; m--) {
					if (i == n) {
						break;
					}
					sb[m].append(s.charAt(i++));
				}
				down = true;
			}
		}
		StringBuilder sb2 = new StringBuilder();
		for (int f = 0; f < sb.length; f++) {
			if (sb[f] != null) {
				sb2.append(sb[f].toString());
			}

		}
		return sb2.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rachitraj";
		Scanner sc = new Scanner(System.in);
		System.out.println(" Input value : ");
		int num = sc.nextInt();
		String res = solution(str, num);

		System.out.println(" the result is : " + res);

	}

}
