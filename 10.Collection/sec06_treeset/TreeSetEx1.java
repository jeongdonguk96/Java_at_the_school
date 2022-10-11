package sec06_treeset;

import java.util.*;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("flower");
		
		System.out.println("set = " + set);
		System.out.println("첫번째 데이터 = " + set.first());
		System.out.println("마지막 데이터 = " + set.last());
		System.out.println("disc의 headSet = " + set.headSet("disc"));
		System.out.println("disc의 tailSet = " + set.tailSet("disc"));
		System.out.println("set.lower(\"disc\") = " + set.lower("disc"));
		System.out.println("set.higher(\"disc\") = " + set.higher("disc"));
		System.out.println("set.floor(\"ddd\") = " + set.floor("ddd"));
		System.out.println("set.ceiling(\"ddd\") = " + set.ceiling("ddd"));
	}

}
