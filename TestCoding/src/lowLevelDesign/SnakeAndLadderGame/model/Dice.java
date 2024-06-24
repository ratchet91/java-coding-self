package lowLevelDesign.SnakeAndLadderGame.model;

public class Dice {
	int diceCount;

	public Dice(int diceCount) {
		this.diceCount = diceCount;
	}

	public int rollDice() {
		int diff = 6;
		int totalSum = 0;
		int diceUsed = 0;
		while (diceCount > diceUsed) {
			int num;
			num = (int) (Math.random() * 5) + 1;
			totalSum += num;
			diceUsed++;
		}
		return totalSum;

	}

}
