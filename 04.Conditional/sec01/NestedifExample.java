package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NestedifExample {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수를 입력해 주세요 : ");
		
		int score = Integer.parseInt(br.readLine());
		
		System.out.println((score>=0 && score<=100) ? ((score>=90) ? ((score>=95) ? "평점은 A+ 입니다" : "평점은 A 입니다") : (score>=80) ? "평점은 B 입니다" : "평점은 C 입니다") : "잘못된 정수를 입력했습니다.");
		

	}
}