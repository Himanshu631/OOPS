package inheritance;

public class Main {

	public static void main(String[] args) {
		InheritanceBox b = new InheritanceBox(5,4,3);
		
		System.out.println(b.l+" "+b.w+" "+b.h);
		
		InheritanceBox n = new InheritanceBoxChild(4,5,3,58);
		InheritanceBox n1 = new InheritanceTest(4,5,3,58);
		
		
		System.out.println(n.l+" "+n.w+" "+n.h);
		
		//InheritanceBoxChild g = new InheritanceGrandChild(25, 35, 250, 95800, 125000);
		//System.out.println(g.l + " " + g.w + " " + g.h + " " + g.weight + "" + g.price);

		
	}
}
