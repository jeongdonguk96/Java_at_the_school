package sec01_nested_class;

public class NestedTest {

	public static void main(String[] args) {
		
		A a = new A();
		A.B b = a.new B();
		b.field1 = 10;
		b.method1();
		
		A.C c = new A.C(); 
		c.field1 = 5;
		c.method1();
		A.C.field2 = 10;
		A.C.method2();
		
		a.method();
		
	}

}
