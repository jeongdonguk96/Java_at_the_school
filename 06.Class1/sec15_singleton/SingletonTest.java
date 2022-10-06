package sec15_singleton;

class TheCalendar {
	
	// 클래스 선언 시 자신의 객체를 클래스 내부에 미리 만들어 둠.
	private static TheCalendar singleton = new TheCalendar();
	
	// 외부에서 수정하지 못하도록 잠굼.
	private TheCalendar() {}
	
	// 위에서 생성한 singleton이라는 객체의 주소를 반환.
	static TheCalendar getInstance() {
		return singleton;
	}
	
}

public class SingletonTest {

	public static void main(String[] args) {
		
//		TheCalendar c1 = new TheCalendar();		
		
		TheCalendar c1 = TheCalendar.getInstance();
		TheCalendar c2 = TheCalendar.getInstance();
		
		if(c1==c2) {
			System.out.println("c1과 c2는 같은 주소를 사용합니다.");
		} else {
			System.out.println("c1과 c2는 다른 주소를 사용합니다.");
		}
		
	}

}
