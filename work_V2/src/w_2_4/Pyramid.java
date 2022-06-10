package w_2_4;

import java.util.Scanner;

public class Pyramid {

	static void Star(int s) {
		for(int i=0;i<s;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("높이값 : "); int x = sc.nextInt();
		
		System.out.println("Ver_1");
		for(int i=0;i<x;i++) {
			Star(i+1);
		}
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("Ver_2");
		
		for(int i=x;i>=0;i--) {
			Star(i);
		}
	}

}
