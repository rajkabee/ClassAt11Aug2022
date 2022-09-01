package j2se.basics.controlStatements.loops;
import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		//System.out.println("Enter a number: ");
		//int num = new Scanner(System.in).nextInt();
		for(int num=2; num<=10; num++) {
			for(int i=1; i<11; i++) {
				System.out.println(num+" x " +i+" = "+ (num*i));
			}
		}
		for(int num=1; num<=5; num++) {
			for(int i=1; i<=6-num; i++) {
				System.out.print(num+"\t");
			}
			System.out.println();
		}
	}
}
