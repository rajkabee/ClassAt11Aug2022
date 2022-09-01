package j2se.basics.controlStatements.loops;

import java.util.Scanner;

public class FibonacctCount {
	public static void main(String[] args) {
		int n1=0, n2=1, n3, counter=0;
		System.out.println("Enter the no. of values: ");
		int n = new Scanner(System.in).nextInt();
		while(counter<n) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
			counter++;
		}
		
	}
}
