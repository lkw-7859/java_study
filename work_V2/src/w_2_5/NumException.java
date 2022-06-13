package w_2_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 : ");
			try {
				int x = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("숫자를 입력해라");
				break;
			}
		}
	}

}
