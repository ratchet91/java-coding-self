package main;

public class StringMatchingWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[] { "Dog", "Dog", "Cat", "Dog" };
		int i = 0, j = words.length - 1;
		boolean res = true;
		while (i <= j) {
			if (!words[i].equals(words[j])) {
				res = false;
				System.out.println(" The result is : " + res);
				break;
			}
			i++;
			j--;
		}
		if (res) {
			System.out.println(" The result is : " + res);
		}

	}

}
