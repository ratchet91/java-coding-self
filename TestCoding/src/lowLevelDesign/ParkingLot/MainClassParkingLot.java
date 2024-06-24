package lowLevelDesign.ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class MainClassParkingLot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize parking spots
		List<ParkingSpot> spots = new ArrayList<>();
		for (int i = 1; i <= 100; ++i) {
			if (i <= 50)
				spots.add(new ParkingSpot(i, 10));
			else
				spots.add(new ParkingSpot(i, 20));
		}

		// Create ParkingSpotManagerFactory
		ParkingSpotManagerFactory factory = new ParkingSpotManagerFactory();

		// Create EntranceGate and ExitGate objects
		Enterancegate entranceGate = new Enterancegate(factory);
		ExitGate exitGate = new ExitGate(factory);

		// Example usage
		Vehicle vehicle = new Vehicle(123, VehicleType.TWO_WHEELER);
		ParkingSpot spot = entranceGate.findParkingSpace(vehicle.vehicleType, spots);
		Ticket ticket = entranceGate.ticketGenerator(vehicle, spot);

		// Vehicle leaves
		exitGate.removeVehicle(ticket);
	}

}
