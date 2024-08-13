package lowLevelDesign.FactoryPattern2;

public abstract class ShapeFactory {
	public Shape getInstance(String type) {
		Shape v = createInstance(type);
		return v;
	}

	public abstract Shape createInstance(String type);
}
