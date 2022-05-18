package work08;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandY {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n=11;
		
		while(n>10) {
			System.out.print("요소 수:");
			n=sc.nextInt();
		}
		
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			int j;
			do {
				j=0;
				a[i]=1+r.nextInt(10);
				for(;j<i;j++)
					if(a[j]==a[i]) break;
			}while(j<i);
		}
		
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

}
