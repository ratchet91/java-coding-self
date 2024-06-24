package lowLevelDesign.ElevatorSystem.model;

public class Display {
	public int floor;
	public Direction direction;

	public void setDisplay(int floor, Direction dir) {
		this.floor = floor;
		this.direction = dir;
	}

	public void showDisplay() {
		System.out.print(floor);
		System.out.print(direction);
	}
}
