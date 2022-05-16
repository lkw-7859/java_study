package test;

public class TwoDiff {

	public static void main(String[] args) {
		int a=5;
		double b=17;
		
		int k=(a>=b) ? (int)(a-b):(int)(b-a);
		
		System.out.println("a와b의 차이 : "+k);
	}

}
