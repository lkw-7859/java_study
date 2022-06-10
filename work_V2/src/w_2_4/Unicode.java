package w_2_4;

import java.util.Scanner;

public class Unicode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++) {
			System.out.format("0x%04x ",(int)str.charAt(i));
		}
	}

}
