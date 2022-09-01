package j2se.basics.controlStatements.loops;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		int i=0;								//initialization
		while(i<5) {							//while(condition)
			System.out.println("Hello World");
			i++;								//iteration
		}
		
		
		
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 1;
		i=1;
		while(i<=n) {
			sum*=i;
			i++;
		}
		System.out.println("Sum of "+n+" natural numbers: "+sum);
	}
}
