package work077;

import java.util.Random;
import java.util.Scanner;

public class ColumnChart {

	public static void main(String[] args) {
		Random rand = new Random();  // 난수생성 객체 생성
		Scanner sc= new Scanner(System.in); // 입력문 객체 생성
		
		System.out.print("요소 수:");
		int n = sc.nextInt(); // 배열의 길이를 입력시켜줌
		int[] a= new int[n]; //변수 n만큼의 길이의 배열 생성
		
		for(int i=0;i<n;i++)
			a[i]=1+rand.nextInt(10);  //생성된 배열에 1~10까지 난수값을 넣어줌
		
		for(int i=10;i>=1;i--) { //10에서 1까지 배열에 값이 있는지 확인하는 말하자면 출력문에 세로를 담당
			for(int j=0;j<n;j++) {   // 배열에 있는 숫자가 i에서 넘어오는 숫자에 해당되는지 확인하는 말하자면 가로를 담당
				if(a[j]>=i)
					System.out.print("* ");
					
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int i=0;i<2*n;i++)
			System.out.print('-');
		
		System.out.println();
		
		for(int i=0;i<n;i++) 
			System.out.print(i%10+" ");
		
		System.out.println();
	}

}
