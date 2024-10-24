package may8;

public class NumberToWords {
	private static final String[] BELOW_TWENTY = { "", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	private static final String[] TENS = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
			"ninety" };

	private static final String[] THOUSANDS = { "", "thousand", "million", "billion" };

	public static String numberToWords(int num) {
		if (num == 0) {
			return "zero";
		}

		int thousandGroup = 0;
		StringBuilder result = new StringBuilder();

		while (num > 0) {
			if (num % 1000 != 0) {
				result.insert(0, convertBelowThousand(num % 1000) + " " + THOUSANDS[thousandGroup] + " ");
			}
			num /= 1000;
			thousandGroup++;
		}

		return result.toString().trim();
	}

	private static String convertBelowThousand(int num) {
		if (num == 0) {
			return "";
		} else if (num < 20) {
			return BELOW_TWENTY[num];
		} else if (num < 100) {
			return TENS[num / 10] + (num % 10 != 0 ? " " + BELOW_TWENTY[num % 10] : "");
		} else {
			return BELOW_TWENTY[num / 100] + " hundred" + (num % 100 != 0 ? " " + convertBelowThousand(num % 100) : "");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(numberToWords(12345)); // Output: twelve thousand three hundred forty-five
		System.out.println(numberToWords(900000000)); // Output: nine hundred million
		System.out.println(numberToWords(0));

	}

}
