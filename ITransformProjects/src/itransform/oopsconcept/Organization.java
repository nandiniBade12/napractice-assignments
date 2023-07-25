package itransform.oopsconcept;

class Employee{
	
	private String name;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public double calculateSalary() {
		return salary;
	}
	
}

class Manager extends Employee{
	
	private double incentive;

	public Manager() {
		super();
	}

	public Manager(String name, double salary, double incentive) {
		super(name, salary);
		this.incentive = incentive;
	}
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + incentive;
	}
	
}

class Labour extends Employee{
	
	private double overtime;

	public Labour() {
		super();
	}

	public Labour(String name, double salary, double overtime) {
		super(name, salary);
		this.overtime = overtime;
	}
	
	@Override
	public double calculateSalary() {
		return super.calculateSalary() + overtime;
	}
	
}

public class Organization {

	public static void main(String[] args) {
		
		Employee e1 = new Manager("Supriya",44500,15223.55);
		Employee e2 = new Labour("Manaswi",32800,10500.250);
		
		double total_salary = e1.calculateSalary() + e2.calculateSalary();
		
		System.out.println("Total salary of all employees : " + total_salary);

	}

}
