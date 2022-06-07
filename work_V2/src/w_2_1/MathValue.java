package w_2_1;

public class MathValue {

	public static void main(String[] args) {
		
		double a = -10;
		System.out.println("절댓값 a : " + Math.abs(a)); //절댓값
		
		System.out.println("난수 발생 : " + (int)(Math.random() * 100)); // 0~99사이의 난수 발생
		
		a = 10; double b = 100;
		System.out.println("a와 b중 더 큰 수 : "+ Math.max(a, b));   // 두개의 수 중 큰 수 출력
		System.out.println("a와 b중 더 작은 수 : "+ Math.min(a, b));  // 두개의 수 중 작은 수 출력
		
		a = 10.5658;
		System.out.println("실수 a를 첫번째 소수점 반올림 : " + Math.round(a)); 
		
		System.out.println("실수 a보다 작은 정수중 가장 근접한 값 : " + Math.floor(a));
		System.out.println("실수 a보다 큰 정수 중 가장 근접 한 값 : " + Math.ceil(a));
		
		a = 10; b= 4;
		double c = Math.pow(a, b);
		System.out.println("a의 b제곱 : " + c); // a의 b제곱한 c를 출력
		
		System.out.println("c의 제곱근 : " + Math.sqrt(c)); //c의 제곱근 출력	
	}
}
