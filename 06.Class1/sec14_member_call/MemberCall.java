package sec14_member_call;

public class MemberCall {

	int iv = 10;
	static int cv = 10;
	
	// static 매서드(= 클래스 매서드)
	static void staticMethod() {
		System.out.println(cv);
		// System.out.println(iv); static매서드에서는 인스턴스변수를 참조할 수 없다.
	}
	
	// 인스턴스 매서드
	void instanceMethod() {
		System.out.println(iv);
		System.out.println(cv);
		// 스턴스매서드에서는 static변수를 참조할 수 있다.
	}
	
	// 테스트용 static 매서드
	static void staticMethod2() {
		// 같은 클래스 내의 static 매서드를 호출 / static매서드에서는 인스턴스매서드를 참조할 수 없다.
		staticMethod();
		
		// 같은 클래스 내의 인스턴스 매서드 호출 / 인스턴스매서드에서는 static매서드를 참조할 수 있다.
		// instacneMethod();
	}
	
	// 테스트용 인스턴스 매서드
	void instanceMethod2() {
		// 인스턴스매서드에서는 static매서드와 인스턴스매서드 둘 다 참조변수 없이 참조할 수 있다.
		staticMethod();
		instanceMethod();
	}
	
	public static void main(String[] args) {
		
		MemberCall mc = new MemberCall();
		
		staticMethod();
		// instanceMethod(); 인스턴스매서드라 메인매서드에서 참조 불가.
		mc.instanceMethod(); // 그래서 위에서 인스턴스를 만들어 준 후 인스턴스매서드로 사용(mc.instanceMethod();)
		
	}
}
