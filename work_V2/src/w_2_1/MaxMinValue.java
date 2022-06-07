package w_2_1;

import java.util.Scanner;

public class MaxMinValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean keep = true;
		while(keep) {
			System.out.println("데이터 타입을 고르시오.");
			System.out.print("1) byte  2) short  3) int  4) long  5) char : ");
			int x = sc.nextInt();
				
			switch(x) {
			case 0: System.out.println("프로그램을 종료합니다."); keep = false; break;
			case 1: System.out.println("byte타입 최소 최대 범위 : " + Byte.MIN_VALUE + " ~ "+ Byte.MAX_VALUE); break;
			case 2: System.out.println("short타입 최소 최대 범위 : " + Short.MIN_VALUE + " ~ "+ Short.MAX_VALUE); break;
			case 3: System.out.println("int타입 최소 최대 범위 : " + Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE); break;
			case 4: System.out.println("long타입 최소 최대 범위 : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE); break;
			case 5 :System.out.println("char타입 최소 최대 범위 : " + (int)Character.MIN_VALUE + " ~ " + (int)Character.MAX_VALUE); break;

			default : System.out.println("다시 입력하세요");	
			}
			System.out.println();
		}
	}

}
