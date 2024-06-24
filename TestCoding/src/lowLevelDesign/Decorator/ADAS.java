package lowLevelDesign.Decorator;

public class ADAS extends FunctionImpl {
	BaseCar base;

	ADAS(BaseCar base) {
		this.base = base;
	}

	@Override
	public void engine() {
		base.engine();
	}

	@Override
	public void wheel() {
		base.wheel();

	}

	@Override
	public void seat() {
		base.seat();

	}

	@Override
	public int getSpeed() {
		base.getSpeed();
		return 0;
	}

	public void getADASValue() {
		System.out.println("Level2 ADAS found");
	}

}
