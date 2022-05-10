package work01;

import java.util.Scanner;

public class HomeWork1_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = sc.nextInt();
		
		int abs = (n>=0) ? n:-n;
		System.out.println("절댓값은 "+abs+"입니다");
	}
}
