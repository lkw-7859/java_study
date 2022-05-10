package work02;

import java.util.Scanner;

public class Diff2Digits1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		
		int diff = a>=b ? a-b:b-a;
		
		if(diff<=10)
			System.out.println("두 값의 차는 10이하입니다.");
		else
			System.out.println("두 값의 차는 11이상입니다.");
	}

}
