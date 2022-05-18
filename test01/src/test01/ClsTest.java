package test01;

import java.util.Scanner;

public class ClsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자를 입력하세요~");
			int x = sc.nextInt();
			
			if(x%2==0) clearScreen();	 
		}	
	}

	
	public static void clearScreen() {  
		for (int i = 0; i < 25; i++)
		      System.out.println("");
	}
}
