package packagesstaticsingleton;

public class Main {

//	public static void main(String[] args) {
//		
//		Employee e1 = new Employee(101, "Ram", 150000,"cavisson");
//		Employee e2 = new Employee(102, "Amit", 150000);
//		
//		
//		System.out.println(Employee.company);
//		System.out.println(e1.name);
//	}

	public static void main(String[] args) {
		SingletonExample ob = SingletonExample.getInstance();
		System.out.println(ob);
	}
}
