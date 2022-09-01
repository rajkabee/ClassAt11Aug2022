package j2se.basics.collectionVariables.arrays.arrayLists;

import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(123);
		num.add(234);
		num.add(345);
		num.add(456);
		num.add(567);
		for(int i=0; i<5; i++) {
			System.out.println(num.get(i));
		}
		
	}
}
