package work01;

import java.util.Scanner;

public class HomeWork1_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 : ");
		int x = sc.nextInt();
		
		if(x<0) {
			System.out.println("이 값은 음의 값입니다.");
		}
	}

}
