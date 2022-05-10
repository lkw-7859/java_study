package work02;

import java.util.Scanner;

public class Diff2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a : "); int a = sc.nextInt();
		System.out.print("정수 b : "); int b = sc.nextInt();
		
		int diff;
		if(a>=b)
			diff=a-b;
		else
			diff=b-a;
		
		System.out.println("두 값의 차는 "+diff+"입니다.");
	}

}
