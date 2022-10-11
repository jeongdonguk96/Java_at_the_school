package sec01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ifElseifElseExample {

	public static void main(String[] args) throws IOException {
		 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		if(num>0) {
			System.out.println(num + "은 양수입니다.");
		} else if(num<0) {
			System.out.println(num + "은 음수입니다.");
		} else {
			System.out.println(num + "은 0입니다.");
		}
		System.out.println("프로그램을 종료합니다.");

	}
}
