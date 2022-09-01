package j2se.basics.methods;

import java.util.Scanner;

public class PowerMethod {
	public static void main(String[] args) {
		int b, p, res;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n= sc.nextInt();
		if(isPrime(n)) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Composite");
		}
		
		System.out.println("Enter the base and the power: ");
		
		b=sc.nextInt();
		p=sc.nextInt();
		res = power(b,p);
		System.out.println("Result: "+res);
	}
	static boolean isPrime(int num) {
		for(int i=2; i<=(num/2); i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	private static int power(int b, int p) {
		int res=1;
		while(p!=0) {
			res*=b;
			p--;
		}
		return res;
	}
	
	
}
