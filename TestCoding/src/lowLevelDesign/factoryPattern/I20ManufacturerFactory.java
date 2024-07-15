package lowLevelDesign.factoryPattern;

public class I20ManufacturerFactory extends VehicleFactory {

	@Override
	public Vehicle createVehicleFactory() {
		// TODO Auto-generated method stub
		return new I20();
	}

}
