package ex05;

public class AnonymousTest1 {

	public static void main(String[] args) {
		Car fooCar = new Car() {
			public void run() {
				System.out.println("달려라");
			}
			public void stop() {
				System.out.println("멈춰");
			}
		};
		
		fooCar.run();
		fooCar.stop();
	}

}
