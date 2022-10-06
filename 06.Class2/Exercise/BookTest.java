package Exercise;

class Book {
	Author[] author = new Author[2];
	String name;
	int price;
	int qty = 0;
	

	Book(String name, Author[] author, int price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, Author[] author, int price, int qty) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public Author[] getAuthor() {
		return author;
	}
	
	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}
	
	public int getQty() {
		return qty;
	}
	
	public String getAuthorName() {
		if(getAuthorName().equals(author[0])) {
			return author[0].getName();	
		} else {
			return author[1].getName();
		}
		
	}
	
	public String getAuthorEmail() {
		if(getAuthorEmail().equals(author[0])) {
			return author[0].getEmail();	
		} else {
			return author[1].getEmail();
		}
	}
	
//	public char getAuthorGender() {
//		if(getAuthorGender().equals(author[0])) {
//			return author[0].getGender();	
//		} else {
//			return author[1].getGender();
//		}
//	}
	

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public String toString() {
		if(toString().equals(author[0])) {
		return "Book [name=" + name + ", Author [name=" + author[0].getName() + ", email="
				+ author[0].getEmail() + ", gender=" + author[0].getGender() + "]" + ", price=" 
				+ price + ", qty=" + qty + "]";
		} else {
			return "Book [name=" + name + ", Author [name=" + author[1].getName() + ", email="
					+ author[1].getEmail() + ", gender=" + author[1].getGender() + "]" + ", price=" 
					+ price + ", qty=" + qty + "]";
		}

	}
}

public class BookTest {

	public static void main(String[] args) {
		
		Author[] author1 = {
				new Author("Brett Spell", "BSpell@somewhere.com", 'm'),
				new Author("Paul Ahn", "Paul@nowhere.com", 'm')
		};
		
		Author author = new Author("Bret Spell", "BSpell@nowhere.com", 'm');
		System.out.println(author);
		Book dummyBook = new Book("Pro JAVA 8 Programming", author1, 30000, 99);
		System.out.println(dummyBook);

		
		System.out.println(dummyBook.getAuthorName());
		System.out.println(dummyBook.getAuthorEmail());
		
	}

}

