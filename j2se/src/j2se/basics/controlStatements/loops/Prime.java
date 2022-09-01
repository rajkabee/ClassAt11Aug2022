package j2se.basics.controlStatements.loops;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		int flag=0;
		System.out.println("Enter a number: ");
		int num = new Scanner(System.in).nextInt();
		int i;
		
		for(i=2; i<num; i++) {
			if(num%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num+" is Prime");
		}
		else {
			System.out.println(num+" is Composite");
		}
		
	}
}
