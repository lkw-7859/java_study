package work01;

import java.util.Scanner;

public class HomeWork1_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변수 A : ");   int a = sc.nextInt();
		System.out.print("변수 B : ");   int b = sc.nextInt();
		
		if(a>b)
			System.out.println("a가 크다.");
		else if(a<b)
			System.out.println("b가 크다.");
		else
			System.out.println("a와 b기 깉다.");
	}

}
