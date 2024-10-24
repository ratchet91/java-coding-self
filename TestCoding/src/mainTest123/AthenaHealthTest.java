package mainTest123;

import java.util.HashSet;
import java.util.Set;

/*
 * Player 1 and Player2 decided to play a game. 
 * The game comprises of a String S which consist of lowercase English alphabets only and 
 * both players take alternative terms.
 * 
In each turn, a Player choose a character present in the string and 
remove all occurrences of the character. For each player to play his turn, 
there should be at least one character in the string. 
The Player who is not able to play his turn loses.
 
Your task is to find the winner of the game, if both the players play optimally and  
plays the first turn.
 * 
 * 
 */

public class AthenaHealthTest {
	public static int getTheWinner(String s) {
		int count = 1;
		Set<Character> set = new HashSet<>();
		for (Character ch : s.toCharArray()) {
			set.add(ch);
		}
		return set.size() % 2 == 0 ? 1 : 2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "retrary";
		// Queue<Integer> players = new LinkedList<>();

		int player = getTheWinner(s);
		System.out.println("Thwe winner is pleayer:" + player);

	}

}
