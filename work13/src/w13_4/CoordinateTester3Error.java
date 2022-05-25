package w13_4;

import java.util.Scanner;

public class CoordinateTester3Error {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("좌표는 몇개 : ");
		int n = sc.nextInt();
		
		Coordinate[] a = new Coordinate[n];
		
		for(int i=0;i<a.length;i++)
			a[i].set(5.5, 7.7);
		
		for(int i=0;i<a.length;i++)
			System.out.printf("a[%d] = (%.1f,%.1f)\n",i,a[i].getX(),a[i].getY());
	}

}
