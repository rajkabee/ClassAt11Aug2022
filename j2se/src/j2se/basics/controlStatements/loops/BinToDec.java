package j2se.basics.controlStatements.loops;
import java.util.Scanner;
public class BinToDec {
	public static void main(String[] args) {
		System.out.println("Enter a binary number: ");
		Scanner sc = new Scanner(System.in);
		int bin = sc.nextInt();
		int pow = 1;
		int dec = 0;
		while(bin!=0) {
			int rem = bin%10;
			dec+=rem*pow;
			pow*=2;
			bin/=10;
		}
		System.out.println("Decimal Value: "+dec);
		
	}
}
