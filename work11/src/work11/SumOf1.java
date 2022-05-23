package work11;

import java.lang.Object;
import java.util.Scanner;

public class SumOf1 extends Object {

	static int sumOf(int[] a) {
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		return sum;
	}
	
	static int sumOf1(int[] a) {
		int sum=0;
		for(int i : a)
			sum+=i;
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수: ");
		int num = sc.nextInt();
		int[] x = new int[num];
		
		for(int i=0;i<num;i++) {
			System.out.print("x["+i+"] :");
			x[i]=sc.nextInt();
		}
		
		System.out.println("모든 요소의 합은 "+sumOf(x)+"입니다.");
	}
}
