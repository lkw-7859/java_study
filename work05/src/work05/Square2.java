package work05;

import java.util.Scanner;

public class Square2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정숫값:");
		int n=sc.nextInt();
		
		for(int i=1,j=1;i<=n;i++,j=i*i)
			System.out.println(i+"의 제곱은 "+j+"입니다.");
	}

}
