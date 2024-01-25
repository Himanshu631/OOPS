package classandobjects;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(101, "Ram", 150000);
		Employee e2 = new Employee(102, "Amit", 150000);
		
		
		System.out.println(e1.getSalary());
		System.out.println(e2.getName());
		
		e2.setEmpcode(52);
	}

}
