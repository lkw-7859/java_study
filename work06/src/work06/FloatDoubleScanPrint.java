package work06;

import java.util.Scanner;

public class FloatDoubleScanPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("변수 x는 float 형입니다. 변수 y는 double형입니다.");
		System.out.print("x: ");
		float x = sc.nextFloat();
		System.out.print("y: ");
		double y = sc.nextDouble();
		
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}

}
