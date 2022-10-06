package sec11_static_instance_member;

class Student {
	
	int number;
	String name;
	
	static String collage = "한국대학교";
	
	public Student(int number, String name) {
		this.number = number;
		this.name = name;
	}
	
	public void display() {
		System.out.println(number + " " + name + " " + collage);
	}
	
}

public class StudentTest {

	public static void main(String[] args) {

		Student s1 = new Student(100, "홍길동");
		Student s2 = new Student(200, "안중근");
		
		s1.display();
		s2.display();
		
		System.out.println("");
		s1.collage = "미국대학교";
		
		s1.display();
		s2.display();

	}

}
