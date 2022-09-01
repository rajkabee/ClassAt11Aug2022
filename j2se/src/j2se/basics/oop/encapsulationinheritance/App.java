package j2se.basics.oop.encapsulationinheritance;

public class App {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.nationalId = 1232131l;
		emp.name="sangam Subedi";
		emp.address = "Chitwan";
		emp.empId = 123;
		emp.position = "manager";
		emp.salary = 5000f;
		emp.display();
		//emp.parentsDisplay();
		
		
		/*
		Person p = new Person();
		p.nationalId = 312321l;
		p.name = "Ganesh";
		p.address = "Kathmandu";
		p.display();
		*/
		
	}
}
