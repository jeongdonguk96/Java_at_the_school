package sec02_hashset_case3;

import java.util.*;

class Person {
	String name;
	int    age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return name + "=" + age;
	}		
	
	@Override
	public int hashCode() { // HashSet에 데이터 저장시 어디에 저장할지 판단하기 위해 사용
		return (name+age).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) { // 저장하려는 두개의 객체가 HashSet에 중복으로 저장됐는지 판단할 때 사용 
		if(obj instanceof Person) {
			Person tmp = (Person)obj;
			boolean result = name.equals(tmp.name) && age==tmp.age;
			return result;
		} else {
			return false;
		}
	}
	
}

public class HashSetSolution {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		
		set1.add("abc"); // .equals(), 정수에서는 ==을 사용해서 비교
		set1.add("abc"); // 이 케이스는 단순히 문자열이라 내용이 바로 비교가 돼서 오버라이딩을 안해줘도 되지만
		System.out.println(set1); // "abc"는 중복된 데이터라 하나만 저장
		
		set1.add(new Person("홍길동", 30)); // 이 케이스는 객체를 생성했기 때문에 주소가 달라서 내용이 같더라도
		set1.add(new Person("홍길동", 30)); // 중복으로 인식 못함. 그렇기 때문에 오버라이딩해줘야 함
		System.out.println(set1); // new연산자는 중복된 데이터로 읽지 못함
		
	}

}