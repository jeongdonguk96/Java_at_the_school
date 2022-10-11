package sec02_hashset;

import java.util.*;

public class HashSetTest {

	public static void main(String[] args) {
		
		int[] arr1 = {1, 2, 3, 4};
		int[] arr2 = {3, 4, 5, 6};
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		Set<Integer> setKyo = new HashSet<>();
		Set<Integer> setCha = new HashSet<>();
		Set<Integer> setCha2 = new HashSet<>();
		Set<Integer> setHab = new HashSet<>();
				
		for(int arr : arr1) { // set1에 arr1을 집어넣는 반복문
			set1.add(arr);
		}
		System.out.println("set1 = " + set1);
		
		for(int arr : arr2) { // set2에 arr2를 집어넣는 반복문
			set2.add(arr);
		}
		System.out.println("set2 = " + set2);
		
		setKyo.addAll(set1);
		setKyo.retainAll(set2);
		System.out.println("set1과 set2의 교집합 = " + setKyo);
		
		setCha.addAll(set1);
		setCha.removeAll(set2);
		System.out.println("set1에서 set2를 뺀 차집합 = " + setCha);
		
		setCha2.addAll(set2);
		setCha2.removeAll(set1);
		System.out.println("set2에서 set1를 뺀 차집합 = " + setCha2);
		
		setHab.addAll(set1);
		setHab.addAll(set2);
		System.out.println("set1과 set2의 합집합 = " + setHab);
		
		/* 틀린 내 풀이법
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);	
		
		System.out.println("set1 = " + set1);
		System.out.println("set2 = " + set2);
		System.out.println();
		
//		set1.retainAll(set2); // set1과 set2의 교집합
//		System.out.println("set1과 set2의 교집합 = " + set1);
		
//		set1.removeAll(set2); // set1에서 set2를 뺀 교집합
//		System.out.println("set1에서 set2를 뺀 차집합 = " + set1);
//		
//		set2.removeAll(set1); // set2에서 set1을 뺀 교집합
//		System.out.println("set2에서 set1을 뺀 차집합 = " + set2);
		
		set1.addAll(set2);    // set1과 set2의 합집합
		System.out.println("set1과 set2의 합집합 = " + set1);
		*/
		
	}

}
