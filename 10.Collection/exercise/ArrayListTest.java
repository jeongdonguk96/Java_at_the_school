package exercise;

import java.util.*;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		// Student a = new Student(101, "홍길동", 25); 
		// list.add(a); 2줄을 한줄로 줄임
		list.add(new Student(101, "홍길동", 25));
		list.add(new Student(102, "이순신", 33));
		list.add(new Student(103, "장영실", 29));
		printList(list);
	}	
	
	public static void printList(ArrayList<Student> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.print("번호=" + list.get(i).getNo());
			System.out.print(", 이름=" + list.get(i).getName());
			System.out.print(", 나이=" + list.get(i).getAge());
			System.out.println();
		}
		
//		for(Student arr : list) { // 향상된 for문은 어떻게?
//			System.out.println(arr);
//		}
		
	}

}
