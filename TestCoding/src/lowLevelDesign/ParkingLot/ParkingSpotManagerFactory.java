package lowLevelDesign.ParkingLot;

import java.util.List;

public class ParkingSpotManagerFactory {
	ParkingSpotManager getParkingSpotManager(VehicleType vehicleType, List<ParkingSpot> spots) {
		if (vehicleType == VehicleType.TWO_WHEELER)
			return new TwoWheelerParkingManager(spots);
		else if (vehicleType == VehicleType.FOUR_WHEELER)
			return new FourWheelerParkingManger(spots);
		else
			return null; // Handle error
	}

}
