package work09;

import java.util.Random;
import java.util.Scanner;

public class DayCAI2 {

	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] dayKorean = {"일","월","화","수","목","금","토",};
		String[] dayEnglish = {"sunday","monday","tuesday","wednesday",
				"thursday","friday","saturday",};
		
		System.out.println("요일명을 영어 소문자로 입력하시오.");
		
		int retry;
		int last = -1;
		
		do {
			int day;
			do {
				day=r.nextInt(7);
			}while(day==last);
			last = day;
			
			int action;
			
			do {
				System.out.print(dayKorean[day]+"요일:");
				String s= sc.next();
				
				if(s.equals(dayEnglish[day])) {
					System.out.println("정답입니다.");
					break;
				}
				System.out.println("틀렸습니다.");
				do {
					System.out.print("어떻게 할까요? 1..재입력 / 0..정답 보기:");
					action = sc.nextInt();
				}while(action!=0&&action!=1);
				
				if(action==0)
					System.out.println(dayKorean[day]+"요일은\""+
							dayEnglish[day]+"\"입니다.");
				
			}while(action==1);
			System.out.print("다시 한번? 1...YES/0...NO:");
			retry=sc.nextInt();
		}while(retry==1);
	}

}
