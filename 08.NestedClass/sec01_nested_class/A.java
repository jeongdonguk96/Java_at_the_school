package sec01_nested_class;

// 외부클래스 (Outer)
public class A {

	public A() {
		System.out.println("A객체가 생성됨.");
	}
	
	// 인스턴스 멤버 클래스(내부클래스)
	public class B {
		int field1; // 인스턴스 멤버 변수		
		B() {
			System.out.println("B객체가 생성됨.");
		}
		void method1() {}
	}
	
	// static 멤버 클래스(내부클래스)
	static class C {
		int field1; 
		static int field2;
			
		C(){
			System.out.println("C객체가 생성됨.");
		}
		void method1() {}
		static void method2() {}	
	}
	
	void method() {
		
		class D{
			D(){
				System.out.println("D객체가 생성됨.");
			}
			
			int field1;
			void method1() {}
		}
		
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
	
	
}
