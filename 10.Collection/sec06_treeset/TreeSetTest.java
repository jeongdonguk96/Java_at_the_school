package sec06_treeset;

import java.util.*;

public class TreeSetTest {

	public static void main(String[] args) {
		int[] score = {80,95,50,35,45,65,10,100};
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int intset : score) {
			set.add(intset);
		}
		
		System.out.println("set = " + set);
		System.out.println("50보다 큰 데이터를 출력하는 tailset(higher) = " + set.tailSet(set.higher(50)));
		System.out.println("50보다 적은 데이터를 출력하는 headset = " + set.headSet(50));
	}

}
