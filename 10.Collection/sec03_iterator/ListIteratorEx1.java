package sec03_iterator;

import java.util.*;

public class ListIteratorEx1 {

	public static void main(String[] args) {
		List<String> list1 = new LinkedList<>(); // ListIterator은 set클래스가 아니라 list클래스
		
		list1.add("리순신");
		list1.add("장령실");
		list1.add("장버거");
		list1.add("류관순");
		list1.add("안창오");
		
		ListIterator<String> lit = list1.listIterator();
		while(lit.hasNext()) { // list를 순서대로 출력
			System.out.println(lit.next());
		}
		
		System.out.println();
		
		while(lit.hasPrevious()) { // list를 역순으로 출력
			System.out.println(lit.previous());
		}
		
		System.out.println();
		
		System.out.println(list1);
		
	}

}
