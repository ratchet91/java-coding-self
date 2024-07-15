package lowLevelDesign.factoryPattern;

public class AllVehicleManufacturerFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicleFactory() {
		// TODO Auto-generated method stub

		return new Scorpio();

	}
}
