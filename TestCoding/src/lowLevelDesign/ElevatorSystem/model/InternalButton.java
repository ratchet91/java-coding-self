package lowLevelDesign.ElevatorSystem.model;

public class InternalButton {
	InternalButtonDispatcher jobDispatcher = new InternalButtonDispatcher();
	int buttonSelected;

	int[] availableButton = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public pressButton(int destination, ElevatorCar elevatorCar) {
		//check if destination is within range
		//submit the rq to job dispatcher
		
		
		jobDispatcher.submitInternalRequest(destination, elevatorCar);
		
	}

}
