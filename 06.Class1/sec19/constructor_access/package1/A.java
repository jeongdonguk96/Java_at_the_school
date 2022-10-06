package sec19.constructor_access.package1;

public class A {
	
	// 멤버변수
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("a");
	
	
	//생성자
	public A(boolean b) {}
	
	A(int b) {}
	
	private A(String s) {}
	
}
