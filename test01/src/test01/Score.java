package test01;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score;
		int cnt=5;
		int max=0,min=100,sum=0;
		while(cnt-->0) {
			System.out.print("점수를 입력하세요 : ");
			score=sc.nextInt();
			if(score>max) max=score;
			if(score<min) min=score;
			sum+=score;
		}
		double avg=(double)sum/5;
		System.out.println("총점은 : "+sum+"입니다.");
		System.out.println("평균은 : "+String.format("%.1f", avg)+"입니다.");
		System.out.println("최고점수는 : "+max+"입니다.");
		System.out.println("최저점수는 : "+min+"입니다.");
	}

}
