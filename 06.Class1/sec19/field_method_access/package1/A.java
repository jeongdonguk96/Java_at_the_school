package sec19.field_method_access.package1;

public class A {

	// 멤버변수
	public int field1;
	int field2;
	private int field3;
	
	// 생성자
	// 같은 클래스에서는 모든 접근제어자 사용 가능
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}

	// 매서드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
}
