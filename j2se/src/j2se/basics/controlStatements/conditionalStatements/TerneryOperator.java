package j2se.basics.controlStatements.conditionalStatements;

import java.util.Scanner;

public class TerneryOperator {
	public static void main(String[] args) {
		System.out.println("Enter Password: ");
		Scanner sc = new Scanner(System.in);
		String password = sc.next();
		String access = password.equalsIgnoreCase("password")?"allowed":"blocked";
		System.out.println("you are "+access);
		
		boolean x = 1!=1?true:false;
		System.out.println(x);
	}
}
