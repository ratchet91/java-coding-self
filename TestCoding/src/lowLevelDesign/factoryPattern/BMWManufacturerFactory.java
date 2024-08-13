package lowLevelDesign.factoryPattern;

public class BMWManufacturerFactory extends VehicleFactory {
	@Override
	public Vehicle createVehicleFactory() {
		// TODO Auto-generated method stub
		return new BMW();
	}

}
