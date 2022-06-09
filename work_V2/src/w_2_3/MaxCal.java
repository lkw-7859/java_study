package w_2_3;

import java.util.Scanner;

public class MaxCal {

	static int max(int a,int b,int c) {
		return (a>b) ? (a>c) ? a:c : (b>c) ? b:c;
		
	}
	
	static int min(int a,int b, int c) {
		return (a>b) ? (b>c) ? c:b :(a>c) ? c:a;
	}
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("x를 입력하세요 : "); int x = sc.nextInt(); 
		 System.out.print("y를 입력하세요 : "); int y = sc.nextInt(); 
		 System.out.print("z를 입력하세요 : "); int z = sc.nextInt(); 
		 
		 
		 System.out.println("x, y, z 값에서 최대값은 "+max(x,y,z)+
				 			", 최소값은 "+min(x,y,z));
	}

}
