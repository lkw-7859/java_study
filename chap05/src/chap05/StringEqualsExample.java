package chap05;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1="이기웅";
		String strVar2="이기웅";
		
		if(strVar1==strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		}
		else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3=new String("이기웅");
		String strVar4=new String("이기웅");
		
		if(strVar3==strVar4) {       // 주소값을 비교
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}
		else {
			System.out.println("strVar3과 strVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) { // 주소에 있는 문자열을 비교
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
	}

}
