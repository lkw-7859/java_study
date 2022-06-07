package w_2_1;

public class AtoZ_atoz {

	public static void main(String[] args) {
		for(char c = 'A';c<='Z';c++) {
			System.out.println("대문자 c : " + c);
			System.out.println("대문자 c의 숫자값 : " + (int)c);
			System.out.println();
		}
		
		for(char c = 'a';c<='z';c++) {
			System.out.println("소문자 c : " + c);
			System.out.println("소문자 c의 숫자값 : " + (int)c);
			System.out.println();
		}
	}

}
