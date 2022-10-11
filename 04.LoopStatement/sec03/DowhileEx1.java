package sec03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DowhileEx1 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		int num = 1;
		
		int sum = 0;
		
		do {
			System.out.print("정수를 입력하세요 : ");
			num = Integer.parseInt(br.readLine());
			sum += num;			
		} while (num!=0);
		System.out.println("입력한 값의 합계는 " + sum + "입니다.");
	}
}