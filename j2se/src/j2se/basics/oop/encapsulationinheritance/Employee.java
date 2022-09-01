package j2se.basics.oop.encapsulationinheritance;

public class Employee extends Person{
	int empId;
	String position;
	float salary;
	public void display() {
		super.display();
		System.out.println("\nEmployee Id: "+empId+
							"\t Position: "+position+
							"\t Salary: "+salary
					);
	}
	public void parentsDisplay() {
		super.display();
	}
	
	
	
}
