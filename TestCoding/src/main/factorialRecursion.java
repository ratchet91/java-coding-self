package main;

public class factorialRecursion {

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int res = fact(5);
		System.out.println(" the factorial of 5 is : " + res);

	}

}
