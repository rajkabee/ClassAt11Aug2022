package j2se.basics.collectionVariables.arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int num[] = {98, 76, 54, 32, 21};
		int i, j, k;
		for(i=0; i<4; i++) {
			for(j=i+1; j<5; j++) {
				for(k=0; k<5; k++) {
					System.out.print(num[k]+"\t");
				}
				System.out.println();
				if(num[i]>num[j]) {
					num[i]+=num[j];
					num[j]=num[i]-num[j];
					num[i]-=num[j];
				}
			}
		}
		for(k=0; k<5; k++) {
			System.out.print(num[k]+"\t");
		}
	}
}
