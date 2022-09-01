package j2se.basics.controlStatements.conditionalStatements;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		System.out.println("Cafe Menu");
		System.out.println("a. Americano");
		System.out.println("b. Mochaccino");
		System.out.println("c. Cappuccion");
		System.out.println("d. Cafe Latte");
		System.out.println("e. Hot Chocolate");
		Scanner sc = new Scanner(System.in);
		char choice = sc.next().charAt(0);
		switch(choice) {
		case 'a':
			System.out.println("Americano is served!");
			break;
		case 'b':
			System.out.println("Mochaccino is served!");
			break;
		case 'c':
			System.out.println("Cappiccino is served!");
			break;
		case 'd':
			System.out.println("Cafe Latte is served!");
			break;
		case 'e':
			System.out.println("Hot chocolate is served!");
			break;
		default:
			System.out.println("Invalid Choice!");
		}
		
	}
}
