/*
 * 3 functions -> insert, delete and getRandom from the integers provided
 * 
 * 
 *   [null |-1| tail ] -> [head |-1| null ]
 *   
 *   [null |10|  ] -> [10 |12| 8 ] -> [12 |8|  ] -> [ |15| 16 ] -> [15 | 16 | null
 *   [16 -> node]
 *   
 *   10, 15 , 8 , 15 -> 
 *   
 *   
 *   ArrayList
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 *   
 * 
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class WhatfixTest {

	public static Map<Integer, Integer> map = new HashMap<>();
	public static int index = 0;

	public static void insert(int val, int[] arr) {
		arr[index] = val;
		map.put(val, index);
		System.out.println("Val inserted: " + val + " at :" + map.get(val));
		index++;
	}

	public static void delete(int val, int[] arr) {
		int indexToDel = map.get(val);
		index--;
		map.put(arr[index], map.get(val));
		int temp = arr[index];
		arr[index] = arr[indexToDel];
		System.out.println("Val deleted: " + val + " at :" + map.get(val));
		arr[indexToDel] = temp;

		index--;
		map.remove(val);

	}

	public static void getRandom(int[] arr) {

		Random rand = new Random();
		int upperbound = index;
		int int_random = rand.nextInt(upperbound);
		System.out.println(" the random elem is : " + arr[int_random]);
	}

	public static void main(String[] args) {
		int[] arr = new int[128];
		insert(10, arr);
		insert(15, arr);
		insert(12, arr);
		insert(8, arr);

		getRandom(arr);
		getRandom(arr);
		getRandom(arr);
		getRandom(arr);

		delete(12, arr);

		System.out.println(" \n ");
		for (int i = 0; i <= index; i++) {
			System.out.println(" elem: " + arr[i]);
		}

	}

}
