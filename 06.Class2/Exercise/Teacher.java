package Exercise;

public class Teacher extends Person {

	public int numCourses = 0;
	public String[] courses = new String[5];
	
	public Teacher(String name, String adress){
		super(name, adress);
	}
	
	// 강의과목을 추가.
	public boolean addCourse(String course) {
		
		if(numCourses<5) {
			//이 반복문은 중복된 과목이 있는지 확인
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
		return true;
	}
	
	public boolean removeCourse(String course) {
		int removeIndex = 0; // 삭제한 배열을 저장할 변수
		if(numCourses>0) {
			for(int i=0; i<numCourses; i++) {
				if(course.equals(courses[i])){
					courses[i] = null; // 입력한 과목을 배열에서 제거
					removeIndex = i; // 삭제된 i번째 배열을 removeIndex에 저장
					break;					
				}
			}
			// 이 반복문은 배열에서 삭제된 공간으로 뒤에서부터 밀어넣음
			for(int i=removeIndex+1; i<numCourses; i++) {
				courses[i-1] = courses[i];
			}
			numCourses--;
			return true;
		} else {
			System.out.println("더이상 과목을 뺄 수 없습니다.");
			return false;
		}
		
	}
	
	public void printCourses() {
		
		System.out.println("**** 강의과목 ****");
		for(int i=0; i<numCourses; i++) {
			System.out.printf("%8s\n", courses[i]);	
		}
		
	}

	@Override
	public String toString() {
		return "Teacher [getName()=" + getName() + ", getAdress()=" + getAdress() + "]";
	}
	
}
