package polymorphism;

public class Main {

	public static void main(String[] args) {
		Shape shape = new Shape();
		Triangle t = new Triangle();
		Circle c = new Circle();
		Square s = new Square();
		
		Shape test = new Triangle();
		test.area();
		
	}

}
