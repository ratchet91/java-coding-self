package main;

public class FirstAndLastOccur {

	public static int getFirstOccur(int[] arr, int size, int target) {
		int start = 0, end = size - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				ans = mid;
				start = mid - 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return (ans + 1);

	}

	public static int getlastOccur(int[] arr, int size, int target) {
		int start = 0, end = size - 1;
		int ans = -1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				ans = mid;
				end = mid + 1;
			} else if (arr[mid] > target) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return (ans + 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 3, 4, 4, 5, 6, 7 };
		int target = 4;
		int first = getFirstOccur(arr, arr.length, target);
		int last = getlastOccur(arr, arr.length, target);
		System.out.println(" first :" + first + " : end : " + last);

	}

}
