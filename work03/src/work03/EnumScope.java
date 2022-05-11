package work03;

import java.util.Scanner;

public class EnumScope {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 A: "); int a=sc.nextInt();
		System.out.print("정수 B: "); int b=sc.nextInt();
		
		if(a>b) {
			int t=a;
			a=b;
			b=t;
		}
		
		for(int i=a;i<=b;i++) {
			System.out.print(i+" ");
		}
	}

}
