package j2se.basics.methods;

public class JavaMethodsExample {
	public static void main(String[] args) {
		int a=5, b=7;
		int res;
		res = add(a,b);
		System.out.println("Sum: "+res);
		diff(a,b);
		float p = pi();
		System.out.println("Pi: "+p);
		greet();
	}
	static void greet() {
		System.out.println("Hello friends!");
	}
	static float pi() {
		return 3.1415f;
	}
	static void diff(int a, int b) {
		int d;
		if(a>b) {
			d=a-b;
		}
		else {
			d=b-a;
		}
		System.out.println("Difference: "+d);
	}
	static int add(int a, int b) {
		int c = a+b;
		return c;
	}
}
