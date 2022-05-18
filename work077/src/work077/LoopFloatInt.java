package work077;

public class LoopFloatInt {

	public static void main(String[] args) {
		System.out.println("float        int ");
		System.out.println("---------------------------");
		
		float x = 0.0F;
		for(int i=0;i<=1000;i++,x+=0.001f) {
			System.out.printf("%.7f   %.7f\n",x,(float)i/1000);
		}
	}

}
