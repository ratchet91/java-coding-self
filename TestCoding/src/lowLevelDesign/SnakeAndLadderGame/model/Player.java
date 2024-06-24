package lowLevelDesign.SnakeAndLadderGame.model;

public class Player {
	String name;
	int currentPos;

	public Player(String name, int currentPos) {
		this.name = name;
		this.currentPos = currentPos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentPos() {
		return currentPos;
	}

	public void setCurrentPos(int currentPos) {
		this.currentPos = currentPos;
	}

}
