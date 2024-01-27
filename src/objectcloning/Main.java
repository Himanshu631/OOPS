package objectcloning;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Human h = new Human(34,"Someone");
//		Human twin = new Human(h);
		
		Human twin = (Human) h.clone();
		System.out.println(twin.age + " " + twin.name);
		
		twin.name = "Anyone";
		
		System.out.println(h.name);
		System.out.println(twin.name);
		
		twin.age = 52;
		System.out.println(h.age);
		System.out.println(twin.age);
		
		twin.arr[0] = 100;
		System.out.println(Arrays.toString(h.arr));
		System.out.println(Arrays.toString(twin.arr));
	}

}
