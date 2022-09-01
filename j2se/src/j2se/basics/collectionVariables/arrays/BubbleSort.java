package j2se.basics.collectionVariables.arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int num[] = {9,8,7,6,5};
		int i,j,k, t;
		for(i=0; i<4; i++) {
			for(j=0; j<4-i; j++) {
				for(k=0; k<5; k++) {
					System.out.print(num[k]+"\t");
				}
				System.out.println();
				if(num[j]>num[j+1]) {
					//swap
					t = num[j];
					num[j] = num[j+1];
					num[j+1] = t;
				}
			}
		}
		
		for(k=0; k<5; k++) {
			System.out.print(num[k]+"\t");
		}
		
	}
}
