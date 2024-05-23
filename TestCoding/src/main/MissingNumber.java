package main;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 0, 1, 2, 7, 6, 8, 3, 5, 4 };

		int curr = arr[0];
		for (int i = 1; i < 9; i++) {
			curr = arr[i - 1];
			if (arr[curr] != arr[i]) {
				int temp = arr[curr];
				arr[curr] = arr[i];
				arr[i] = temp;
				i--;
			}
		}

		for (int i = 0; i < 9; i++) {
			System.out.println(" : " + arr[i]);
		}

	}

}
