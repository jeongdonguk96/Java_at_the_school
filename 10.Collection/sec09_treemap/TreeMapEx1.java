package sec09_treemap;

import java.util.*;

class Book {
	String name;
	String author;
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + "]";
	}
}

public class TreeMapEx1 {
	
	public static void main(String[] args) {
		
		Map<Integer, Book> map = new TreeMap<>();
		
		map.put(101, new Book("1984", "조지오웰"));
		map.put(102, new Book("엄마 어디 갔지?", "박성우"));
		map.put(103, new Book("넘버스 스틱", "칩 히스"));
		
		Set<Map.Entry<Integer, Book>> entry = map.entrySet(); // entrySet을 이용해 Map을 Set에 넣기
		
		for(Map.Entry<Integer, Book> item : entry) {
			System.out.printf("%d : %s\n", item.getKey(), item.getValue());
		}
		
	}

}
