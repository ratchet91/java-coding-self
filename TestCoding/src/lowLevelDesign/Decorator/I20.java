package lowLevelDesign.Decorator;

public class I20 extends BaseCar {

	public void engine() {
		System.out.println("I am in the engine method of the I20 Car");

	}

	public void wheel() {
		System.out.println("I am in the wheel method of the I20 Car");

	}

	public void seat() {
		System.out.println("I am in the seat method of the I20 Car");

	}

	public int getSpeed() {
		return 200;
	}

}
