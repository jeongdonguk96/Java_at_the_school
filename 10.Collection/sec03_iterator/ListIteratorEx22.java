package sec03_iterator;

import java.util.*;

public class ListIteratorEx22 {

	public static void main(String[] args) {
		Set<String> list1 = new HashSet<>();
		
		list1.add("리순신");
		list1.add("장령실");
		list1.add("장버거");
		list1.add("류관순");
		list1.add("안창오");
		
		Iterator<String> lit = list1.iterator(); // set속의 데이터를 순서상관없이 마구잡이로 출력
		while(lit.hasNext()) { 
			System.out.println(lit.next());
		}
				
	}

}
