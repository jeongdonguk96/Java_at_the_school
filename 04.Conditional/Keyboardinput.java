import java.util.Scanner;

public class Keyboardinput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력해 주세요. ");
		int num = scan.nextInt();
		System.out.println("입력한 정수는 " + num);
		
		System.out.print("문자열을 입력해 주세요. ");
		String str = scan.next();
		System.out.println("입력한 내용은 " + str);
		

	}
}