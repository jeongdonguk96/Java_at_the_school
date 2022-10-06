package sec02_parent_constructor;

public class Student extends People {
	
	private int stuNum;
	
	public Student(String name, String idNum, int stuNum) {
		
		super(name, idNum);  // 부모의 생성자를 호출해서 초기화, people클래스에서 매개변수가 2개 였어서 여기도 2개
		this.stuNum = stuNum;
		
	}

	public int getStuNum() {
		return stuNum;
	}

	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
}
