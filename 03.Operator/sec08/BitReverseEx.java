package sec08;

public class BitReverseEx {

	public static void main(String[] args) {
		
		int val1 = 10;
		int val2 = ~val1;
		int val3 = val2 + 1; // 10의 음수값 표현
		
		System.out.printf("val1 = %d (%s)\n", val1, toBianry(val1));
		System.out.printf("val2 = %d (%s)\n", val2, toBianry(val2));
		System.out.printf("val3 = %d (%s)\n", val3, toBianry(val3));

	}
//	입력한 정수를 2진수 문자열로 변환
	public static String toBianry(int value) {
//	value 정수를 2진수 문자열로 변환
		String result = Integer.toBinaryString(value);
		
		// 2진수로 변환된 자리수가 32비트(1바이트)가 되도록 0을 채워줌
		while(result.length() < 32) {
			result = "0" + result;
		}
		return result;
	}

	
}
