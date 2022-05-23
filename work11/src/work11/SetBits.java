package work11;

import java.util.Scanner;

public class SetBits {

	static void printBits(int x) {
		for(int i=31;i>=0;i--) {
			System.out.print(((x>>>i &1)==1) ? '1':'0');
		}
	}
	
	static int setN(int x,int pos,int n) {
		return x | (~(~0<<n)<<pos);
	}
	
	static int resetN(int x,int pos,int n) {
		return x & ~(~(~0<<n)<<pos);
	}
	
	static int inverseN(int x,int pos,int n) {
		return x ^ (~(~0<<n)<<pos);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수의 pos번째 비트부터 n개 비트를 변경합니다.");
		System.out.print("x : "); int x = sc.nextInt();
		System.out.print("pos : "); int pos = sc.nextInt();
		System.out.print("n : "); int n = sc.nextInt();
		
		System.out.print("x	       = "); printBits(x);
		System.out.print("\nset(x,pos)     = "); printBits(setN(x,pos,n));
		System.out.print("\nreset(x,pos)   = "); printBits(resetN(x,pos,n));
		System.out.print("\ninverse(x,pos) = "); printBits(inverseN(x,pos,n));
		System.out.println();
	}
}
