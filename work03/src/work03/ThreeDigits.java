package work03;

import java.util.Scanner;

public class ThreeDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		
		do {
			System.out.print("세자리의 정숫값: ");
			x=sc.nextInt();
		}while(x<100||x>999);
		
		System.out.print("입력한 값은 "+x+"입니다");
	}

}
