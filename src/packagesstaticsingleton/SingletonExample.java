package packagesstaticsingleton;

public class SingletonExample {
	
	private SingletonExample() {
		
	}
	
	private static SingletonExample ins;
	
	public static SingletonExample getInstance() {
		if (ins == null) {
			ins = new SingletonExample();
		}
		return ins;
	}
}
