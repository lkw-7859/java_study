package work08;

import java.util.Random;
import java.util.Scanner;

public class ArrayRandX {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 :");
		int n= sc.nextInt();
		int[] a = new int[n];
		
		a[0]=1+r.nextInt(10);
		
		for(int i=1;i<n;i++) {
			do {
				a[i]=1+r.nextInt(10);
			}while(a[i]==a[i-1]);
		}
		
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

}
