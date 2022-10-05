package sec04_wildcard;

import java.util.*;

public class WildcardTest {

	public static void main(String[] args) {
		
		List<Object> objList = new ArrayList<Object>();
		objList.add(Integer.valueOf(55));
		objList.add(Integer.valueOf(47));
		printList(objList);
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(00);
		intList.add(00);
		printList(intList);
		
		List<String> strList = new ArrayList<String>();
		strList.add("Abc");
		strList.add("Def");
		printList(strList);
		
	}
	
//	public static void printList(List<Object> list) { 
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
