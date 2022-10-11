package sec01;
import java.util.Scanner;

public class SignOpEx {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		int c = -100;
		int result = +c;
		int result2 = -c;
		
		System.out.println("c = "+ c);
		System.out.println("result = "+ result);
		System.out.println("result2 = "+ result2);		

	}
}
