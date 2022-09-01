package j2se.basics.oop.encapsulationinheritance;

public class Person {
	long nationalId;
	String name;
	String address;
	public void display() {
		System.out.println("NationalId: "+nationalId+
							"\t name: "+name+
							"\t address: "+address);
	}
}
