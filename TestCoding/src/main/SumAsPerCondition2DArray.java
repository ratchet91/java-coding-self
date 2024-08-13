package main;

import java.util.HashSet;
import java.util.Set;

/*
 * You are given an integer n and an array QUERIES where QUERIES[i] = [type, index, val] of length m.
Initially, we have n x n matrix filled with 0's. For each query, you must apply one of the following changes:
if type == 0, set the values in the row with index to val, overwriting any previous values.
if type == 1, set the values in the column with index to val, overwriting any previous values.
Return the sum of integers in the matrix after all queries are applied.
Input: 
n = 3, m=4 
QUERIES = [[0,0,1],[0,2,2],[0,2,3],[1,0,4]]

 */

public class SumAsPerCondition2DArray {
	public static int getSum(int[][] arr, int n, int m) {
		Set<Integer> row = new HashSet<>();
		Set<Integer> col = new HashSet<>();
		int sum = 0;
		for (int i = n - 1; i >= 0; i--) {
			int currRowCol = arr[i][0];
			int startIndex = arr[i][1];
			int times = 3;
			int val = arr[i][2];
			System.out.println("currRowCol : " + currRowCol + " startIndex : " + startIndex + " val : " + val);

			if (currRowCol == 0) {
				if (row.contains(startIndex)) {
					continue;
				}
				row.add(startIndex);
				times -= col.size();
			} else {
				if (col.contains(startIndex)) {
					continue;
				}
				col.add(startIndex);
				times -= row.size();
			}

			sum = sum + (val * times);
			System.out.println(" times: " + times + " sum test: " + sum);
		}
		return sum;

	}

	public static void main(String[] args) {
		int[][] arr = new int[][] { { 0, 0, 1 }, { 0, 2, 2 }, { 0, 2, 3 }, { 1, 0, 4 } };
		int sumAns = getSum(arr, 4, 3);
		System.out.println(" The expected sum is: " + sumAns);

	}
}
