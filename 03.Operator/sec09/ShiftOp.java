package sec09;

public class ShiftOp {

	public static void main(String[] args) {
		
		int dec = 12; // 2진수르 1100
//		int dec = -12; // 2진수르 1100
		
		System.out.printf("dec=%d(%s)\n", dec, toBianry(dec)); // 정수 12는 2진수로 1100
		System.out.printf("dec<<1=%d(%s)\n", (dec<<1), toBianry(dec<<1)); // 2진수로 00011000 정수로 24
		System.out.printf("dec>>2=%d(%s)\n", (dec>>2), toBianry(dec>>2)); // 2진수로 00000011 정수로 3
		System.out.printf("dec>>>2=%d(%s)\n", (dec>>>2), toBianry(dec>>>2)); // 2진수로 00000011 정수로 3
		
	}
	
	// 입력한 정수를 2진수 문자열로 변환
	public static String toBianry(int value) {
	    // value 정수를 2진수 문자열로 변환
		String result = Integer.toBinaryString(value);
		
		// 2진수로 변환된 자리수가 32비트(1바이트)가 되도록 0을 채워줌
		while(result.length() < 32) {
			result = "0" + result;
		}
		return result;
	}

}
