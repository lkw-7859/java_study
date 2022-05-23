package test;

import java.util.Scanner;

public class MethodTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		while(true) {
			System.out.print("입력 : ");
			x=sc.nextInt();
			if((x>=2)&&(x<=9)) {
				for(int i=1;i<=9;i++) 
					System.out.println(x+" * "+i+" = "+x*i);
			}
			else { 
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}

}
