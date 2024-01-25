package inheritance;

public class InheritanceBox {
		double l;
		double w;
		double h;
	
	
	public InheritanceBox() {
		this.l = 1;
		this.w = 1;
		this.h = 1;
	}
		
	InheritanceBox (double side){
		this.l = side;
		this.h = side;
		this.w = side;
	}
	
	InheritanceBox (double l,double w,double h){
		this.l = l;
		this.h = h;
		this.w = w;
	}
	
	InheritanceBox(InheritanceBox old){
		this.l = old.l;
		this.h = old.h;
		this.w = old.w;
	}
}
