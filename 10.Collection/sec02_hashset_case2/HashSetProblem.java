package sec02_hashset_case2;

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
}

public class HashSetProblem {

	public static void main(String[] args) {
		HashSet set1 = new HashSet();
		
		set1.add("abc"); // .equals(), 정수에서는 ==을 사용해서 비교
		set1.add("abc");
		System.out.println(set1); // "abc"는 중복된 데이터라 하나만 저장
		
		set1.add(new Person("홍길동", 30)); 
		set1.add(new Person("홍길동", 30));
		System.out.println(set1); // new연산자는 중복된 데이터로 읽지 못함
		
	}

}
