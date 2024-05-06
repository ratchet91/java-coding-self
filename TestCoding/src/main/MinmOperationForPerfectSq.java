package main;

import java.util.Arrays;
import java.util.Scanner;

public class MinmOperationForPerfectSq {

	public static int getMinmOperation(int[] arr, int size) {
		if (size == 0) {
			return 0;
		}
		int[] operationCount = new int[size];
		int count = 0;
		for (int i = 0; i < size; i++) {
			double sqrt = Math.sqrt(arr[i]);
			int upSqrt = (int) Math.pow(Math.ceil(sqrt), 2);
			int loSqrt = (int) Math.pow(Math.floor(sqrt), 2);
			operationCount[count++] = Math.min(upSqrt - arr[i], arr[i] - loSqrt);
		}
		int res = 0;
		Arrays.sort(operationCount);
		for (int i = 0; i < size / 2; i++) {
			res += operationCount[i];
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int result = getMinmOperation(arr, n);
		System.out.println("The resut is : " + result);

	}

}
