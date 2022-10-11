package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("몸무게를 입력해주세요 : ");
		int kg = Integer.parseInt(br.readLine()); // 70
		System.out.print("키를 입력해주세요 : ");
		float m = Float.parseFloat(br.readLine()); // 1.8
		float bmi = kg/(m*m);
		bmi = (int)(Math.round(bmi*10))/10f;
		System.out.println("bmi는 " + bmi + "입니다.");
		System.out.println((bmi>30) ? "비만입니다." : (bmi>25) ? "과체중입니다." : (bmi>18.5) ? "정상입니다." : "저체중입니다.");
		
	}
}