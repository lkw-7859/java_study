package chap07;

public class Computer extends Calculator{
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCirle() 실행");
		return Math.PI*r*r;
	}
}
