package lowLevelDesign.SnakeAndLadderGame.model;

public class Board {
	public Cell[][] cells;

	public Board(int boardSize, int numSnakes, int numLadders) {
		initialise(boardSize);
		addSnakeLadders(numSnakes, numLadders);
	}

	public void initialise(int boardSize) {
		cells = new Cell[boardSize][boardSize];
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				Cell cellObj = new Cell();
				cells[i][j] = cellObj;
			}
		}
	}

	public void addSnakeLadders(int numSnake, int numLadders) {
		while (numSnake > 0) {
			int snakeHead = (int) (Math.random() * (99)) + 1;
			int snakeTail = (int) (Math.random() * (99)) + 1;
			if (snakeHead < snakeTail) {
				continue;
			}
			Jump snakeObj = new Jump();
			snakeObj.setStart(snakeHead);
			snakeObj.setEnd(snakeTail);

			Cell cell = getCell(snakeHead);
			cell.jump = snakeObj;
			numSnake--;

		}

		while (numLadders > 0) {
			int ladderHead = (int) (Math.random() * (99)) + 1;
			int ladderTail = (int) (Math.random() * (99)) + 1;
			if (ladderHead > ladderTail) {
				continue;
			}
			Jump ladderObj = new Jump();
			ladderObj.setStart(ladderHead);
			ladderObj.setEnd(ladderTail);

			Cell cell = getCell(ladderHead);
			cell.jump = ladderObj;
			numLadders--;

		}
	}

	public Cell getCell(int num) {
		int boardRow = num / cells.length;
		int boardCol = num % cells.length;
		return cells[boardRow][boardCol];
	}
}
