package mainTest123;

public class SystemTest {
//Input = TARGETISHIRING num =3
	/*
	 * T E H N A G T S I I G R I R Output = TEHNAGTSIIGRIR
	 */

	public static int getTarget(int[] arr, int size, int target) {
		if (target < arr[0]) {
			return 0;
		}
		if (target > arr[size - 1]) {
			return size;
		}
		int index = -1;
		int start = 0, high = size - 1;
		while (start < high) {
			int mid = (start + high) / 2;

			if (target == arr[mid]) {
				index = mid;
				return index + 1;
			} else if (target > arr[mid]) {
				index = mid;
				start = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return index + 2;
	}

	public static String getZigZAG(String str, int k, int size) {
		boolean down = true;
		StringBuilder[] sb = new StringBuilder[k];
		int i = 0;
		while (i < str.length()) {
			if (down) {
				for (int f = 0; f < k; f++) {
					if (sb[f] == null) {
						sb[f] = new StringBuilder();
					}
					sb[f].append(str.charAt(i++));
					if (i == str.length()) {
						break;
					}
				}
				down = false;
			} else {
				for (int f = k - 2; f > 0; f--) {
					sb[f].append(str.charAt(i++));
					if (i == str.length()) {
						break;
					}
				}
				down = true;
			}
		}
		StringBuilder finalString = new StringBuilder();
		for (int l = 0; l < k; l++) {
			System.out.println(" : " + sb[l].toString());
			finalString.append(sb[l].toString());
		}
		return finalString.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi! I am Rachit");
		int[] arr = new int[] { 1, 2, 4, 6, 7 };
		int n = arr.length;
		int target = 7;

		// int index = getTarget(arr, n, target);

		// System.out.println(" The required index is : " + index);

		int k = 3;
		String str = "TARGETISHIRING";
		String res = getZigZAG(str, k, str.length());

		System.out.println("The final output is : " + res);

	}

}
