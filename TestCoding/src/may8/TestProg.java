package may8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * password generator -> 10 character long ->

	atleast one uppercase letter
	atleast one lowerCase letter
	atleast one number letter

 
 * 
 * 
 * 
 * 
 */
public class TestProg {
	public static boolean validatePassword(String str) {
		int uc = 0, lc = 0, num = 0;
		boolean isValid = false;
		for (char c : str.toCharArray()) {
			if (Character.isUpperCase(c)) {
				uc++;
			}
			if (Character.isLowerCase(c)) {
				lc++;
			}
			if (Character.isDigit(c)) {
				num++;
			}
			if (num > 0 && uc > 0 && lc > 0) {
				isValid = true;
				break;
			}

		}
		return isValid;
	}

	public static void main(String[] args) {

		Random r = new Random();
		List<Integer> arr = new ArrayList<>();

		arr = Stream.generate(r::nextInt).filter(x -> x > 0 && x < 300).limit(10).collect(Collectors.toList());

		StringBuilder password = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			int t = arr.get(i);
			password.append(Character.toString((char) t));
		}
		System.out.println("The password generated is: " + password);
		System.out.println(" The password generated is valid: " + validatePassword(password.toString()));

	}

}
