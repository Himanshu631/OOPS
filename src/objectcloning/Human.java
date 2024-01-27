package objectcloning;

public class Human implements Cloneable {
	int age;
	String name;
	int[] arr;

	public Human(int age, String name) {
		this.age = age;
		this.name = name;
		this.arr = new int[] {2,5,8,7,9};
	}
	
	public Object clone() throws CloneNotSupportedException {
		
		// Shallow Copy
		Human twin = (Human) super.clone();
		
		// Deep Copy
		twin.arr = new int[twin.arr.length];
		for (int i=0;i< twin.arr.length;i++) {
			twin.arr[i] = this.arr[i];
		}
		return twin;
		
	}
	
}
