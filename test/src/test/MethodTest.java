package test;

import java.util.Scanner;

public class MethodTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("구구셈 몇단 : ");
			int dan=sc.nextInt();
			if(!(dan==0 ||dan==1)) {
				for(int i=1;i<=9;i++) 
					System.out.println(dan+" * "+i+" = "+dan*i);
			}
			else { 
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}

}
