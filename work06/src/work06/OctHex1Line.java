package work06;

import java.util.Scanner;

public class OctHex1Line {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int x =sc.nextInt();
		
		System.out.printf("8진수는 %o이고 16진수는 %x입니다.\n",x,x);
	}

}
