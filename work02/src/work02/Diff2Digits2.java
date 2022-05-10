package work02;

import java.util.Scanner;

public class Diff2Digits2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		
		int diff = a>=b ? a-b:b-a;
		
		System.out.println("두 값의 차는 "+
		(diff<=10 ? "10이하":"11이상") +"입니다.");
	}

}
