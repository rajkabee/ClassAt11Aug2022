package j2se.basics.controlStatements.conditionalStatements;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		int age;
		System.out.println("How old are you?");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if(age>60) {
			System.out.println("You are a senior citizen!");
		}
		else if(age>18) {
			System.out.println("You are a valued citizen of our country!");
		}
		else {
			System.out.println("You are a minor!");
		}
		
	}
}
