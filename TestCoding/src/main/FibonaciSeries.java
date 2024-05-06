package main;

public class FibonaciSeries {
	public static int fibonacciResult(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacciResult(n - 2) + fibonacciResult(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 5;
		// int res = fibonacciResult(num);
		for (int i = 0; i < num; i++) {
			int res = fibonacciResult(i);
			System.out.print(" -> : " + res);
		}

	}

}
