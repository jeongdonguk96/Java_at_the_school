package Exercise;

class Author {
	private String name;
	private String email;
	private char gender;

	Author(){}
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}	
}

public class AuthorTest {

	public static void main(String[] args) {
		
		Author author = new Author("Bret Spell", "Bspell@nowhere.com", 'm');
		System.out.println(author);
		author.setEmail("jungbo@nowhere.com");
		System.out.println("name is = " + author.getName());
		System.out.println("email is = " + author.getEmail());
		System.out.println("gender is = " + author.getGender());

	}

}
