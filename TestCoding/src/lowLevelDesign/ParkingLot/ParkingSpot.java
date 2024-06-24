package lowLevelDesign.ParkingLot;

public class ParkingSpot {
	int id;
	boolean isEmpty;
	Vehicle vehicle;
	double price;
	VehicleType type;

	ParkingSpot(int id, int price) {
		this.id = id;
		this.isEmpty = true;
		this.vehicle = null;
		this.price = price;
	}

	public void parkVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.isEmpty = false;
	}

	public void removeVehicle(Vehicle vehicle) {
		this.vehicle = null;
		this.isEmpty = true;
	}

}
