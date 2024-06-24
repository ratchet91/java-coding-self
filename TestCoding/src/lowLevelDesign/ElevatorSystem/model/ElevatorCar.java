package lowLevelDesign.ElevatorSystem.model;

public class ElevatorCar {

	int id;
	Display dis;
	InternalButton intButton;
	State state;
	int currentFloor;
	Direction dir;
	ElevatorDoor door;

	public ElevatorCar() {
		dis = new Display();
		intButton = new InternalButton();
		state = State.IDLE;
		currentFloor = 0;
		dir = Direction.UP;
		door = new ElevatorDoor();

	}

	public void showDisplay() {
		dis.showDisplay();
	}

}
