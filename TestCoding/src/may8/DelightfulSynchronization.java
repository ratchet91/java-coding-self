package may8;

import java.util.HashMap;
import java.util.Map;

public class DelightfulSynchronization {

	public static boolean areDelightfullySynchronized(String P, String Q) {
		// If the lengths of the sequences are not the same, they cannot be
		// synchronized.
		if (P.length() != Q.length()) {
			return false;
		}

		// Map to store the shift amount for each character in P
		Map<Character, Integer> shiftMap = new HashMap<>();

		// Iterate over the characters of P and Q
		for (int i = 0; i < P.length(); i++) {
			char pChar = P.charAt(i);
			char qChar = Q.charAt(i);

			// Calculate the shift required to transform pChar to qChar
			int shift = (qChar - pChar + 26) % 26;

			// If we've seen this character before, ensure its shift is consistent
			if (shiftMap.containsKey(pChar)) {
				if (shiftMap.get(pChar) != shift) {
					return false; // Inconsistent shift for the same character
				}
			} else {
				// Store the shift for this character
				shiftMap.put(pChar, shift);
			}
		}

		// If all shifts are consistent within groups of identical characters, return
		// true
		return true;
	}

	public static void main(String[] args) {
		// Test cases
		String P1 = "apple";
		String Q1 = "cqqnf";
		System.out.println(areDelightfullySynchronized(P1, Q1)); // Output: true

		String P2 = "apple";
		String Q2 = "banana";
		System.out.println(areDelightfullySynchronized(P2, Q2)); // Output: false
	}
}
