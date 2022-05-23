package work11;

import java.util.Scanner;

public class AryIns {

	static void aryIns(int[] a,int idx,int x) {
		if(idx>=0 && idx<a.length) {
			for(int i=a.length-1;i>idx;i--)
				a[i]=a[i-1];
			
			a[idx]=x;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수:");
		int num = sc.nextInt();
		int[] a = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("a["+i+"]: ");
			a[i]=sc.nextInt();
		}
		
		System.out.print("삽입할 요소의 인덱스: ");
		int idx = sc.nextInt();
		
		System.out.print("삽입할 값: ");
		int n= sc.nextInt();
		
		aryIns(a, idx, n);
		
		for(int i=0;i<num;i++)
			System.out.println("a["+i+"] = "+a[i]);
	}
}
