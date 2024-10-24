package FileUpload;

import java.util.ArrayList;
import java.util.List;

/*Playing cards : Total 52 cards, A 1-13, B 1-13, C 1-13, D 1-13.
Form the combination of cards (one from each deck)
which can sum to form the number inputs by user. For e.g.
Inputs is 5.
Output is { 2A, 1B, 1C, 1D}, { 1A, 2B, 1C, 1D},  { 1A, 1B, 2C, 1D}, { 1A, 1B, 1C, 2D}
Unique combinations 

*/

public class PaytmTest {
	public static List<int[]> result = new ArrayList<>();

	public static void helper(int[] resArr, int turns, int start, int sum) {

		if (sum == turns + 4) {
			result.add(new int[] { resArr[0], resArr[1], resArr[2], resArr[3] });
			return;
		}
		for (int i = 0; i < 4; i++) {
			turns++;
			resArr[i] = resArr[i] + turns;
			helper(resArr, turns, i + 1, sum);
			resArr[i] = resArr[i] - turns;
			turns--;

		}
	}

	public static void getOutput(int[] resArr, int num) {
		int sum = 4;

		for (int i = 1; i <= 13; i++) {
			for (int j = 1; j <= 13; j++) {
				for (int x = 1; x <= 13; x++) {
					for (int z = 1; z <= 13; z++) {
						System.out.println(i + "A " + j + "B " + x + "C " + z + "D ");
					}

				}
			}

		}

	}

	public static void main(String[] args) {
		int num = 14;
		int[] resArr = new int[] { 1, 1, 1, 1 };
		getOutput(resArr, num);

	}

}
