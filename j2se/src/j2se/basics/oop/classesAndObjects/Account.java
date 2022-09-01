package j2se.basics.oop.classesAndObjects;

public class Account {
	int acNumber;
	String holdersName;
	float balance;
	
	
	
	
	public Account(int acNumber, String holdersName, float balance) {
		this.acNumber = acNumber;
		this.holdersName = holdersName;
		this.balance = balance;
	}

	public Account() {
	}


	public void display() {
		System.out.println("Account number: "+
				acNumber+
				"\nAccount Holders Name: "+
				holdersName+"\nBAlance: "+
				balance);
	}
}
