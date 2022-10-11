package sec01_arraylist;

import java.util.*;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<>(); // 컴파일러가 앞의 내용을 근거로 추정해 자동으로 변환해줌
		
		// list1에 데이터 추가
		list1.add(5); // 오토박싱으로 원시형인 5가 참조형인 5로 자동변환
		list1.add(4);
		list1.add(1);
		list1.add(2);
		System.out.println("list1 = " + list1);
		
		// index 3번째 자리에 3추가
		list1.add(3, 3);
		System.out.println("list1 = " + list1);
		
		// 3번째 index의 내용을 변경
		list1.set(3, 6);
		System.out.println("list1 = " + list1);
		System.out.println();
		
		// list2에 데이터 추가
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(4);
		System.out.println("list2 = " + list2);
		System.out.println("5가 저장된 인덱스 = " + list2.indexOf(5));
		System.out.println("4가 저장된 최후의 인덱스 = " + list2. lastIndexOf(4));
		System.out.println("list2의 항목 수 = " + list2.size());
		System.out.println("list2의 sublist = " + list2.subList(1, 3));
		
		// list2의 내용을 배열로 변환
		Object[] arr = list2.toArray();
		for(Object obj : arr) {
			System.out.print(obj + " ");
		}
		System.out.println();
		System.out.println();
		
		// list1에서 list2에 있는 값만 남기고 나머지는 제거
		list1.retainAll(list2);
		System.out.println("list1.retainAll(list2) = " + list1);
		System.out.println();
		
		// list2에 3이라는 값이 있는지 확인
		System.out.println("list2.contains(3) = " + list2.contains(3));
		System.out.println();
		
		// list1에서 0번 index 내용 삭제
		list1.remove(0);
		System.out.println("0번 인덱스 삭제 후 list1 = " + list1);
		System.out.println("0번 인덱스의 내용 = " + list1.get(0));
		
		
		// list1의 모든 내용 삭제
		list1.clear();
		System.out.println("모든 인덱스 삭제 후 list1 = " + list1);
		
	}

}
