package w_2_5;

public class EvenOdd {

	public static void main(String[] args) {
		int i = 1;
		int cnt = 0;
		int num = 10;
		while(true) {
			if(cnt==0)
				System.out.println(i);
			if(cnt==1 && i%2==1)
				System.out.println(i);
			
			if(cnt==2 && i%2==0)
				System.out.println(i);
			
			if(i==10) {
				i=0; cnt++;
				if(cnt==1)
					System.out.println("홀수 출력");
				else if(cnt==2)
					System.out.println("짝수 출력");
			}
			i++;
			if(cnt==3) break;
		}
	}

}
