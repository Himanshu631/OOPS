package packagesstaticsingleton;

public class Employee {
	
	int empcode;
	String name;
	double salary;
	static String company;
	
	public Employee(int empcode, String name, double salary, String company) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.salary = salary;
		Employee.company = company;
	}

	public Employee(int empcode, String name, double salary) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.salary = salary;
	}

}
