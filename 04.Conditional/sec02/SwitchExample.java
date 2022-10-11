package sec02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SwitchExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int user_type; // 0:손님, 1:일반사용자, 2:관리자
		System.out.print("이용자 유형을 선택하세요 : ");
		
		user_type = Integer.parseInt(br.readLine());
		
		switch(user_type) {
		case 0:
			System.out.println("손님입니다.");
			break;
		case 1:
			System.out.println("일반사용자입니다.");
			break;
		case 2:
			System.out.println("관리자입니다.");
			break;
		default:
			System.out.println("잘못된 사용자입니다.");
		}

	}
}