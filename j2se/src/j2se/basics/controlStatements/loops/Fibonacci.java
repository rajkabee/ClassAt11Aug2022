package j2se.basics.controlStatements.loops;
import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		int n1=0, n2=1, n3;
		System.out.println("Enter the range: ");
		int n = new Scanner(System.in).nextInt();
		while(n1<=n) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
	}
}
