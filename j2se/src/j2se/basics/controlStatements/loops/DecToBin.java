package j2se.basics.controlStatements.loops;
import java.util.Scanner;
public class DecToBin {
	public static void main(String[] args) {
		System.out.println("Enter a Decimal Value: ");
		Scanner sc = new Scanner(System.in);
		int dec = sc.nextInt();
		int revBin = 1;
		while(dec!=0) {
			int rem = dec%2;
			revBin = revBin*10+rem;
			dec/=2;
		}
		int bin=0;
		while(revBin>1) {
			int rem = revBin%10;
			bin = bin*10+rem;
			revBin/=10;
		}
		//bin/=10;
		System.out.println("Binary Value: "+bin);
	}
}
