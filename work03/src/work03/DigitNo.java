package work03;

//양의 정숫값을 읽어 자릿수를 표시한다.
import java.util.Scanner;

public class DigitNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("양의 정숫값의 자릿수를 표시합니다.");
		int x;
		
		do {
			System.out.print("양의 정숫값: ");
			x=sc.nextInt();
		}while(x<=0);
		
		int digit=0; //자릿수
		while(x>0) {
			digit++; //자릿수를 증가
			x/=10;  //x를 10으로 나눔
		}
		
		System.out.println("입력한 숫자는 "+digit+"자리입니다.");
	}

}
