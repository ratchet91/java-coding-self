package main;

public class XORArray {

	public static int[] generateArray(int n, int start) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = start + (2 * i);
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5, start = 0;
		int[] arr = generateArray(n, start);
		for (int i = 0; i < n; i++) {
			System.out.print(" -> " + arr[i]);
		}

	}

}
