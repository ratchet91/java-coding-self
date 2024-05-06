package main;

import java.util.ArrayList;
import java.util.List;

public class mergeSort {

	public static void mergeSort(int low, int high, int[] arr) {
		if (low >= high) {
			return;
		}
		int mid = (low + high) / 2;
		mergeSort(low, mid, arr);
		mergeSort(mid + 1, high, arr);
		merge(low, mid, high, arr);

	}

	public static void merge(int low, int mid, int high, int[] arr) {
		List<Integer> temp = new ArrayList<>();
		int left = low;
		int right = mid + 1;
		while (left <= mid && right <= high) {
			if (arr[left] <= arr[right]) {
				temp.add(arr[left]);
				left++;
			} else {
				temp.add(arr[right]);
				right++;
			}
		}
		while (left <= mid) {
			temp.add(arr[left]);
			left++;
		}
		while (right <= high) {
			temp.add(arr[right]);
			right++;
		}
		System.out.print(temp);
		for (int i = low; i <= high; i++) {
			arr[i] = temp.get(i - low);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 56, 7, 7, 34, 23, 5, 1, 90 };
		mergeSort(0, arr.length - 1, arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" : " + arr[i]);
		}

	}

}
