package exercise;

import java.util.*;

class Book {
	
	private int id;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	
	public Book() {
	}

	public Book(int id, String name, String author, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		return (name+author).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book tmp = (Book)obj;
			boolean result = (name.equals(tmp.name) && author.equals(tmp.author));
			return result;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", quantity="
				+ quantity + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

public class HashSetBookTest {

	public static void main(String[] args) {
		
		Set<Book> books = new HashSet<>();
		books.add(new Book(3, "할머니는 죽지 않는다", "공지영", 11));
		books.add(new Book(5, "할머니는 죽지 않는다", "공지영", 11)); // 해시코드와 이퀄스가 오버라이딩돼서 중복확인
		books.add(new Book(72, "기린의 날개", "게이고", 20));
		books.add(new Book(38, "하이든", "아랑고", 19));
		books.add(new Book(50, "아몬드", "손원평", 32));
											  // Set은 전체 내용을 불러와서 읽을 방법이 없음
		Iterator<Book> it = books.iterator(); // Set의 내용을 출력하는 가장 보편적인 방법
		while(it.hasNext()) { 
			System.out.println(it.next());
		}

	}

}
