package exercise;

import java.util.LinkedList;

public class LinkedListTest { // LinkedList 객체에 1~100사이의 난수 10개를 넣고 지정하는 인덱스 교환하는 문제

	public static void main(String[] args) {
				
		
		LinkedList<Integer> list = new LinkedList<>();
		
		for(int i=0; i<10; i++) { // list에 값을 저장하는 방법으로는 이것이 가장 보편적
			list.add((int)(Math.random()*100+1));
		}
		
		System.out.println("교환 전 리스트 \n" + list);
		changeItem(list);
		System.out.println("교환 후 리스트 \n" + list);
		
	}
	
	public static void changeItem(LinkedList<Integer> list) { // 원하는 Index를 교환하는 매서드
		int tmp = list.get(3);
		list.set(3, list.get(4));
		list.set(4, tmp);		
	}
	
}
