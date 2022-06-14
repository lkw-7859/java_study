package w_2_6;

import java.util.Scanner;

public class Year {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("윤년입니다.");
		}
		else {
			System.out.println("윤년이 아닙니다.");
		}
	}

}
