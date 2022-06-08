package w_2_2;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		if(year%2==0) System.out.println("짝수해입니다.");
		else System.out.println("홀수해입니다.");
		
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0)
			System.out.println("윤년입니다.");
		else
			System.out.println("윤년이 아닙니다.");
	}

}
