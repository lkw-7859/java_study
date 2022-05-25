package w13_5;

import java.util.Scanner;

public class CoordinateTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("좌표 p를 입력하세요.");
		System.out.print("X좌표: "); double x = sc.nextDouble();
		System.out.print("Y좌표: "); double y = sc.nextDouble();
		
		Coordinate p =new Coordinate(x,y);
		System.out.println("p = "+p);
		Coordinate q = new Coordinate(p);
		
		System.out.println("q와 p를 동일 좌표로 만들었습니다.");
		System.out.println("q = "+q);
		
		if(p.equals(q))
			System.out.println("p와 q가 같습니다.");
		else
			System.out.println("p와 q가 다릅니다.");
		
		Coordinate c1 = new Coordinate();
		Coordinate c2 = new Coordinate(1.1,2.2);
		
		System.out.println("c1 = "+c1);
		System.out.println("c2 = "+c2); //본래는 c2의 주솟값이 출력되어야 하지만 Coordinate 클래스내에서 toString()함수를 재정의 했기에 좌표값이 출렷된다.
		Coordinate[] a = new Coordinate[3];
		for(int i=0;i< a.length;i++)
			a[i]=new Coordinate();
		
		for(int i=0;i<a.length;i++)
			System.out.println("a["+i+"] = "+a[i]);
	}

}
