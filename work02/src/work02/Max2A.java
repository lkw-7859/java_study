package work02;

import java.util.Scanner;

public class Max2A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("실수 a : "); double a = sc.nextDouble();
		System.out.print("실수 b : "); double b = sc.nextDouble();
		
		double max;
		
		if(a>b)
			max=a;
		else
			max=b;
		
		System.out.println("큰 쪽의 값은 "+max+"입니다.");
	}

}
