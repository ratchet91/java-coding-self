package main;

public class NextPermutation {

	public static void getNextPermutation(int[] arr) {
		int index1 = -1, index2 = -1;
		int n = arr.length;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i + 1] > arr[i]) {
				index1 = i;
				break;
			}
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] > arr[index1]) {
				index2 = i;
				break;
			}
		}
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		int f = n - 1;
		int index = index1;

		while (index + 1 < f) {
			int temp1 = arr[index];
			arr[index] = arr[f];
			arr[f] = temp1;
			index++;
			f--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(" : " + arr[i]);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 5, 4 };

		getNextPermutation(arr);

	}

}
