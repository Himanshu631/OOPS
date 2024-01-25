package packagesstaticsingleton;

public class InnerClasses {
	static class Test {
		String name;
		
		public Test(String name) {
			this.name=name;
		}
	}
	
	public static void main(String[] args) {
		Test t = new Test("hello");
		Test t2 = new Test("world");
		
		System.out.println(t.name);
		System.out.println(t2.name);
	}
}
