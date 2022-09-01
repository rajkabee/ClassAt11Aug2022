package j2se.basics.controlStatements.loops.TwpDArray;

import java.util.Scanner;

public class SumOfElementsOfAnArray {
	public static void main(String[] args) {
		int [] num = {5,3,7,9,14};
		int i, sum;
		//Scanner sc = new Scanner(System.in);
		sum=0;
		for(i=0; i<5; i++) {
			sum+=num[i];
		}
		System.out.println("Sum: "+sum);
		
	}
}
