package j2se.basics.oop.polymorphism;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		int x=5, y=7, z=13;
		int sum1 = add(x,y);
		int sum2 = add(x,y,z);
		System.out.println("sum1: "+sum1+"\n sum2: "+sum2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static int add(int x, int y, int z) {
		return x+y+z;
	}

	private static int add(int x, int y) {
		return x+y;
	}
	
	
}
