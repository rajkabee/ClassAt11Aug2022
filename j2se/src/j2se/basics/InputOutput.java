package j2se.basics;

import java.util.Scanner;

public class InputOutput {
	public static void main(String[] args) {
//		int age;
//		System.out.println("Enter your age: ");
//		Scanner sc = new Scanner(System.in);
//		age = sc.nextInt();
//		System.out.println("so, you are "+age+" years old!");
//		System.out.println(String.format("so, you are %dyears old!", age));
	
		/*
		 * System.out.println("What is your name? "); Scanner sc = new
		 * Scanner(System.in); String name = sc.nextLine();
		 * System.out.println("Hello "+name+"!");
		 */	
		char ch;
		ch = 'a';
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		System.out.println(ch);
		
		
		
		
		
		
		
	}
}
