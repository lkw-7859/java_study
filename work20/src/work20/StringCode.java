package work20;

import java.util.Scanner;

public class StringCode {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열s : ");
		String s= sc.next();
		
		for(int i=0;i<s.length();i++)
			System.out.printf("s[%d] = %c %4x \n",i,s.charAt(i),(int)s.charAt(i));
	}

}
