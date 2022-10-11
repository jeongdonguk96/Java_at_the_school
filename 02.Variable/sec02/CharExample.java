package sec02;

public class CharExample {

	public static void main(String[] args) {
		
		char c1 = 'A';
		int code = c1;
		char c2 = '가';
		int code2 = c2;
		char c3 = '\uac00';
		int code3 = c3;
		
		System.out.println("c1 = "+c1);
		System.out.println("code = "+code);
		System.out.println("c2 = "+c2);
		System.out.println("code2 = "+code2);
		System.out.println("c3 = "+c3);
		System.out.println("code3 = "+code3);
	}

}
