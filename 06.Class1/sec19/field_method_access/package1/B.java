package sec19.field_method_access.package1;

public class B {
	public B() {

	A a = new A();
	
	a.field1 = 1;
	a.field2 = 1;
//	a.field3 = 1; // private라 다른 패키지에서 사용 불가
	
	a.method1();
	a.method2();
//	a.method3(); // private라 다른 패키지에서 사용 불가
	
	}
}
