package p240;

public class ClassName {
	//인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//정적필드와 메소드
	static int field2;
	static void method2() {}
	
	static {
		//field1=10;
		//method1();
		field2=10;
		method2();
	}
	
	static void Method3(){
		//this.field1=10;
		//this.method1();
		field2=10;
		method2();
	}
}
