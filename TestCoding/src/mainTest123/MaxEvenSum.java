package mainTest123;

public class MaxEvenSum {
	public static int maxEvenSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];

		}
		// int s = IntStream.of(a).sum();
		int rem = Integer.MAX_VALUE;
		int negRem = Integer.MAX_VALUE;
		if (sum % 2 == 0) {
			return sum;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				negRem = negRem > a[i] ? a[i] : negRem;
			} else {
				rem = rem > a[i] ? a[i] : rem;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -2, 2, -3, 1 };
		int maxSum = maxEvenSum(a);
		System.out.println(" the res is : " + maxSum);

	}

}
