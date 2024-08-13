package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAllProgram {
	public static void main(String[] args) {
		Integer[] arr = { 1, 5, 57, 45, 4, 6754 };

		// 1. Get sum of sq of the elements in list
		List<Integer> num = Arrays.asList(arr);
		long sumOfSq = num.stream().map(x -> x * x).reduce(0, (a, b) -> a + b);
		long sum2 = num.stream().mapToInt(x -> x * x).sum();
		System.out.println(sumOfSq);
		System.out.println(sum2);

		// 2.Create a seq to generate a stream of infinite seq and print 10 which are
		// positive
		// use generate & limit
		Random ran = new Random();
		Stream<Integer> ranNum = Stream.generate(ran::nextInt);
		ranNum.filter(x -> x > 0).limit(10).forEach(System.out::println);

		// 3. using stream partition a list of integer into even & odd
		Map<Boolean, List<Integer>> map = num.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
		System.out.println("even" + map.get(true));
		System.out.println("odd" + map.get(false));

		// 4.Convert a list of String to List of their respective lengths

		List<String> strList = new ArrayList<>();
		strList.add("Rachit");
		strList.add("ergrg");
		strList.add("Racrthhrhhit");
		strList.add("Racdfgfghit");
		strList.add("Racrthrthit");

		List<Integer> strLength = strList.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println("Lengths : " + strLength);
		Map<String, Integer> mapStr = strList.stream().collect(Collectors.toMap(x -> x, x -> x.length()));
		System.out.println("map of str and len : " + mapStr);

		// 5. to concat list of String into single string
		String sentence = strList.stream().collect(Collectors.joining(" "));
		// .reduce("", (a, b) -> a + " " + b);
		System.out.println("Concatenated string is: " + sentence);

		// same thing using split and collectors.joining
		String sentence2 = strList.stream().flatMap(x -> Arrays.stream(x.split(" "))).collect(Collectors.joining(" "));
		System.out.println(" Sentence2: " + sentence2);

		// 6. Flatten a List of list of Integer to List of integer
		Integer[][] arrDouble = { { 1, 5, 244, 21 }, { 34, 23, 1, 66, 90 }, { 2, 34 } };
		List<Integer> arrD = Arrays.asList(arrDouble).stream().flatMap(Arrays::stream).collect(Collectors.toList());
		System.out.println("Flattened list : " + arrD);

		// 7.to get 1st non duplicate char from string
		String st = "Racra";
		Optional<Character> dup = st.chars().mapToObj(c -> (char) c)
				.collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum)).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();
		System.out.println("1st non Duplicate character is : " + dup.orElse(null));

		// 8. to get 1st duplicate integer from a list
		List<Integer> num3 = Arrays.asList(1, 45, 2, 5, 2, 1, 3456, 23);
		int dupInt = num3.stream().collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum)).entrySet()
				.stream().filter(x -> x.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(-1);

		System.out.println("The 1st non duplicate integer is : " + dupInt);

		// 9.Concat 2 sorted integer array into 1 in sorted order
		int[] arr1 = new int[] { 1, 1, 2, 3, 5, 6, 789 };
		int[] arr2 = new int[] { 3, 5, 7, 89, 899 };
		int[] arr3 = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().forEach(System.out::print);

		// 10.find out all the numbers starting with 1 using Stream functions
		Integer[] arr10 = new Integer[] { 1, 23, 4576, 345, 12, 112, 111 };
		List<Integer> nums10 = Arrays.asList(arr10);
		List<Integer> ans10 = nums10.stream().map(x -> x + "").filter(v -> v.charAt(0) == '1').map(Integer::parseInt)
				.collect(Collectors.toList());
		System.out.println("ans10 : " + ans10);

		// 11. Find total element of list
		List<Integer> nums11 = Arrays.asList(12, 45, 76, 23, 678, 23546);
		System.out.println("The size is: " + nums11.stream().count());

		// 12.Find max in a list

		List<Integer> nums12 = Arrays.asList(12, 45, 76, 23, 678, 23546);
		System.out.println("The size is: " + nums12.stream().max(Integer::compare).get());

		// 13. convert int[] to List<Integer> using boxed
		// boxed converts into respective Integer
		int[] arr13 = new int[] { 12, 45, 235, 23 };
		Integer[] arr13a = new Integer[] { 12, 45, 235, 23 };
		List<Integer> nums13 = Arrays.stream(arr13).boxed().collect(Collectors.toList());
		System.out.println("nums13 : " + nums13);
		Arrays.sort(arr13a, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return a - b; // Or Integer.compare(a, b)
			}
		});

		// 14. using comparator.compairing sort a 2D array
		int[][] arr14 = new int[][] { { 1, 2, 3 }, { 3, 4, 5 }, { 7, 6, 8 } };
		Arrays.stream(arr14).sorted(Comparator.comparing(a -> a[0]));

		// 15 using comparator for 1D Array
		// int[] arr15 = new int
	}
}
