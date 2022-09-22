package sec04;

import java.util.Arrays;

public class StringArray {

	public static void main(String[] args) {
		
		String[] str = new String[3];
		str[0] = "홍길동";
		str[1] = new String("이순신");
		str[2] = "유관순";
		
		String[] str2 = {"2홍길동2", "2이순신2", "2유관순2"};
		String[] str3 = {"2홍길동2", "2이순신2", "2유관순2", "2안창호2", "2김구2"};
		
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println();
		
		for(int i=0; i<str.length; i++) {
		System.out.println(str2[i]);
		}		
		
	}
}