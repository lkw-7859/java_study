package w_2_3;

public class Except2 {

	public static void main(String[] args) {
		for(int i=50;i<=100;i++) {
			if(i%3==0) {
				if(i%2==0) {
					System.out.println("제외"); continue;
				}
			}
			/*
			if(i%6==0) {
				System.out.println("제외"); continue;
			}*/
			
			System.out.println(i);
		}
	}

}
