package inheritance;

public class InheritanceBoxChild extends InheritanceBox {
	
	double weight;
	
	public InheritanceBoxChild() {
		this.weight = 1;
	}

	public InheritanceBoxChild(double l, double w, double h, double weight) {
		super(l, w, h);
		this.weight = weight;
	}
	
}
