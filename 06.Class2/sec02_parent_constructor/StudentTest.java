package sec02_parent_constructor;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", "123456-1234567", 1);
		
		System.out.println("name = " + s1.getName());
		System.out.println("idNum = " + s1.getIdNum());
		System.out.println("stuNum = " + s1.getStuNum());
		
		

	}

}
