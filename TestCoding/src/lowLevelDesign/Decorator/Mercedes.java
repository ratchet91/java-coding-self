package lowLevelDesign.Decorator;

public class Mercedes extends BaseCar {

	@Override
	public void engine() {
		System.out.println("I am in the engine method of the Mercedes Car");
	}

	@Override
	public void wheel() {
		System.out.println("I am in the wheel method of the Mercedes Car");

	}

	@Override
	public void seat() {
		System.out.println("I am in the seat method of the Mercedes Car");

	}

	@Override
	public int getSpeed() {
		return 400;
	}

}
