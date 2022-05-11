package work03;

//읽은 개수만큼 *와 +를 교대로 표시(방법2)
import java.util.Scanner;

public class PutAsteriskAlt2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 개를 표시할까요? : ");
		int n=sc.nextInt();
		if(n>0) {
			int i=0;
			while(i<n/2) {
				System.out.print("*+");
				i++;
			}
			if(n%2==1)
				System.out.print('*');
			
			System.out.println();
		}
	}

}
