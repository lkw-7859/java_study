package work03;

//읽은 정숫값의 부호를 판정해서 표시(원하는 만큼 반복)
import java.util.Scanner;

public class SignRepeat {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int retry;
		
		do {
			System.out.print("정숫값: ");
			int n=sc.nextInt();
			
			if(n>0)
				System.out.println("이 값은 양수입니다.");
			else if(n<0)
				System.out.println("이 값은 음수입니다.");
			else
				System.out.println("이 값은 0입니다.");
			
			System.out.print("다시 한번? 1=YES / 0=NO:");
			retry=sc.nextInt();
			
			
		}while(retry==1);
	}

}
