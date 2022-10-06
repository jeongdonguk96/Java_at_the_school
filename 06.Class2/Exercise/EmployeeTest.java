package Exercise;

class Employee {
	
	private long baseSalary = 10000l;

	public long getBaseSalary() {
		return baseSalary;
	}
	
}

class Manager extends Employee {
	
	@Override
	public long getBaseSalary() {
		return super.getBaseSalary()+20000l;
	}
	
}

class Clerk extends Employee {
	
	@Override	
	public long getBaseSalary() {
		return super.getBaseSalary()+10000l;
	}
	
}

public class EmployeeTest {

	public static void main(String[] args) {
		
		Manager m = new Manager();
		Clerk c = new Clerk();
		System.out.println(m.getBaseSalary());
		System.out.println(c.getBaseSalary());

	}

}
