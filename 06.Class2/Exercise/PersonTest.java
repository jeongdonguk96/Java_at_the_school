package Exercise;

public class PersonTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("홍길동", "신림동");
		s1.addCourseGrade("국어", 97);
		s1.addCourseGrade("수학", 95);
		s1.addCourseGrade("사회", 87);
		s1.addCourseGrade("과학", 85);
		s1.addCourseGrade("사회", 87);
		
		System.out.println("------------------");
		s1.printGrade();
		System.out.println("------------------");
		System.out.printf("평균은 = %s입니다.\n",s1.getAveragerGrade());
		System.out.println("------------------");
		System.out.println(s1);
		System.out.println("------------------");
		
		Teacher t1 = new Teacher("김민수", "대림동");
		t1.addCourse("국어");
		t1.addCourse("수학");
		t1.addCourse("사회");
		t1.addCourse("과학");
		t1.addCourse("영어");	
		
		t1.printCourses();
		System.out.println("------------------");
		t1.removeCourse("영어");
		System.out.println("** 삭제 후 과목 **");
		t1.printCourses();
		System.out.println("------------------");
		System.out.println(t1);
		
	}

}
