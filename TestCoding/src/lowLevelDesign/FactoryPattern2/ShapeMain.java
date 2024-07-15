package lowLevelDesign.FactoryPattern2;

public class ShapeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new AllShapeFactory();
		Shape s = sf.createInstance("Circle");
		s.draw();

	}

}
