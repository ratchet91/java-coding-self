package main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		List<String> strList = Arrays.asList("asdfdachit", "rachitraj", "raj", "raj", "Rohan", "Rohan",
				"aseddfrehikha");
		List<String> res = strList.stream().filter(x -> x.length() > 5).collect(Collectors.toList());
		res.forEach((x) -> System.out.println("1" + x));

		res.stream().map(x -> x.toUpperCase()).forEach(y -> System.out.println(y));

		List<Integer> pwList = Arrays.asList(2, 5, 10, 8, 4);
		List<Integer> ans = pwList.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(ans);

		Random random = new Random();
		Stream<Integer> sti = Stream.generate(random::nextInt);
		sti.filter(x -> x > 0).limit(10).forEach(System.out::println);

		List<Integer> nums = Arrays.asList(1, 2, 3);
		List<Integer> evenNum = nums.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		List<Integer> oddNum = nums.stream().filter(x -> x % 2 != 0).collect(Collectors.toList());
		evenNum.stream().forEach(System.out::println);
		oddNum.stream().forEach(System.out::println);

		Map<Boolean, List<Integer>> map = nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		map.forEach((key, value) -> {
			System.out.println("Key: " + key + ", Value: " + value);
		});

		int i = 1;
		int product = nums.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Product : " + product);

		Set<String> uniqSet = strList.stream().collect(Collectors.toSet());
		System.out.println(uniqSet);

		List<String> strPref = strList.stream().filter(y -> y != null).filter(x -> x.indexOf("rac") == 0)
				.collect(Collectors.toList());
		System.out.println(strPref);

		// to get count of each character in list of String
		String strNew = "Rachit Raj";
		Map<Character, Long> map2 = strNew.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map2.forEach((key, value) -> {
			if (!key.equals(' ')) {
				System.out.println(key + ": Key & value : " + value);
			}

		});

		List<String> sentence = Arrays.asList("Hi I am Rachit", "Rachit is me", "Rachit is here");
		Map<String, Long> mapDup = sentence.stream().flatMap(x -> Arrays.stream(x.split(" ")))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		mapDup.forEach((key, value) -> {
			System.out.println("Key is : " + key + " value is : " + value);
		});

		String concatString = sentence.stream().flatMap(x -> Arrays.stream(x.split(" ")))
				.collect(Collectors.joining(" "));
		System.out.println(concatString);

		List<List<Integer>> lisInteger = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3, 5, 6),
				Arrays.asList(1, 2, 3, 34567));

		List<Integer> ans2 = lisInteger.stream().flatMap(List::stream).sorted().collect(Collectors.toList());
		System.out.println(ans2);

		String sd = "rachit";
		sd = "raj123";
		System.out.println(sd);
	}

}
