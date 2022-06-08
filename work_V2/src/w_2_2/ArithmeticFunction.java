package w_2_2;

import java.util.Scanner;

public class ArithmeticFunction {

	static void add(int x,int y) {
		System.out.println("x + y = "+(x+y));
	}
	
	static void sub(int x,int y) {
		System.out.println("x - y = "+(x-y));
	}
	
	static void mul(int x,int y) {
		System.out.println("x * y = "+(x*y));
	}
	
	static void div(int x,int y) {
		System.out.println("x / y = "+(x/y) + " 나머지는 "+(x%y)+"입니다." );
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 x를 입력하세요 : "); int x = sc.nextInt();
		System.out.print("정수 y를 입력하세요 : "); int y = sc.nextInt();
		
		add(x,y);
		sub(x,y);
		mul(x, y);
		div(x, y);
	}
}
