package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex6 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		System.out.print("정수를 입력하세요 : ");
		int num = Integer.parseInt(br.readLine());
		
		while(num!=0) {
			sum += num;
		
			System.out.print("정수를 입력하세요 : ");
			num = Integer.parseInt(br.readLine());
		}
		System.out.println("입력한 값의 합계는 " + sum + "입니다.");
	}
}