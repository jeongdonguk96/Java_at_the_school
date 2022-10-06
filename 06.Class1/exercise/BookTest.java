package exercise;

class Book {
	
	String title;
	String author;
	long price;
	
	Book(){}
	
	Book(String title, String author, long price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(Book other) {
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public String toString() {
		return "이 책의 제목은 " + getTitle() + ", 저자는 " + getAuthor() + ", 가격은 " + getPrice();
	}
	
}

public class BookTest {

	public static void main(String[] args) {
		
		Book b0 = new Book();
		Book b1 = new Book("이것이 자바다", "신용권", 19900);
		Book b2 = new Book("이것이 오라클다", "정용진", 39900);
		Book b3 = new Book(b2);
		
		System.out.println(b0);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3.toString());
//		System.out.println("b1책의 제목은 " + b1.getTitle() + ", 저자는 " + b1.getAuthor() + ", 가격은 " + b1.getPrice());
//		System.out.println("b2책의 제목은 " + b2.getTitle() + ", 저자는 " + b2.getAuthor() + ", 가격은 " + b2.getPrice());
	
		b0.setTitle("이것이 Server다");
		b0.setAuthor("이진모");
		b0.setPrice(79900);
		
		System.out.println(b0);
		
	}

}
