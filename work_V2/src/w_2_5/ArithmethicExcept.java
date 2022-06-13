package w_2_5;

public class ArithmethicExcept {

	public static void main(String[] args) {
		int x=10 , y=0;
		
		try {
			x/=y;
		}catch(ArithmeticException e) {
			System.out.println("잘못된 수식입니다.");
		}
	}

}
