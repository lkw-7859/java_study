package w_2_3;

import java.util.Scanner;

public class Shift {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("지정값 : ");
		int x = sc.nextInt();
		System.out.print("시프트할 방향을 입력하세요 1)왼쪽 2)오른쪽 :");
		int dir = sc.nextInt();
		
		System.out.print("얼만큼 시프트 하시겠습니까? : ");
		int num = sc.nextInt();
		
		if(dir==1) x<<=num;
		else x>>=num;
		
		System.out.println("시프트한 결과 : "+x);
	}

}
