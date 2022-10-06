package sec17_final_field;

class Person {
	
	final String nation = "Korea";
	final String number;
	String name;
	
	public Person(String number, String name) {
		
		this.number = number;
		this.name = name;
		
	}
	
	
}

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person("123456-1234567", "홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.number);
		System.out.println(p1.name);
		
		Person p2 = new Person("123216-0321567", "김순희");
		System.out.println(p2.nation);
		System.out.println(p2.number);
		System.out.println(p2.name);
		
	}

}
