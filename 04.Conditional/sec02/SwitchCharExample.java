package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchCharExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		char member_grade; // S/s : 최우수회원, A/a : 우수회원, B/b : 일반회원
		
		System.out.print("회원 유형을 선택하세요 : ");
		
		member_grade = (char) br.read();
		
		switch(member_grade) {
		case 'S' :
		case 's' :
			System.out.println("최우수 회원입니다.");
			break;
			
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default :
			System.out.println("손님입니다.");
		}
				
	}
}
