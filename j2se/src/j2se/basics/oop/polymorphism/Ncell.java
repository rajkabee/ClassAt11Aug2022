package j2se.basics.oop.polymorphism;

public class Ncell extends Sim {

	@Override
	public void call() {
		System.out.println("calling using Ncell...");
	}

	@Override
	public void data() {
		System.out.println("Surfing internet using ncell!");
	}

}
