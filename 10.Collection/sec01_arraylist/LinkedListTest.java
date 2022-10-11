package sec01_arraylist;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> aList = new LinkedList<>();
		LinkedList<String> bList = new LinkedList<>();
		
		String[] alphabet = {"A", "B", "C", "D", "E"};
		
		for(String arr : alphabet) {
			aList.add(arr);
		}
		System.out.println("aList = " + aList);
		
		bList = (LinkedList<String>) aList.clone(); // aList를 복사, Object로 인식돼서 형변환 필수
		System.out.println("bList = " + bList);
		
		for(int i=0; i<bList.size(); i++) {
			System.out.println(aList.peek()); // peek()은 제일 첫 배열이 나오는 매서드
			aList.poll(); // poll()은 제일 첫 배열을 삭제하는 매서드
		}
		
		bList.addFirst("F"); // addFirst()는 제일 첫 배열에 ()를 추가하는 매서드
		System.out.println("bList = " + bList);
		
		
	}

}
