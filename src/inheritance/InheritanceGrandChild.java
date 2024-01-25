package inheritance;

public class InheritanceGrandChild extends InheritanceBoxChild{
	double price ;
	
	public InheritanceGrandChild() {
		this.price = 0;
	}

	public InheritanceGrandChild(double l, double w, double h, double weight, double price) {
		super(l, w, h, weight);
		this.price = price;
	}	
	
}
