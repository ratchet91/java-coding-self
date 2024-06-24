package lowLevelDesign.ParkingLot;

import java.util.ArrayList;

public class ExitGate {
	ParkingSpotManagerFactory psfManager;

	public ExitGate(ParkingSpotManagerFactory psfManager) {
		this.psfManager = psfManager;
	}

	void removeVehicle(Ticket ticket) {
		ParkingSpotManager psManager = psfManager.getParkingSpotManager(ticket.vehicle.vehicleType, new ArrayList<>());
		psManager.removeVehicle(ticket.vehicle);
	}

}
