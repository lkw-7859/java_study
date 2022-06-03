package work20;

import java.util.Scanner;

public class PrintDouble {

	static void printDouble(double x, int p, int w) {
		System.out.printf(String.format("%%%d.%df", w,p),x);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수값 : ");
		double x = sc.nextDouble();
		
		System.out.print("전체 자릿수 : ");
		int w = sc.nextInt();
		
		System.out.println("소수점 이하 자릿수 : ");
		int p = sc.nextInt();
		
		printDouble(x,p,w);
		System.out.println();
	}

}
