package w_2_3;

public class Diff {

	public static void main(String[] args) {
		int a=0,b=0, cnt=10;
		System.out.println("전위 | 후위");
		while(cnt-->=0) {
			System.out.printf("%2d%6d\n",++a,b++);
		}
	}

}
