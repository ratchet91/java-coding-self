package mainTest123;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test3rdJuly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "exampleexamp";
		Optional<Character> firstNonRepeating = test.chars().mapToObj(c -> (char) c)
				.collect(Collectors.toMap(Function.identity(), c -> 1, Integer::sum)).entrySet().stream()
				.filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).findFirst();

		System.out.println("First non-repeating character: " + firstNonRepeating);

		String i8nt = "123243566";
		int ans = i8nt.chars().mapToObj(c -> (int) c)
				.collect(Collectors.toMap(Function.identity(), c -> c % 2, Integer::sum)).entrySet().stream()
				.filter(entry -> entry.getValue() == 0).map(Map.Entry::getKey).findFirst().orElse(-1);
		System.out.println(ans);

		Integer ansMap = String.valueOf(i8nt).chars().mapToObj(c -> (char) c).filter(Character::isDigit)
				.map(c -> Character.getNumericValue(c)).collect(Collectors.partitioningBy(x -> x % 2 == 0)).get(true)
				.get(0);
		System.out.println(ansMap);

		int[] arr1 = new int[] { 1, 1, 2, 3, 44, 44 };
		int[] arr2 = new int[] { 11, 11, 21, 31, 441, 441 };
		int[] mergedArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().toArray();
		System.out.println(" " + Arrays.toString(mergedArray));
		for (int a : mergedArray) {
			System.out.print(" : " + a);
		}
		// Arrays.asList(mergedArray).stream().collect(Collectors.toList()).forEach(xc
		// -> System.out.println(xc));
		System.out.println("/n");
		Arrays.stream(mergedArray).forEach(x -> System.out.print(": " + x));

	}

}
