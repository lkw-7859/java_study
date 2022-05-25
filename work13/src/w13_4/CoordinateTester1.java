package w13_4;

import java.util.Scanner;

public class CoordinateTester1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표: "); double x = sc.nextDouble();
		System.out.print("Y좌표: "); double y = sc.nextDouble();
	
		Coordinate p =new Coordinate(x, y);
		System.out.println("p = (" + p.getX() + ", "+p.getY()+")");
		Coordinate q = p; // 객체변수 q가 p의 주소를 같이 쓰게됨
		q.set(9.9, 9.9); // q만 값을 세팅해줘도 같은 주소를 쓰고있는 p에서도 똑같이 값이 세팅됨 
		System.out.println("p = (" + p.getX() + ", "+p.getY()+")");
		System.out.println("q = (" + q.getX() + ", "+q.getY()+")");
		
	}

}
