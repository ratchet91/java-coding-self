import java.util.Arrays;

public class BigBasketTest {
	public static int getLargest(int num) {
		int max = Integer.MIN_VALUE;
		int[] freq = new int[10];
		Arrays.fill(freq, -1);
		char[] ch = String.valueOf(num).toCharArray();
		for (int i = 0; i < ch.length; i++) {
			freq[ch[i] - '0'] = i;
		}
		int indexExp = 0;
		for (int i = 9; i >= 0; i--) { // freq[i] where i = 6 is 3

			if (freq[i] == -1) {
				continue;
			} else if (freq[i] == indexExp) {
				// while (freq[i] == indexExp) {
				// i++;
				indexExp++;
				// }

			} else {

				char temp = ch[freq[i]]; // ch[freq[i]] = ch[3]
				ch[freq[i]] = ch[indexExp];// ch[indexExp] = ch[1] -> so swapping between index 3 and 1 (7326 -> 7623)
				ch[indexExp] = temp;
				break;
			}
		}

		StringBuilder str = new StringBuilder();
		for (int i = 0; i < ch.length; i++) {
			str.append(ch[i]);
		}
		return Integer.valueOf(str.toString());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 992361;
		int ans = getLargest(num);
		System.out.println(" largest is : " + ans);

	}

}
