package sec09_instanceof;

class Parent {
	
}

class Child extends Parent {
	
}

public class InstanceOfTest {

	public static void main(String[] args) {
		
		System.out.println("<<Child타입의 객체를 부모 참조변수에 대입>>");
		Parent parentA = new Child(); // 업캐스팅
		method2(parentA);
		method1(parentA);
		
		System.out.println("<<Parent타입의 객체를 부모 참조변수에 대입>>");
		Parent parentB = new Parent();
		method2(parentB);
		method1(parentB);
		
	}

	// Instanceof를 사용하지 않았을 때
	public static void method1(Parent parent) {
		Child child = (Child)parent; // 다운캐스팅
		System.out.println("method1 : Child타입으로 변환 성공");
	}
	
	// Instanceof를 사용했을 때
	public static void method2(Parent parent) {
		// parent 객체가 Child타입의 참조변수로 변환가능한지 확인
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method1 : Child타입으로 변환 성공");
		} else {
			System.out.println("method2 : Child타입으로 변환 불가");
		}
	}
	
}
