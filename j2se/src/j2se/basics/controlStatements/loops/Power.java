package j2se.basics.controlStatements.loops;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		System.out.println("Enter the base: ");
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		System.out.println("Enter the power: ");
		int pow = sc.nextInt();
		int result = 1;
//		while(pow!=0) {
//			result*=base;
//			pow--;
//		}
		int i = 0;
		while(i<pow) {
			result*=base;
			i++;
		}
		System.out.println("Result: "+result);
	}
}
