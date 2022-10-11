package sec07_comparable;

import java.util.*;

class Person implements Comparable<Person> { // String이나 int는 기본적으로 Comparable 인터페이스가 있지만
	public String name;						 // 새로운 참조타입을 쓸 때는 Comparable인터페이스를 구현해야 한다.
	public int age;
	
	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

//	@Override
//	public int compareTo(Person p) { // Person타입의 본인과 들어올 객체를 int age로 비교하는 매서드
//		if(age < p.age) {
//			return -1;
//		} else if(age == p.age) {
//			return 0;
//		} else {
//		return 1;
//		}
//	}
	
	@Override
	public int compareTo(Person p) { // Person타입의 본인과 들어올 객체를 String name으로 비교하는 매서드
		return name.compareTo(p.name); // String타입에 포함된 compareTo() 매서드를 사용
	}
	
}

public class ComparableTest {

	public static void main(String[] args) {
		TreeSet<Person> tSet = new TreeSet<>();
		
		tSet.add(new Person("이순신", 33)); 
		tSet.add(new Person("홍길동", 19));
 		tSet.add(new Person("장보고", 41));
 		
		Iterator<Person> it = tSet.iterator();
		while(it.hasNext()) {
			Person p = it.next();
			System.out.printf("%s : %d\n", p.name, p.age);
		}
	}

}
