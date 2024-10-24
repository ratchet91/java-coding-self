package test123;

public class AirConditionDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AcController ac = new AcController(1, 23, new ThermalObservable());
		System.out.println(" The current temp is : " + ac.getTemp());
		ac.setTemp(17.7);
		ac.setTemp(32);

	}

}
