package lowLevelDesign.factoryPattern;

public abstract class VehicleFactory {

	public Vehicle getVehicleFactory() {
		Vehicle v = createVehicleFactory();
		return v;

	}

	public abstract Vehicle createVehicleFactory();
}
