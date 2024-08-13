package lowLevelDesign.factoryPattern;

public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VehicleFactory vf = new I20ManufacturerFactory();
		Vehicle v = vf.getVehicleFactory();
		System.out.println(v.average());

	}

}
