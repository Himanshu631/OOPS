package inheritance;

public class InheritanceTest extends InheritanceBox {
	
	double weight1;
	
	public InheritanceTest() {
		this.weight1 = 1;
	}

	public InheritanceTest(double l, double w, double h, double weight1) {
		super(l, w, h);
		this.weight1 = weight1;
	}
	
}