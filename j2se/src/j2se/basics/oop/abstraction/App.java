package j2se.basics.oop.abstraction;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("Make a choice: ");
		System.out.println(" a. add \n b. subtract \n c. multiply \n d. divide");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int res=0;
		CalculatorImpl calc = new CalculatorImpl();
		switch(ch) {
		case 'a':
			res = calc.add(a,b);
			break;
		case 'b':
			res = calc.subtract(a,b);
			break;
		case 'c':
			res = calc.multiply(a,b);
			break;
		case 'd':
			res = calc.divide(a,b);
			break;
			
		}
		System.out.println("Result: "+res);
	}
}
