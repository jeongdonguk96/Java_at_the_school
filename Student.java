package Exercise;

public class Student extends Person {

	private int numCourses = 0;
	private String[] courses = new String[30];
	private int[] grades= new int[30];
	
	public Student(String name, String adress) {
		
		super(name, adress);
		
	}
	
	public boolean addCourseGrade(String course, int grade) {
		
		if(numCourses<30) {
			for(int i=0; i<numCourses; i++) {
				if(course.equals(courses[i])) {
					System.out.printf("%s는 이미 신청한 과목입니다.\n", course);
					return false;
				}
			}
			numCourses++;
		} else {
			System.out.println("더이상 과목을 추가할 수 없습니다.");
			return false;
		}
		courses[numCourses-1] = course;
		grades[numCourses-1] = grade;
		return true;
		
	}
	
	public void printGrade() {
		
		System.out.println("**** 신청과목 ****");
		for(int i=0; i<numCourses; i++) {
			System.out.printf("%5s  %5d\n", courses[i], grades[i]);
		}
		
	}
	
	public double getAveragerGrade() {
		
		int sum = 0;
		
		for(int i=0; i<numCourses; i++) {
			sum += grades[i];
		}
		return (double)sum/numCourses;
		
	}

	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getAdress()=" + getAdress() + "]";
	}

}
