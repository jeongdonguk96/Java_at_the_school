package sec02_anonymous;

class Person {
	void wakeUp() {
		System.out.println("7시에 일어납니다.");
	}
}

class Student extends Person {

	@Override
	void wakeUp() {
		System.out.println("학생인 6시에 일어납니다.");
	}
	
}

class Anonymous {
	
	// 클래스명을 이용해 여러 개의 객체 선언
	Student s = new Student();
	Student s1 = new Student();
	
	// 익명클래스 생성 (객체생성처럼 보이지만 익명클래스 생성임)
	Person p = new Person() {
		int wakeup_time;

		@Override
		void wakeUp() {
			System.out.println("5시에 일어납니다.");
		}
		
		void work() {
			System.out.println("출근해요잉~");
		}
		
	};
	
	void method1() {
		p.wakeUp();
		
	}
	
}


public class PersonTest {

	public static void main(String[] args) {
		
		Anonymous a = new Anonymous();
		a.method1();

	}

}
