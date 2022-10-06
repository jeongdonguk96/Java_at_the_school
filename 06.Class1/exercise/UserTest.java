package exercise;

public class UserTest {

	public static void main(String[] args) {

		User user1 = new User("hong", 36);
		
//		user1.name = "Hong";
//		user1.age = 35;
		
		System.out.printf("사용자의 이름 = %s\n사용자의 나이 = %d\n", user1.name, user1.age);

		user1.printData();
	}

}
