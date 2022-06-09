package w_2_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("10진수를 입력하시오 : ");
		int x = sc.nextInt();
		System.out.println("2진수 변환");
		List<Integer> list = new ArrayList();
		
		while(x!=0) {
			list.add(x%2);
			x/=2;
		}
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i));
		}
	}
}
