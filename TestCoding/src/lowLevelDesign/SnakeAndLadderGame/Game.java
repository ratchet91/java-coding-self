package lowLevelDesign.SnakeAndLadderGame;

import java.util.Deque;
import java.util.LinkedList;

import lowLevelDesign.SnakeAndLadderGame.model.Board;
import lowLevelDesign.SnakeAndLadderGame.model.Cell;
import lowLevelDesign.SnakeAndLadderGame.model.Dice;
import lowLevelDesign.SnakeAndLadderGame.model.Player;

public class Game {
	Board board;
	Deque<Player> playerList = new LinkedList<>();

	Dice dice;
	Player winner;

	public Game() {
		initialiseGame();
	}

	public void initialiseGame() {
		board = new Board(10, 5, 4);
		dice = new Dice(1);
		winner = null;
		addPlayers();

	}

	public void addPlayers() {
		Player p1 = new Player("P1", 0);
		Player p2 = new Player("P2", 0);
		playerList.add(p1);
		playerList.add(p2);

	}

	public void startGame() {
		while (winner == null) {

			// check whose turn now
			Player playerTurn = findPlayerTurn();
			System.out.println(
					"player turn is: " + playerTurn.getName() + " and position is : " + playerTurn.getCurrentPos());

			// roll the dice
			int diceNumbers = dice.rollDice();
			// System.out.println("diceRoll: " + diceNumbers);
			// get the new position
			int playerNewPosition = playerTurn.getCurrentPos() + diceNumbers;
			playerNewPosition = jumpCheck(playerNewPosition);
			playerTurn.setCurrentPos(playerNewPosition);

			System.out.println("Player Turn is of : " + playerTurn.getName() + " current position is add : "
					+ playerTurn.getCurrentPos());

			if (playerNewPosition > board.cells.length * board.cells.length - 1) {
				winner = playerTurn;
				System.out.println("Winner is Player : " + winner.getName());
			}

		}
	}

	private Player findPlayerTurn() {
		Player nextPlayer = playerList.removeFirst();
		playerList.addLast(nextPlayer);
		return nextPlayer;
	}

	private int jumpCheck(int playerNewPosition) {
		if (playerNewPosition > board.cells.length * board.cells.length - 1) {
			return playerNewPosition;
		}
		Cell cell = board.getCell(playerNewPosition);
		if (cell.jump != null && cell.jump.start == playerNewPosition) {
			String jumpBy = cell.jump.start > cell.jump.end ? "Snake" : "Ladder";
			System.out.println("Jump done by : " + jumpBy);
			playerNewPosition = cell.jump.end;
		}
		return playerNewPosition;

	}

}
