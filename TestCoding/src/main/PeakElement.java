package main;

public class PeakElement {
	public static int getPeakElement(int[] arr) {

		if (arr[0] > arr[1]) {
			return arr[0];
		} else if (arr[arr.length - 1] > arr[arr.length - 2]) {
			return arr[arr.length - 1];
		}
		int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (mid < arr.length - 1 && mid > 0 && arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
				return arr[mid];
			} else if (mid > 0 && arr[mid] < arr[mid - 1]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 21, 1, 2, 2, 1 };
		int ans = getPeakElement(arr);
		System.out.println("The req element is : " + ans);

	}

}
