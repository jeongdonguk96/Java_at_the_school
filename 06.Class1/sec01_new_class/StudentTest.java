package sec01_new_class;

public class StudentTest {

	public static void main(String[] args) {
		
		// Studet는 클래스이자 타입
		// s1은 객체(인스턴스)이자 참조변수
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		
		
	}
}
