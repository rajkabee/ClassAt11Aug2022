package j2se.basics.collectionVariables.arrays;

public class MinMax {
	public static void main(String[] args) {
		int num[] = {7,5,6,9,2};
		int i, min, max;
		min = num[0];
		max = num[0];
		for(i=1; i<5; i++) {
			if(min>num[i]) {
				min = num[i];
			}
			if(max<num[i]) {
				max = num[i];
			}
		}
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
	}
}
