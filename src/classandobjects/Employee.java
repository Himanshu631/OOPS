package classandobjects;

public class Employee {
	
	int empcode;
	String name;
	double salary;
	
	public Employee(int empcode, String name, double salary) {
		super();
		this.empcode = empcode;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	

}
