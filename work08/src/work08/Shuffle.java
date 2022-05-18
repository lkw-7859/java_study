package work08;

import java.util.Random;
import java.util.Scanner;

public class Shuffle {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc= new Scanner(System.in);
		
		System.out.print("요소 수:");
		int n=sc.nextInt();
		int[] a= new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<2*n;i++) {
			int idx1 = r.nextInt(n);
			int idx2 = r.nextInt(n);
			
			int t=a[idx1];
			a[idx1]=a[idx2];
			a[idx2]=t;
		}
		
		System.out.println("요소를 섞었습니다.");
		for(int i=0;i<n;i++)
			System.out.println("a["+i+"]="+a[i]);
	}

}
