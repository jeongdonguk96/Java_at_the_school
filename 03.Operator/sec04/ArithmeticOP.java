package sec04;
public class ArithmeticOP {
	public static void main(String[] args) {
		
		int a1 = 14;
		int a2 = 5;
		int result = 0;
		
		/* 1 */ result = a1 + a2;
		System.out.println("1. a1 + a2 = " + result);
		System.out.println("");
		
		/* 2 */ result = a1 / a2; // => 떨어진 값
		System.out.println("2. a1 / a2 = " + result);
		System.out.println("");
		
		/* 3 */ result = a1 % a2; // => 떨어진 나머지
		System.out.println("3. a1 % a2 = " + result);
		System.out.println("");
		
		/* 4 */ double result2 = (double)a1 / a2;
		System.out.println("4. a1 / a2 = " + result2);
		System.out.println("");
		
		/* 5 */ int i = 10;
		float f = 20.0f;
		float result3 = f + i;
		System.out.println("5. result2 = " + result3);
		System.out.println("");
		
//		자동 형변환.
//		byte, short, char -> int로 변환돼 계산에 참여.
		
		/* 6, 7 */ short s = 100;
		byte b = 50;
		result = s + b;
		short s2 = (short)(s + b);
		System.out.println("6. result = " + result);
		System.out.println("");
		System.out.println("7. s2 = " + s2);
		System.out.println("");
		
//		char 타입의 산술 연산
		
		/* 8, 9 */ char c1 = 'A' + 1; 
		System.out.println("8. c1 = " + c1);
		System.out.println("");
		result = 'A' + 1;
		System.out.println("9. c2 = " + result);
		System.out.println("");
		
//		문자의 산술 연산
		/* 10 */ int x = 'B' - 'A';
		System.out.println("10. x = " + x);
		System.out.println("");
		
//		'0'(char) 과 0(int)은 다르다. '0'은 아스키표에서 48
		/* 11 */ x = '2' - '0';
		System.out.println("11. x = " + x);
		System.out.println("");
		
//		나머지의 연산결과 부호
		/* 12, 13 */ result = 10 % -8;
		System.out.println("12. 10 % 8 = " + result);
		System.out.println("");
		result = -10 % 8;
		System.out.println("13. 10 % 8 = " + result);
		System.out.println("");
		
		
	}
}
