package exercise;

class Employee{
	
	int id;
	String firstName;
	String lastName;
	int salary;

	Employee(){}
	
	Employee(int id, String firstName, String lastName, int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getID() {
		return id;
	}
	
	public String getFirtstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getName() {
		return firstName+lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualSalary() {
		return salary*12;
	}
	
	public int raiseSalary(int percent) {
		int raise = (int)(salary*(percent/100.0f));
		salary += raise; // 급여 인상분을 저장!!!!!
		return salary;
		// return salary + (int)(salary*(percent/100.0f))는 안됨.
		// 리턴값을 반환은 하지만 저장이 안되서 헛도는 식. 그래서 salary += raise;로 저장해야함!!
	}
	
	public String toString() {
		return "이 사람의 id는 " + id + ", 이름은 " + getName() + ", 급여는 " + salary + ", 연봉은 "+ getAnnualSalary() + "원이다"; 
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "김", "철수", 1000000);
		Employee e2 = new Employee(101, "이", "영희", 1100000);
		Employee e3 = new Employee(102, "홍", "길동", 1300000);
		
		System.out.println(e1);
		System.out.println("");
		
		e1.raiseSalary(15);
		
		System.out.println(e1);
		System.out.println("");
		
		Employee[] eArr = new Employee[3];
		eArr[0] = new Employee(103, "이", "순신", 2000000);
		eArr[1] = e2;
		eArr[2] = e3;
		
//		for(int i=0; i<e.length; i++) {
//			System.out.println(e[i].toString());
//		}
		
		for(Employee e : eArr) {
			System.out.println(e);		}

	}
	
}
