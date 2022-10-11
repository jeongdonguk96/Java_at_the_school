package sec02;

public class LongExample {

	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 10L;
		long var3 = 1000000000;
		long var4 = 1000000000L;
		long var5 = 123_456_789_123L;
//		long var5 = 123_456_789_123; 언더바가 없으면 출력 X
		
		System.out.println("var1 = "+var1);
		System.out.println("var2 = "+var2);
		System.out.println("var3 = "+var3);
		System.out.println("var4 = "+var4);
		System.out.println("var5 = "+var5);
	}
	
}
