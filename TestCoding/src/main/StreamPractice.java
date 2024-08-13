package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrList = Arrays.asList(1, 2);
		// 1.Sum of Sq of elements of list
		int sumSq = arrList.stream().reduce((a, b) -> a * a + b * b).get();
		System.out.println(sumSq);
		// to get List of sq of each element
		List<Integer> ansList1 = arrList.stream().map(x -> x * x).collect(Collectors.toList());
		ansList1.forEach(x -> System.out.print(" : " + x));

		// create a stream to generate infinite seq of random numbers and print the
		// first 10

		Random r = new Random();
		List<Integer> ansList2 = Stream.generate(r::nextInt).filter(x -> x > 0).limit(10).collect(Collectors.toList());
		ansList2.stream().filter(x -> x > 0).forEach(x -> System.out.print(" : " + x));

		// partition a list of Integer into even and odd

		Map<Boolean, List<Integer>> ansMap1 = arrList.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
		System.out.println();
		System.out.println(ansMap1.get(true));
		System.out.println(ansMap1.get(false));

		System.out.println();
		// to convert List of String into respective List of String Length
		String sentences = new String("Hi I am rachit rachit");
		List<Integer> ansList3 = Arrays.asList(sentences).stream().flatMap(x -> Arrays.stream(x.split(" ")))
				.map(x -> x.length()).collect(Collectors.toList());
		ansList3.forEach(x -> System.out.print(" : " + x));

		// to find product of each element in list
		int prod = arrList.stream().reduce(1, (a, b) -> a * b);
		System.out.println("\nProduct is: " + prod);

		// to collect all unique words in a list
		Set<String> ansSet1 = Arrays.asList(sentences).stream().flatMap(x -> Arrays.stream(x.split(" ")))
				.collect(Collectors.toSet());

		ansSet1.stream().forEach(x -> System.out.print(": " + x));

		// filter out null values in a List<String>
		List<String> strList = new ArrayList<>();
		strList.add("Hi I am Rachit");
		strList.add("wassup");
		strList.add("is prepairing");
		strList.add(null);
		strList.stream().forEach(x -> System.out.println(" " + x));

		System.out.println();

		strList = strList.stream().filter(x -> x != null).flatMap(x -> Arrays.stream(x.split(" ")))
				.collect(Collectors.toList());
		strList.stream().forEach(x -> System.out.println(" " + x));

		// Merge 2 array of integer and then remove Duplicates

		int[] ar1 = new int[] { 1, 1, 2, 4, 6 };
		int[] ar2 = new int[] { 1, 1, 2, 4, 6, 56, 266 };
		int[] ar3 = IntStream.concat(Arrays.stream(ar1), Arrays.stream(ar2)).sorted().distinct().toArray();
		System.out.println(": " + Arrays.toString(ar3));

		// check if any string in a list starts with specific symbol
		List<String> ansList4 = strList.stream().flatMap(x -> Arrays.stream(x.split(" ")))
				.filter(c -> c.indexOf("H") == 0).collect(Collectors.toList());
		System.out.println();
		ansList4.forEach(x -> System.out.print(": " + x));

		// Concat List of String into single string
		String concatStr = strList.stream().flatMap(x -> Arrays.stream(x.split(" "))).reduce("", (a, b) -> a + " " + b);
		System.out.println(" : " + concatStr);

		// Convert List of string to map<String, length>
		Map<String, Integer> strMapLen = strList.stream().flatMap(x -> Arrays.stream(x.split(" ")))
				.collect(Collectors.toMap(s -> s, s -> s.length()));
		for (Map.Entry<String, Integer> entry : strMapLen.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		// flatten a list of list of integer to list of integer

		int[] ar11 = new int[] { 1, 2, 5, 76, 3 };
		int[] ar12 = new int[] { 1, 2, 5, 76, 3 };
		List<List<Integer>> lst1 = new ArrayList<>();

		List<List<Integer>> listOfLists = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6),
				Arrays.asList(7, 8, 9));

		List<Integer> flattenedList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());

	}

}
