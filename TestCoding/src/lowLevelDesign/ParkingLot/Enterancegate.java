package lowLevelDesign.ParkingLot;

import java.util.List;

public class Enterancegate {
	ParkingSpotManagerFactory psfManager;

	Enterancegate(ParkingSpotManagerFactory psfManager) {
		this.psfManager = psfManager;
	}

	public ParkingSpot findParkingSpace(VehicleType type, List<ParkingSpot> spots) {
		ParkingSpotManager psManager = psfManager.getParkingSpotManager(type, spots);
		return psManager.findParkingSpace();
	}

	public Ticket ticketGenerator(Vehicle v, ParkingSpot ps) {
		// implementation logic
		return null;
	}
}
