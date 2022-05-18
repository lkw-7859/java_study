package work08;

import java.util.Scanner;

public class LinearSearchBottom {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("요소 수 :");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
		}
		System.out.print("찾을 숫자:");
		int key = sc.nextInt();
		
		int i;
		for(i=n-1;i>=0;i--) {
			if(a[i]==key) break;
		}
		
		if(i>=0)
			System.out.println("그 값은 a["+i+"]에 있습니다.");
		else
			System.out.println("해당 값이 존재하지 않습니다.");
	}

}
