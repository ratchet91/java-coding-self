package may8;

public class WaveSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void getSortedInWaveForm(int[] arr, int n) {
		for (int i = 0; i < n - 1; i = i + 2) {
			if (i > 0 && arr[i - 1] > arr[i]) {
				swap(arr, i, i - 1);

			}
			if (i < n - 1 && arr[i + 1] > arr[i]) {
				swap(arr, i, i + 1);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 10, 90, 49, 2, 1, 5, 23 };
		getSortedInWaveForm(arr, arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" : " + arr[i]);
		}

	}

}
