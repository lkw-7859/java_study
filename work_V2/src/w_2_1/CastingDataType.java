package w_2_1;

public class CastingDataType {

	public static void main(String[] args) {
		int a1 = 128;
		byte a2 = (byte)a1;
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println();
		
		double b1 = 10.235;
		int b2 = (int)b1;
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println();
		
		char c1 = 'A';
		int c2 = c1;
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println();
		
		
		char c3 = '가';
		System.out.println("c3 = "+ c3);
		System.out.println("c3의 유니코드 = " + (int)c3);
		
		double d1 = Math.PI;
		float d2 = (float)d1;
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println();
		
	}

}
