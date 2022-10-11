package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("원하는 요일의 날짜를 입력해주세요. ");
//		int day;
		int day = Integer.parseInt(br.readLine());
//		day = Integer.parseInt(br.readLine());
		
		switch(day) {
		case 0 :
			System.out.println("오늘은 일요일입니다.");
		break;
		case 1 :
			System.out.println("오늘은 월요일입니다.");
		break;
		case 2 :
			System.out.println("오늘은 화요일입니다.");
		break;
		case 3 :
			System.out.println("오늘은 수요일입니다.");
		break;
		case 4 :
			System.out.println("오늘은 목요일입니다.");
		break;
		case 5 :
			System.out.println("오늘은 금요일입니다.");
		break;
		case 6 :
			System.out.println("오늘은 토요일입니다.");
		break;
		default:
			System.out.println("존재하지 않는 요일입니다.");
		}
	
	}
}
