package chap04;

import java.util.Scanner;

public class ForSumExample {

	public static void main(String[] args) {
		int sum=0;
		/*
		System.out.println("몇 부터?");
		Scanner f = new Scanner(System.in);
		System.out.println("몇 까지?");
		Scanner t = new Scanner(System.in);
		
		int from = f.nextInt();
		int to = t.nextInt();
		
		*/
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		
		System.out.print("sum = "+ sum);
	}

}
