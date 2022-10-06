package sec02_hashset;

import java.util.*;

public class HashSetEx1 {

	public static void main(String[] args) {
		
		Set<String> fruit = new HashSet<>();
		
		// add매서드를 이용해 데이터를 추가
		fruit.add("APPLE");
		fruit.add("ORANGE");
		fruit.add("BANANA");
		
		// isEmpty매서드를 이용해 데이터공간이 비어있는지 확인
		System.out.println("isEmpty매서드를 이용해 fruit set이 비어있는지 확인 = " + fruit.isEmpty());
		
		// contains매서드를 이용해 특정 데이터가 있는지 확인
		System.out.println("contains매서드를 이용해 fruit에 APPLE데이터가 있는지 확인 = " + fruit.contains("APPLE"));
		System.out.println("contains매서드를 이용해 fruit에 MANGO데이터가 있는지 확인 = " + fruit.contains("MANGO"));
		
		// size매서드를 이용해 fruit의 항목갯수를 확인
		System.out.println("size매서드를 이용해 항목갯수를 확인 = " + fruit.size());
		
		// list에 들어 있는 데이터를 set에 한번에 추가
		List<String> list = new ArrayList<>();
		list.add("GRAPE");
		list.add("STRAWBERRY");
		list.add("MELON");	
		
		// addAll매서드를 이용해 list의 데이터를 set(fruit)에 추가 
		// set이기 때문에 순서가 아무런 상관없음
		fruit.addAll(list);
		System.out.println("fruit의 내용 = " + fruit);
		
		// 전체 데이터의 내용을 처리할 때
		Iterator<String> it = fruit.iterator(); // set의 전체 내용을 Iterator로 추출
		while(it.hasNext()) { // it객체에 처리할 데이터가 남아있는지 확인
			System.out.println(it.next());
		}
		
		// remove매서드를 이용해 데이터를 삭제
		fruit.remove("BANANA");
		System.out.println("remove매서드를 이용해 데이터 삭제 후 = " + fruit);
		
	}

}
