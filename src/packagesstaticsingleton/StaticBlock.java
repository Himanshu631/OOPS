package packagesstaticsingleton;

public class StaticBlock {
	static int a = 4;
	static int b = 5;
	
	static {
		System.out.println("I am in starting block");
		b = a * 5;
	}
	
	public static void main(String[] args) {
		StaticBlock ob = new StaticBlock();
		System.out.println("a = " + StaticBlock.a + " "+"b = "+ StaticBlock.b);
		
		StaticBlock.b+=3;
		
		StaticBlock ob2 = new StaticBlock();
		System.out.println("a = " + StaticBlock.a + " "+"b = "+ StaticBlock.b);
		
		StaticBlock.b+=3;
		
		StaticBlock ob3 = new StaticBlock();
		System.out.println("a = " + StaticBlock.a + " "+"b = "+ StaticBlock.b);
		
		System.out.println(ob);
		System.out.println(ob2);
		System.out.println(ob3);
	
	}
}
