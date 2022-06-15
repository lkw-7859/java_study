package w_2_7;

public class CompleteNum {

	static boolean check(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) sum+=i;
		}
		if(sum==num) return true;
		
		return false;
	}
	
	static void printNum(int num) {
		System.out.println("완전수 : "+num);
		System.out.print("[");
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				if(i==num) {
					System.out.print(i);
					break;
				}
				System.out.print(i+", ");
			}
		}
		System.out.println("]");
	}
	
	public static void main(String[] args) {
		for(int i=2;i<=500;i++) {
			if(check(i)) printNum(i);
		}
	}
	

}
