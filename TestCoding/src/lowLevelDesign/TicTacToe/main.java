package lowLevelDesign.TicTacToe;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicTacToeGame game = new TicTacToeGame();
		game.initializeGame();
		System.out.println("game winner is: " + game.startGame());

	}

}
