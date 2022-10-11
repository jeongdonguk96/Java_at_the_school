package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

	public class Ex7 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			int n = (int)(Math.random()*10)+1;  // 컴퓨터가 생성한 숫자
			int i = 1; // 내가 입력하는 숫자
				
			do {
				System.out.print("숫자를 맞춰보세요 (1~10) : ");
				i = Integer.parseInt(br.readLine());
				if (!(i>=1 && i<=10)) {
					System.out.println("잘못된 숫자를 입력했습니다.");
					continue;
				}
				if (i!=n) {
					System.out.println(i + "는(은) 틀렸습니다.");
				}
			} while (i!=n);
			System.out.println("정답입니다!");
		
	}
}