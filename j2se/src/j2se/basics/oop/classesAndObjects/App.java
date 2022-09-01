package j2se.basics.oop.classesAndObjects;

import j2se.basics.oop.encapsulation.Person;

public class App {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.acNumber = 12312;
		ac.holdersName = "Ankalpa Adhikari";
		ac.balance = 2500f;
		ac.display();
		
		Account ac1 = new Account(43256, "Rajesh Shrestha", 23435f);
		ac1.display();
		
		
		Person p = new Person();
		//p.id = 123;
	}
}
