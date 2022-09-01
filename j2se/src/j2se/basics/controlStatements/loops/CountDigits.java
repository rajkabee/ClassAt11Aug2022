package j2se.basics.controlStatements.loops;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int count = 0;
		while(num!=0) {
			count++;
			num/=10;
		}
		System.out.println("No. of digits: "+count);
	}
}
