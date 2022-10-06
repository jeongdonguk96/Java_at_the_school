package sec04_super;

class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;

	void method() {
		System.out.println("x = " + x);
		System.out.println("this.x = " + this.x);
		System.out.println("super.x = " + super.x);
	}
		
}

// super() 부모의 생성자 호출
// super 부모의 멤버변수 참조

public class SuperTest {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method();

	}

}
