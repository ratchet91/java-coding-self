package lowLevelDesign.FactoryPattern2;

public class AllShapeFactory extends ShapeFactory {

	@Override
	public Shape createInstance(String type) {
		// TODO Auto-generated method stub
		switch (type) {
		case "Circle":
			return new Circle();
		default:
			return new Square();
		}
	}

}
