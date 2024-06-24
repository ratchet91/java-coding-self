package lowLevelDesign.ElevatorSystem.model;

import java.util.List;

public class Building {
	List<Floor> floorList;

	Building(List<Floor> floorList) {
		this.floorList = floorList;

	}

	public void addFloors(Floor newFloor) {
		floorList.add(newFloor);
	}

	public void removeFloors(Floor removeFloor) {
		floorList.remove(removeFloor);
	}

	public List<Floor> getFloors() {
		return floorList;
	}

}
